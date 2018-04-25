package com.mtc.app.actionbazaar;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="CATEGORIES")
public class Category implements Serializable{
	
	@Id
	@Column(name="CATEGORY_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long categoryId;
	@Column(name="CATEGORY_NAME")
	private String categoryName;
	@Column(name="CREATE_DATE")
	@Temporal(TemporalType.DATE)
	private Date createDate;
	
	@ElementCollection
	@CollectionTable(name="keywords",joinColumns={@JoinColumn(name="category_id")})
	@Column(name="keyword")
	private Set<String> keywords = new HashSet<String>();


	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	public Category(String categoryName, Date createDate, Set<String> keywords) {		
		this.categoryName = categoryName;
		this.createDate = createDate;		
	}	

	public Set<String> getKeywords() {
		return keywords;
	}
	
	public void setKeywords(Set<String> keywords) {
		this.keywords = keywords;
	}
	
	@ManyToMany(mappedBy="categories")
	private Set<Item> items;
	
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
	public Set<Item> getItems() {
		return items;
	}
	
	public Long getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	
	

}
