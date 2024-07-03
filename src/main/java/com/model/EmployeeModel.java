package com.model;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import com.entity.EmployeeEntity;

@Stateless
@TransactionManagement(value=TransactionManagementType.BEAN)
public class EmployeeModel implements RemoteEmployee {

	@Override
	public String insert(EmployeeEntity E) {
		
		return "Inserted Sucessfully";
	}

}
