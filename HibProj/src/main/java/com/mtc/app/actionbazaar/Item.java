package com.mtc.app.actionbazaar;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="items")
public class Item implements Serializable{
	
	@Id
	@Column(name = "item_id")
	private Long itemId;
	@Column(name = "item_name")
	private String itemName;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "initial_price")
	private BigDecimal initialPrice;

	@Column(name = "bid_start_date")	
	private LocalDate bidStartDate;

	@Column(name = "bid_end_date")
	private LocalDate bidEndDate;
	
	@ManyToMany
	@JoinTable(name="categories_items",joinColumns= {@JoinColumn(name="ci_item_id")},inverseJoinColumns= {@JoinColumn(name="ci_category_id")})
	private Set<Category> categories;

	@OneToMany(mappedBy="item",cascade=CascadeType.ALL)	
	private Set<Bid> bids;
	
	@OneToOne(mappedBy="item")
	private Order order;
	
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public Set<Bid> getBids() {
		return bids;
	}
	
	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public BigDecimal getInitialPrice() {
		return initialPrice;
	}

	public void setInitialPrice(BigDecimal initialPrice) {
		this.initialPrice = initialPrice;
	}

	public LocalDate getBidStartDate() {
		return bidStartDate;
	}

	public void setBidStartDate(LocalDate bidStartDate) {
		this.bidStartDate = bidStartDate;
	}

	public LocalDate getBidEndDate() {
		return bidEndDate;
	}

	public void setBidEndDate(LocalDate bidEndDate) {
		this.bidEndDate = bidEndDate;
	}

		
	


}
