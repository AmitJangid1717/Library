package com.springcore.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	
	public int getStudentId() {
		
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("student id is"+studentId);
		this.studentId = studentId;
	}
	public String getStudentName() {
		
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("student name is"+studentName);
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("address is"+studentAddress);
		this.studentAddress = studentAddress;
	}
	
	 
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
	
	

	
	
	
	
	
	
	
}
