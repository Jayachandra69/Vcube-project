package com.dailytasks;

class address{
	String city;

	public address(String city) {
		this.city = city;
	}
}

public class Customer implements Cloneable {
	int cid;
	String cname;
	address address;
	
	public Customer(int cid, String cname, com.dailytasks.address address) {
		this.cid = cid;
		this.cname = cname;
		this.address = address;
	}
	
    @Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
  }
