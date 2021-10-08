package com.hsbc.shapes;

class Sphere implements Shapes {
	    
	    @Override
	    public String area(int r)
	    {
	    	double a = 4 *3.14 * r * r;
		    return "Sphere's area: "+a; 
	        
	    }
}