package com.model;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.entity.EmployeeEntity;

@Stateless
@TransactionManagement(value=TransactionManagementType.BEAN)
public class EmployeeModel implements RemoteEmployee {

	@Override
	public String insert(EmployeeEntity E) {
		EntityManagerFactory emf = Persistance.createEntityMangerFactory("ESP");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		return "Inserted Sucessfully";
	}

}
