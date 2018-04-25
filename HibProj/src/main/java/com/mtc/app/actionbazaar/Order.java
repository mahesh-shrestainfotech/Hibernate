package com.mtc.app.actionbazaar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ordertab")
public class Order {
	
	@Id
	@Column(name="order_id")
	private Long orderId;
	@Column(name="order_status")
	private OrderStatus orderStatus;
	
	@OneToOne
	@JoinColumn(name="item_id")
	private Item item;
	
	@OneToOne
	@JoinColumn(name="billing_id")
	private Billing billing;
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Billing getBilling() {
		return billing;
	}
	public void setBilling(Billing billing) {
		this.billing = billing;
	}
	
	

}
