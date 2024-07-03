package com.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="employee")
public class EmployeeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
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
