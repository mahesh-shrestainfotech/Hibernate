package com.mtc.app.actionbazaar;

import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@PrimaryKeyJoinColumn(name="bidder_user_id")
@Entity
@Table(name="bidder")
@DiscriminatorValue("bidder")
public class Bidder extends User{
	
	@OneToMany
	@JoinColumn(name="bidder_id")
	private Set<Bid> bids;
	
	@OneToMany
	@JoinColumn(name="order_id")
	private Set<Order> orders;
	
	

	
	public Set<Bid> getBids() {
		return bids;
	}
	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	

}
