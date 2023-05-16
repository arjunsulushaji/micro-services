package com.arjunshaji.department.controller;

import com.arjunshaji.department.entitiy.Department;
import com.arjunshaji.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Object saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{deptCode}")
    public Object getDepartmentByCode(@PathVariable("deptCode") String code){
        return departmentService.getDepartmentByCode(code);
    }
}
