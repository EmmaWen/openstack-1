package com.openstack_4j.network.controller;


import com.openstack_4j.network.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/hello")
    public String test(Model model) {
        model.addAttribute("employeeList", employeeService.getAll());
        return "test";
    }
}
