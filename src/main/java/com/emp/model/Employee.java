package com.emp.model;

import java.util.LinkedHashMap;

public class Employee {
	private String employeeName;
    private Integer employeeId;
    private String employeeGrade;

	
	private LinkedHashMap<String, String> gradeOptions;
	public Employee() {
		// TODO Auto-generated constructor stub
gradeOptions = new LinkedHashMap<String, String>();
		
		gradeOptions.put("MG", "Manager");
		gradeOptions.put("DV", "Developer");
		gradeOptions.put("TS", "Tester");
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public LinkedHashMap<String, String> getGradeOptions() {
		return gradeOptions;
	}
	public void setGradeOptions(LinkedHashMap<String, String> gradeOptions) {
		this.gradeOptions = gradeOptions;
	}
	
}
