package nitin.spring.crudDemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import nitin.spring.crudDemo.entity.Employee;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
	entityManager = theEntityManager;	
	}
	
	@Override
	public List<Employee> findAll() {
		// create query
		Query theQuery=
				entityManager.createQuery("from employee");
		
		// execute query and get list
		List<Employee> employees = theQuery.getResultList();
		
		//return result
		return employees;
	}
      
	@Override
	public Employee findById(int theId) {
		
		return null;
	}
	
	@Override
    public Employee save(Employee theEmployee) {
		
		return null;
    }
	
	
}
