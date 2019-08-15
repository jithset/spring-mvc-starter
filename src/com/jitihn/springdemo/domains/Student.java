package com.jitihn.springdemo.domains;

import java.util.LinkedHashMap;

public class Student {
	private String first_name;
	private String last_name;
	private String country;
	private String fav_lang;
	private String[] os;
	private LinkedHashMap<String , String> countryList;
	
	
	public Student() {
		countryList = new LinkedHashMap<String, String>();
		countryList.put("IN", "India");
		countryList.put("EN", "England");
		countryList.put("US", "USA");
		countryList.put("FR", "France");
		countryList.put("GER", "Germany");
	}

	
	public String getFav_lang() {
		return fav_lang;
	}


	public void setFav_lang(String fav_lang) {
		this.fav_lang = fav_lang;
	}


	public String[] getOs() {
		return os;
	}


	public void setOs(String[] os) {
		this.os = os;
	}


	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
