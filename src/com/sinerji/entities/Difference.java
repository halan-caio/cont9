package com.sinerji.entities;

public class Difference {
	  private String line;
	    private int position;
	    private String fromFileOne;
	    private String fromFileTwo;

	    public Difference(String line, int position, String fromFileOne, String fromFileTwo) {
	        this.line = line;
	        this.position = position;
	        this.fromFileOne = fromFileOne;
	        this.fromFileTwo = fromFileTwo;
	    }

	    @Override
	    public String toString() {
	        return "Difference found at line " + line + ", position " + position + 
	               ": '" + fromFileOne + "' vs '" + fromFileTwo + "'";
	    }

}
