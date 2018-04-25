package com.mtc.app.actionbazaar;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="bids")
public class Bid implements Serializable{
	
	@Id
	@Column(name = "bid_id")
	private Long bidId;
	@Column(name = "bid_price")
	private BigDecimal bidPrice;

	@Column(name = "bid_date")	
	private LocalDate bidDate;	
	
	@ManyToOne
	@JoinColumn(name="item_id")
	private Item item;
	
	public Bid() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Bid(Long bidId, BigDecimal bidPrice, LocalDate bidDate) {
		super();
		this.bidId = bidId;
		this.bidPrice = bidPrice;
		this.bidDate = bidDate;
	}

	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}


	public Long getBidId() {
		return bidId;
	}

	public void setBidId(Long bidId) {
		this.bidId = bidId;
	}

	public BigDecimal getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(BigDecimal bidPrice) {
		this.bidPrice = bidPrice;
	}

	public LocalDate getBidDate() {
		return bidDate;
	}
	
	public void setBidDate(LocalDate bidDate) {
		this.bidDate = bidDate;
	}


}
