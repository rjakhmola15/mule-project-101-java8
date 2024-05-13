package com.test;
import java.util.Calendar;


class Customer extends User {
    private Calendar expirationDate;
    private User salesRepr;

    public Customer(){

    }

    public Customer(String name, String lastName,Calendar expirationDate){
    	super(name,lastName);
        
        this.expirationDate = expirationDate;
    }

    public void setSalesRepr(User salesRepr){
        this.salesRepr = salesRepr;
    }

    public User getSalesRepr(){
        return this.salesRepr;
    }

    public void  setExpirationDate(Calendar expirationDate){
        this.expirationDate = expirationDate;
    }

    public Calendar getExpirationDate(){
        return this.expirationDate;
    }
}