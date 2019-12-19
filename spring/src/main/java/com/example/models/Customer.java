package com.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="User_14Nov")
public class Customer {

	@Id
	@NotNull
	@Min(value=1)
	private Integer customerId;
	
	@NotEmpty
	@Size
	private String customerName;

	@NotEmpty
	@Size(min=8,max=20,message="character must be in 8 to 20 words")
	private String password;
	@NotEmpty
	private String gender;
	@NotEmpty
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
		public void setGender(String gender) {
			this.gender = gender;
		}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", password=" + password
				+ ", gender=" + gender + "]";
	}

}

	