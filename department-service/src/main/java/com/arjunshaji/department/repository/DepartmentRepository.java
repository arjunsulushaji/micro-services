package com.arjunshaji.department.repository;

import com.arjunshaji.department.entitiy.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Object findByDepartmentCode(String code);
}
