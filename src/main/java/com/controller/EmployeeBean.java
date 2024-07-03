package com.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="emp", eager=true)
public class EmployeeBean {
	int eid;
	String ename;
	double esal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
}
