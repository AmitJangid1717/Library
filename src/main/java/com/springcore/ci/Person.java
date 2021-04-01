package com.springcore.ci;

import java.util.List;
import java.util.Map;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	private List<String> list;
	private Map<String,String> courses;
	
	
	public Person(String name, int personId, Certi certi , List<String> list, Map<String,String> courses) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi=certi;
		this.list=list;
		this.courses=courses;
	}
	@Override
	public String toString() {
		
		return this.name + " : "  +this.personId + "{"+ this.certi.name +"}" +"List is" +list +"mapping  of courses" +courses ;
	}

}
