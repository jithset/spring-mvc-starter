package com.jitihn.springdemo.domains;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.jitihn.mvc.validations.CourseCode;

public class Customer {

	private String first_name;
	
	@NotNull(message = "is required")
	@Size(min=1, message = "is required")
	private String last_name;
	
	@NotNull(message = "is required")
	@Min(value = 0, message = "Value must be grater than 0")
	@Max(value = 10, message = "Value must be less than 10")
	private Integer freepass;
	
	@NotNull(message = "is required")
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "must be 5 character length")
	private String postalcode;
	
	@CourseCode
	private String courseCode;
	
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public Integer getFreepass() {
		return freepass;
	}
	public void setFreepass(Integer freepass) {
		this.freepass = freepass;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
}
