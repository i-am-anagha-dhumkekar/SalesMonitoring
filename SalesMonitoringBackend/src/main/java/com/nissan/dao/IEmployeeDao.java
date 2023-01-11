package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.nissan.model.Employee;

public interface IEmployeeDao extends JpaRepositoryImplementation<Employee, Integer>  {

}
