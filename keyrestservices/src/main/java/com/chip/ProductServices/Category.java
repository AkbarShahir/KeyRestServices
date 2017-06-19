package com.chip.ProductServices;

import java.util.Date;

import javax.persistence.Column; // There are JPA ( Java Persistance API)
import javax.persistence.Entity;// There are JPA ( Java Persistance API)
import javax.persistence.EntityManager;// There are JPA ( Java Persistance API)  API Class
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;// There are JPA ( Java Persistance API)
import javax.persistence.Table;// There are JPA ( Java Persistance API)
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "category1")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CategoryID")
	public int CategoryID;

	@Column(name = "CategoryName")
	public String CategoryName;

	public Category() {

	}

	public Category(int _CategoryID, String _CategoryName) {

		CategoryID = _CategoryID;
		CategoryName = _CategoryName;

	}

	public Category(String CategoryName) {
		super();

		CategoryName = CategoryName;

	}

	public int getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

}
