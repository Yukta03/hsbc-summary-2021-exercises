package com.hsbc.automobile;

public class SelectVehicle {

	public static void main(String[] args) {
		System.out.println("KTM instance");
		Ktm ktm = new Ktm();
		AutomobileUI.printVehicle(ktm);
		System.out.println("Royal Enfield instance");
		RoyalEnfield rf = new RoyalEnfield();
		AutomobileUI.printVehicle(rf);
		System.out.println("Alto instance");
		Alto alto = new Alto();
		AutomobileUI.printVehicle(alto);
		System.out.println("SKoda instance");
		Skoda skoda = new Skoda();
		AutomobileUI.printVehicle(skoda);
		System.out.println("BMW instance");
		BMW bmw = new BMW();
		AutomobileUI.printVehicle(bmw);
	}

}

