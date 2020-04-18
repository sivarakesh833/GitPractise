package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.TourPlan;
import com.nt.beans.TravelAgent;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hiiiiiiiiiiii");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		TravelAgent obj = (TravelAgent) context.getBean("travelAgent");
		System.out.println(obj);
	}
}
