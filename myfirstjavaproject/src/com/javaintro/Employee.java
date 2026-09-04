package com.javaintro;
public class Employee {
	int eid;
	String ename;
	static int orgID = 555;
	static String orgName = "Vcube";
	public static void main(String[] args) {
		
		System.out.println("-----------EMP 1-------------");
		Employee t = new Employee();
		t.eid=0;
		t.ename ="Bhargav";
		System.out.println("orgID :"+ orgID);
		System.out.println("orgName :"+ orgName);
		System.out.println(t.eid);
		System.out.println(t.ename);
		
		System.out.println("-----------EMP 2-------------");
		Employee sr = new Employee();
		
		sr.eid =1;
		sr.ename="Jayachandra";
		System.out.println("orgID :"+ orgID );
		System.out.println("orgName :"+ orgName);
		System.out.println(sr.eid);
		System.out.println(sr.ename);
		
		
		System.out.println("-----------EMP 3-------------");
		Employee s = new Employee();
		s.eid=2;
		s.ename="Chinnu";
		System.out.println("orgID :"+ orgID);
		System.out.println("orgName :"+ orgName);
		System.out.println(s.eid);
		System.out.println(s.ename);
	}
}



