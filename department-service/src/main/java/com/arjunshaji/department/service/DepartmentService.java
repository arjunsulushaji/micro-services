package com.arjunshaji.department.service;

import com.arjunshaji.department.entitiy.Department;
import com.arjunshaji.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Object saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Object getDepartmentByCode(String code) {
        return departmentRepository.findByDepartmentCode(code);
    }
}
