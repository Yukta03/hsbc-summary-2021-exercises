package com.hsbc.shapes;

public class Area {

		public static void main(String[] args) {
			System.out.println("Circle's area = ");
			Circle circle = new Circle();
			FindArea.printArea(circle,2);
			System.out.println("Sphere's area = ");
			Sphere sphere = new Sphere();
			FindArea.printArea(sphere,9);
			
		}

}
