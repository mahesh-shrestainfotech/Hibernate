package com.mtc.app.actionbazaar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Billing {
	
	@Id
	private Long billingId;
	@OneToOne
	@JoinColumn(name="address_id")
	private Address billingAddress;
	@OneToOne
	@JoinColumn(name="creditCard_id")
	private CreditCard creditCard;
	
	public Billing() {
		// TODO Auto-generated constructor stub
	}

	public Long getBillingId() {
		return billingId;
	}

	public void setBillingId(Long billingId) {
		this.billingId = billingId;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	

}
