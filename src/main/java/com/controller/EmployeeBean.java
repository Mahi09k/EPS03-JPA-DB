package com.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.ejb.EJB;

import com.entity.EmployeeEntity;
import com.model.RemoteEmployee;

@ManagedBean(name="emp", eager=true)
@SessionScoped
public class EmployeeBean {
    private int eid;
    private String ename;
    private double esal;
    private String resultMessage; // Added property for result message
    
    @EJB(mappedName = "java:global/EPS03-JPA-DB/EmployeeModel!com.model.RemoteEmployee")
    private RemoteEmployee re;

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
    
    public String getResultMessage() {
        return resultMessage;
    }
    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }
    
    public void callEjbInsert() {
        EmployeeEntity E = new EmployeeEntity();
        E.setEid(eid);
        E.setEname(ename);
        E.setEsal(esal);
        
        try {
            String res = re.insert(E);
            setResultMessage(res);
        } catch (Exception e) {
            setResultMessage("Insertion failed: " + e.getMessage());
        }
    }
}
