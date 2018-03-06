package com.java2.object;

public class Bookstore {
    private int price = 500;
    private int number;
    
    public Bookstore(int price,int number){
    	this.number =number;
    	this.price =price;
    }
    
    public void money(){
    	int money =(price*number);
    }
	

}
