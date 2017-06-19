package com.chip.ProductServices;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.chip.ProductServices.Product;
import com.chip.ProductServices.ProductResource;

public class ProductResourceService extends ProductResource {

	
	
	public int addProduct(Product product) {
		
		int ProductID = _addProduct(product);
		return ProductID;
	}

	
	public List<Product> getAllProducts() {
		return _getProducts() ;
	}

	public List<Category> getAllCategories() {
		return _getCategories();
	}
	
	public Product getProduct(@PathParam("ProductID") int ProductID) {
		Product Product = _getProduct(ProductID);
		return Product;
	}

	/*
	 * public List<Category> getCategories() { List<Category>
	 * listOfCategory=serviceImpl.getCategories(); return listOfCategory; }
	 */

	
	public void deleteProduct(@PathParam("ProductID") int ProductID) {
		_deleteProduct(ProductID);

	}
	
	public void updateProduct(Product product) {
		_updateProduct(product);
	}

}
