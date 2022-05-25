package com.emrecanstk.department.controller;


import com.emrecanstk.department.entity.Department;
import com.emrecanstk.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    public Department saveDepartment(Department department) {
        return departmentService.saveDepartment(department);
    }
}
