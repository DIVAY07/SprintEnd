package com.ibs.entities;

import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "UserDetails")
@NoArgsConstructor
//@Getter
//@Setter
public class User1 {
	
//	@SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_JUST_FOR_TEST", allocationSize=100)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accNo;
	
	
	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	private String aadharNo;
	private String panNo;
	private String dob;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	private int accBalance;
//	private int isApproved;
//	
//	
//	public void setIsApproved(Integer val)
//	{
//		this.isApproved = val;
//		
//	}
//	
//	public int getIsApproved()
//	{
//		return this.isApproved;
//	}
//	
	
//	@Column(columnDefinition = "boolean default false")
//	private boolean isApproved;
	
//	@OneToOne(mappedBy = "user1")
////	@JsonBackReference
//	private Account account;
	
	
		
}