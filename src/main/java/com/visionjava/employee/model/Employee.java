package com.visionjava.employee.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@NotNull(message="Field Required!") @NumberFormat(style = Style.NUMBER) @Min(1)
	private Long employeeId;
	
	@NotNull(message="Field Required!") @Size(min=1,max=10) 
	private String firstName;
	
	@NotNull(message="Field Required!") @Size(min=1,max=10)
	private String lastName;
	
	@NotNull(message="Field Required!")
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date dateOfBirth;
	
	@NotNull(message="Field Required!")
	@Pattern(regexp="^[A-Za-z]*$")
	private String placeofBirth;
	
	
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPlaceofBirth() {
		return placeofBirth;
	}
	public void setPlaceofBirth(String placeofBirth) {
		this.placeofBirth = placeofBirth;
	}
	

}
