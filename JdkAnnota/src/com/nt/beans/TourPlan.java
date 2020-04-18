package com.nt.beans;

import java.util.Arrays;

public class TourPlan {
private String[] places;
public TourPlan() {
	// TODO Auto-generated constructor stub
System.out.println("TourPlan o-param constructor");
}
public String[] getPlaces() {
	return places;
}

public void setPlaces(String[] places) {
	this.places = places;
}

@Override
public String toString() {
	return "TourPlan [places=" + Arrays.toString(places) + "]";
}

}
