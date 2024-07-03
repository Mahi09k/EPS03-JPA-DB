package com.model;

import javax.ejb.Remote;

import com.entity.EmployeeEntity;

@Remote
public interface RemoteEmployee {
	public String insert(EmployeeEntity E)

}
