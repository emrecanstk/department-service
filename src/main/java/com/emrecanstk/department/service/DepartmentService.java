package com.emrecanstk.department.service;


import com.emrecanstk.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
}
