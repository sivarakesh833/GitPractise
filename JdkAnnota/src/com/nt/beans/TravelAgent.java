package com.nt.beans;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TravelAgent {
	private TourPlan tpc;
	@Resource
	@Named("tp4")
private TourPlan tp4;
public TourPlan getTp4() {
	return tp4;
}
	/*
	 * @Autowired public void setTp4(TourPlan tp4) { this.tp4 = tp4; }
	 */

public void arbitaryMetho(TourPlan tp4) {
	this.tp4 = tp4;
}
private TourPlan tp1;
public TravelAgent() {
	// TODO Auto-generated constructor stub
System.out.println("TravelAgent:0 param constructor.");
}

	/*
	 * @Autowired public TravelAgent(TourPlan tpc,TourPlan tpc1) { this.tpc=tpc;
	 * this.tp1=tpc1; System.out.println("Parameterized constructor"); }
	 */
	 
public TourPlan getTp() {
	return tp1;
}
public void setTp1(TourPlan tp1) {
	this.tp1 = tp1;
}


public TourPlan getTpc() {
	return tpc;
}


public void setTpc(TourPlan tpc) {
	this.tpc = tpc;
}


public TourPlan getTp1() {
	return tp1;
}


@Override
public String toString() {
	return "TravelAgent [tpc=" + tpc + ", tp4=" + tp4 + ", tp1=" + tp1 + "]";
}

}
