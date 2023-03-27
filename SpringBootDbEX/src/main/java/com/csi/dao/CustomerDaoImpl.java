package com.csi.dao;

import com.csi.model.Customer;
import com.csi.repository.CustRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerDaoImpl {

    @Autowired
    CustRepository custRepositoryImpl;

    public Customer saveData(Customer customer){
        return custRepositoryImpl.save(customer);
    }

    public Optional<Customer> getDataById(int custId){
        return custRepositoryImpl.findById(custId);
    }

    public List<Customer>getAllData(){
        return custRepositoryImpl.findAll();

    }

    public Customer updateData(Customer customer){
        return custRepositoryImpl.save(customer);
    }

    public void deleteDataById(int custId){
        custRepositoryImpl.deleteById(custId);
    }
}
