package com.example.SpringProject.quiz;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="Quiz")
public class Quiz {
	
	private Math math;
	private Science science;
	public Math getMath() {
		return math;
	}
	public void setMath(Math math) {
		this.math = math;
	}
	public Science getScience() {
		return science;
	}
	public void setScience(Science science) {
		this.science = science;
	}
	
	public Quiz(Math math, Science science) {
		super();
		this.math = math;
		this.science = science;
	}
	
	public Quiz() {
		
	}

}
