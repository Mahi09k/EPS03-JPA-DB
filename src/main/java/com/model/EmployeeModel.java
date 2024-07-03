package com.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entity.EmployeeEntity;

@Stateless
public class EmployeeModel implements RemoteEmployee {

    @PersistenceContext(unitName = "EPS03-JPA-DB")
    private EntityManager em;

    @Override
    public String insert(EmployeeEntity E) {
        em.persist(E);
        return "Inserted Successfully";
    }
}
