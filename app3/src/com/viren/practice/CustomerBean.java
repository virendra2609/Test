package com.viren.practice;

public class CustomerBean {
     String name;
     int cust_id;
     
     static{
    	 System.out.println("Bean class loaded");
     }
     
     public CustomerBean() {
		// TODO Auto-generated constructor stub
    	 System.out.println("Bean Object Created");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
     
     public void custDetails(){
    	 System.out.println("name : "+name);
    	 System.out.println("cust_id : "+cust_id);
     }
}
