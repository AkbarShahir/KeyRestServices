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
@Table(name = "product2")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_ID")
	public int PRODUCT_ID;

	@Column(name = "PRODUCT_NAME")
	public String PRODUCT_NAME;

	@Column(name = "PRODUCT_DESC")
	public String PRODUCT_DESC;

	@Column(name = "PRODUCT_CATEGORY")
	public String PRODUCT_CATEGORY;

	@Column(name = "SUPPLIER_ID")
	public String SUPPLIER_ID;

	@Column(name = "PRODUCT_QTY")
	public int PRODUCT_QTY;

	@Column(name = "PRODUCT_UNITPRICE")
	public int PRODUCT_UNITPRICE;

	@Column(name = "PRODUCT_SELLPRICE")
	public int PRODUCT_SELLPRICE;

	@Column(name = "PRODUCT_WEIGHT")
	public int PRODUCT_WEIGHT;

	@Column(name = "PRODUCT_SIZE")
	public int PRODUCT_SIZE;

	@Column(name = "PRODUCT_DISCOUNT")
	public int PRODUCT_DISCOUNT;

	@Column(name = "UNITS_IN_STOCK")
	public int UNITS_IN_STOCK;

	@Column(name = "UNITS_ORDER_SUPPLIER")
	public int UNITS_ORDER_SUPPLIER;

	@Column(name = "PRODUCT_REORDER_LEVEL")
	public int PRODUCT_REORDER_LEVEL;

	@Column(name = "NOTE")
	public String NOTE;

	@Column(name = "CREATE_DATE")
	public Date CREATE_DATE;

	@Column(name = "CREATE_BY")
	public String CREATE_BY;

	@Column(name = "MODIFY_DATE")
	public Date MODIFY_DATE;

	@Column(name = "MODIFY_BY")
	public String MODIFY_BY;

	public Product() {

	}

	public Product(int pRODUCT_ID, String pRODUCT_NAME, String pRODUCT_DESC, String pRODUCT_CATEGORY,
			String sUPPLIER_ID, int pRODUCT_QTY, int pRODUCT_UNITPRICE, int pRODUCT_SELLPRICE, int pRODUCT_WEIGHT,
			int pRODUCT_SIZE, int pRODUCT_DISCOUNT, int uNITS_IN_STOCK, int uNITS_ORDER_SUPPLIER,
			int pRODUCT_REORDER_LEVEL, String nOTE, Date cREATE_DATE, String cREATE_BY, Date mODIFY_DATE,
			String mODIFY_BY) {
		super();
		PRODUCT_ID = pRODUCT_ID;
		PRODUCT_NAME = pRODUCT_NAME;
		PRODUCT_DESC = pRODUCT_DESC;
		PRODUCT_CATEGORY = pRODUCT_CATEGORY;
		SUPPLIER_ID = sUPPLIER_ID;
		PRODUCT_QTY = pRODUCT_QTY;
		PRODUCT_UNITPRICE = pRODUCT_UNITPRICE;
		PRODUCT_SELLPRICE = pRODUCT_SELLPRICE;
		PRODUCT_WEIGHT = pRODUCT_WEIGHT;
		PRODUCT_SIZE = pRODUCT_SIZE;
		PRODUCT_DISCOUNT = pRODUCT_DISCOUNT;
		UNITS_IN_STOCK = uNITS_IN_STOCK;
		UNITS_ORDER_SUPPLIER = uNITS_ORDER_SUPPLIER;
		PRODUCT_REORDER_LEVEL = pRODUCT_REORDER_LEVEL;
		NOTE = nOTE;
		CREATE_DATE = cREATE_DATE;
		CREATE_BY = cREATE_BY;
		MODIFY_DATE = mODIFY_DATE;
		MODIFY_BY = mODIFY_BY;
	}

	public Product(String pRODUCT_NAME, String pRODUCT_DESC, String pRODUCT_CATEGORY, String sUPPLIER_ID,
			int pRODUCT_QTY, int pRODUCT_UNITPRICE, int pRODUCT_SELLPRICE, int pRODUCT_WEIGHT, int pRODUCT_SIZE,
			int pRODUCT_DISCOUNT, int uNITS_IN_STOCK, int uNITS_ORDER_SUPPLIER, int pRODUCT_REORDER_LEVEL, String nOTE,
			Date cREATE_DATE, String cREATE_BY, Date mODIFY_DATE, String mODIFY_BY) {
		super();

		PRODUCT_NAME = pRODUCT_NAME;
		PRODUCT_DESC = pRODUCT_DESC;
		PRODUCT_CATEGORY = pRODUCT_CATEGORY;
		SUPPLIER_ID = sUPPLIER_ID;
		PRODUCT_QTY = pRODUCT_QTY;
		PRODUCT_UNITPRICE = pRODUCT_UNITPRICE;
		PRODUCT_SELLPRICE = pRODUCT_SELLPRICE;
		PRODUCT_WEIGHT = pRODUCT_WEIGHT;
		PRODUCT_SIZE = pRODUCT_SIZE;
		PRODUCT_DISCOUNT = pRODUCT_DISCOUNT;
		UNITS_IN_STOCK = uNITS_IN_STOCK;
		UNITS_ORDER_SUPPLIER = uNITS_ORDER_SUPPLIER;
		PRODUCT_REORDER_LEVEL = pRODUCT_REORDER_LEVEL;
		NOTE = nOTE;
		CREATE_DATE = cREATE_DATE;
		CREATE_BY = cREATE_BY;
		MODIFY_DATE = mODIFY_DATE;
		MODIFY_BY = mODIFY_BY;
	}

	public int getPRODUCT_ID() {
		return PRODUCT_ID;
	}

	public void setPRODUCT_ID(int pRODUCT_ID) {
		PRODUCT_ID = pRODUCT_ID;
	}

	public String getPRODUCT_NAME() {
		return PRODUCT_NAME;
	}

	public void setPRODUCT_NAME(String pRODUCT_NAME) {
		PRODUCT_NAME = pRODUCT_NAME;
	}

	public String getPRODUCT_DESC() {
		return PRODUCT_DESC;
	}

	public void setPRODUCT_DESC(String pRODUCT_DESC) {
		PRODUCT_DESC = pRODUCT_DESC;
	}

	public String getPRODUCT_CATEGORY() {
		return PRODUCT_CATEGORY;
	}

	public void setPRODUCT_CATEGORY(String pRODUCT_CATEGORY) {
		PRODUCT_CATEGORY = pRODUCT_CATEGORY;
	}

	public String getSUPPLIER_ID() {
		return SUPPLIER_ID;
	}

	public void setSUPPLIER_ID(String sUPPLIER_ID) {
		SUPPLIER_ID = sUPPLIER_ID;
	}

	public int getPRODUCT_QTY() {
		return PRODUCT_QTY;
	}

	public void setPRODUCT_QTY(int pRODUCT_QTY) {
		PRODUCT_QTY = pRODUCT_QTY;
	}

	public int getPRODUCT_UNITPRICE() {
		return PRODUCT_UNITPRICE;
	}

	public void setPRODUCT_UNITPRICE(int pRODUCT_UNITPRICE) {
		PRODUCT_UNITPRICE = pRODUCT_UNITPRICE;
	}

	public int getPRODUCT_SELLPRICE() {
		return PRODUCT_SELLPRICE;
	}

	public void setPRODUCT_SELLPRICE(int pRODUCT_SELLPRICE) {
		PRODUCT_SELLPRICE = pRODUCT_SELLPRICE;
	}

	public int getPRODUCT_WEIGHT() {
		return PRODUCT_WEIGHT;
	}

	public void setPRODUCT_WEIGHT(int pRODUCT_WEIGHT) {
		PRODUCT_WEIGHT = pRODUCT_WEIGHT;
	}

	public int getPRODUCT_SIZE() {
		return PRODUCT_SIZE;
	}

	public void setPRODUCT_SIZE(int pRODUCT_SIZE) {
		PRODUCT_SIZE = pRODUCT_SIZE;
	}

	public int getPRODUCT_DISCOUNT() {
		return PRODUCT_DISCOUNT;
	}

	public void setPRODUCT_DISCOUNT(int pRODUCT_DISCOUNT) {
		PRODUCT_DISCOUNT = pRODUCT_DISCOUNT;
	}

	public int getUNITS_IN_STOCK() {
		return UNITS_IN_STOCK;
	}

	public void setUNITS_IN_STOCK(int uNITS_IN_STOCK) {
		UNITS_IN_STOCK = uNITS_IN_STOCK;
	}

	public int getUNITS_ORDER_SUPPLIER() {
		return UNITS_ORDER_SUPPLIER;
	}

	public void setUNITS_ORDER_SUPPLIER(int uNITS_ORDER_SUPPLIER) {
		UNITS_ORDER_SUPPLIER = uNITS_ORDER_SUPPLIER;
	}

	public int getPRODUCT_REORDER_LEVEL() {
		return PRODUCT_REORDER_LEVEL;
	}

	public void setPRODUCT_REORDER_LEVEL(int pRODUCT_REORDER_LEVEL) {
		PRODUCT_REORDER_LEVEL = pRODUCT_REORDER_LEVEL;
	}

	public String getNOTE() {
		return NOTE;
	}

	public void setNOTE(String nOTE) {
		NOTE = nOTE;
	}

	public Date getCREATE_DATE() {
		return CREATE_DATE;
	}

	public void setCREATE_DATE(Date cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}

	public String getCREATE_BY() {
		return CREATE_BY;
	}

	public void setCREATE_BY(String cREATE_BY) {
		CREATE_BY = cREATE_BY;
	}

	public Date getMODIFY_DATE() {
		return MODIFY_DATE;
	}

	public void setMODIFY_DATE(Date mODIFY_DATE) {
		MODIFY_DATE = mODIFY_DATE;
	}

	public String getMODIFY_BY() {
		return MODIFY_BY;
	}

	public void setMODIFY_BY(String mODIFY_BY) {
		MODIFY_BY = mODIFY_BY;
	}

}
