package nitin.spring.crudDemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import nitin.spring.crudDemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	//define the field for entityManager
	
	private EntityManager entityManager;
	
	//set up constructor injection(constructor injection)
	@Autowired
	public EmployeeDAOHibernateImpl( EntityManager theEntityManager) {
		entityManager =theEntityManager	;
	}
	
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		
		// create a query, we are using native Hibernate api
		Query<Employee> theQuery = 
				currentSession.createQuery("from Employee",Employee.class);
		
		// execute query and get result list
		List<Employee> employees = theQuery.getResultList();
		
		// return the results
		return employees;
	}

}
