package com.hibernate.app;
import com.hibernate.entity.Customer;
import com.hibernate.entity.Policy;

import com.hibernate.dao.PolicyDao;

public class App {

	public static void main(String[] args) {
		
		PolicyDao dao=new PolicyDao();
		
		Policy s1=new Policy("abb","vehicle",4545,44,5);
		Customer c1=new Customer("bin",s1,22,"bin@gmil.com",4555);
		dao.create(c1);
//		c1.setName("bbb");
//		System.out.println("after updation");
//		dao.update(c1);
//		c1.toString();
//		dao.delete(4);
		
		//dao.getCust(2);
//		dao.displayPolicy();
//		
//		dao.update(s1);
//		dao.displayPolicy();
//		dao.fetchPolicyByld(4);
//		dao.deletePolicy(5);
//		dao.deleteAll();
	}
}
