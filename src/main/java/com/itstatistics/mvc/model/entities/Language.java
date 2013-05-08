package com.itstatistics.mvc.model.entities;

import java.util.Date;

import org.firebrandocm.dao.annotations.ColumnFamily;
import org.firebrandocm.dao.annotations.Key;

@ColumnFamily
public class Language {

	@Key
	private String languageName;
	private int numberOfJobs;
	private Date date;
	private String country;
	private String city;
	private String wwwAddress;

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the wwwAddress
	 */
	public String getWwwAddress() {
		return wwwAddress;
	}

	/**
	 * @param wwwAddress
	 *            the wwwAddress to set
	 */
	public void setWwwAddress(String wwwAddress) {
		this.wwwAddress = wwwAddress;
	}

	/**
	 * @return the languageName
	 */
	public String getLanguageName() {
		return languageName;
	}

	/**
	 * @param languageName
	 *            the languageName to set
	 */
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	/**
	 * @return the numberOfJobs
	 */
	public int getNumberOfJobs() {
		return numberOfJobs;
	}

	/**
	 * @param numberOfJobs
	 *            the numberOfJobs to set
	 */
	public void setNumberOfJobs(int numberOfJobs) {
		this.numberOfJobs = numberOfJobs;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

}