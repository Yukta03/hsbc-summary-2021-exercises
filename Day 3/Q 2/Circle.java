package com.hsbc.shapes;

public class Circle implements Shapes {
        
	    @Override
	    public String area(int r)
	    {
	     
	      double ar = 3.14 * r * r;
	      return "Circle's area: "+ar; 
	      
	    }
	    
	   
}