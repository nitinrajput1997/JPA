package nitin.spring.crudDemo.dao;

import java.util.List;

import nitin.spring.crudDemo.entity.Employee;

public interface EmployeeDAO {
     
	public List<Employee> findAll();

	Employee findById(int theId);
}
