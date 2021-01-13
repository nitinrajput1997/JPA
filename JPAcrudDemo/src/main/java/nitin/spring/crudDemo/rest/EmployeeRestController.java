package nitin.spring.crudDemo.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nitin.spring.crudDemo.dao.EmployeeDAO;
import nitin.spring.crudDemo.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

	private EmployeeDAO employeeDAO;
	
	//inject employee DAO(constructor injection)
	@Autowired
	public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
	   employeeDAO = theEmployeeDAO;
	}
	
	// expose "/employee" and return list of employee
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeDAO.findAll();
	}
	
	
}
