package com.arjunshaji.user.service;

import com.arjunshaji.user.entity.User;
import com.arjunshaji.user.model.Department;
import com.arjunshaji.user.model.ResponseTemplate;
import com.arjunshaji.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Object saveUser(User user) {
        User user1 = User.builder()
                .name(user.getName())
                .sem(user.getSem())
                .deptCode(user.getDeptCode())
                .build();
        return userRepository.save(user1);
    }

    public ResponseTemplate getUserWithDepartment(String code) {
        ResponseTemplate responseTemplate = new ResponseTemplate();
        User user = userRepository.findByDeptCode(code);

        Department department = restTemplate.getForObject("http://localhost:1000/department/" + user.getDeptCode(), Department.class);

        responseTemplate.setUser(user);
        responseTemplate.setDepartment(department);
        return responseTemplate;
    }
}
