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
import com.chip.ProductServices.ProductBusinessServices;

public abstract class ProductResource {

	
	ProductBusinessServices pBusinessService = new ProductBusinessServices();

	
	public int _addProduct(Product product) {
		int ProductID = pBusinessService.addProduct(product);
		return ProductID;
	}

	
	public List<Product> _getProducts() {
		return pBusinessService.getAllProducts();
	}

	
	public Product _getProduct(int ProductID) {
		Product Product = pBusinessService.getProduct(ProductID);
		return Product;
	}

	/*
	 * public List<Category> getCategories() { List<Category>
	 * listOfCategory=serviceImpl.getCategories(); return listOfCategory; }
	 */

	
	public void _deleteProduct(@PathParam("ProductID") int ProductID) {
		pBusinessService.deleteProduct(ProductID);

	}

	
	public List<Category> _getCategories() {
		return pBusinessService.getAllCategory();
	}
	
	public void _updateProduct(Product product) {
		pBusinessService.updateProduct(product);
	}

	
	
	
	
}
