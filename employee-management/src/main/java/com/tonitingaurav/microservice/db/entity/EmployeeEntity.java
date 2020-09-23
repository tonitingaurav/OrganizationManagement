package com.tonitingaurav.microservice.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import static com.tonitingaurav.microservice.constant.NumericConstant.*;

import java.sql.Date;

@Entity
@Table(name = "EMPLOYEE")
public class EmployeeEntity extends BaseEntity {

	@Column(name = "USER_NAME", nullable = false, length = FIFTY, unique = true)
	private String userName;

	@Column(name = "FIRST_NAME", nullable = false, length = FIFTY)
	private String firstName;

	@Column(name = "LAST_NAME", nullable = false, length = FIFTY)
	private String lastName;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

}
