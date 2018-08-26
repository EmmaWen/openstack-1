package com.openstack_4j.network.service.impl;

import com.openstack_4j.network.dao.EmployeeMapper;
import com.openstack_4j.network.model.Employee;
import com.openstack_4j.network.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getAll() {
        return employeeMapper.selectAll();
    }
}
