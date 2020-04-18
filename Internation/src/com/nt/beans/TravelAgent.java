package com.nt.beans;

public class TravelAgent {
private TourPlan tp1;
private TourPlan tpc;
public TravelAgent() {
	// TODO Auto-generated constructor stub
System.out.println("TravelAgent:0 param constructor.");
}
public TravelAgent(TourPlan tpc) {
	this.tpc=tpc;
	System.out.println("Parameterized constructor");
}
public TourPlan getTp() {
	return tp1;
}
public void setTp1(TourPlan tp1) {
	this.tp1 = tp1;
}
@Override
public String toString() {
	return "TravelAgent [tp1=" + tp1 + ", tpc=" + tpc + "]";
}

}
