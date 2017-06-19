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

@Path("/productservices")
public class ProductMain {
	// ProductBusinessServices serviceImpl = new ProductBusinessServices();

	ProductResourceService pResService = new ProductResourceService();

	@POST
	@Path("/products")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public org.json.simple.JSONObject addProduct(Product product) {

		org.json.simple.JSONObject outputJsonObj = new org.json.simple.JSONObject();
		
		Object result_success=true;
		Object result_failure=false;
		
		StringBuilder str = new StringBuilder(0);
		Integer ProductID = pResService.addProduct(product);
		if (ProductID > 0) {

			String ProdID = ProductID.toString();
			outputJsonObj.put("saved", result_success);
			outputJsonObj.put("productid", ProdID);
		} else {
			outputJsonObj.put("saved", result_failure);
			outputJsonObj.put("productid", "");
		}

		return outputJsonObj;
	}

	@GET
	@Path("/products")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getProducts() {
		return pResService.getAllProducts();
	}

	@GET
	@Path("/categories")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Category> getCategories() {
		return pResService.getAllCategories();
	}

	@GET
	@Path("/products/{ProductID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProduct(@PathParam("ProductID") int ProductID) {
		Product Product = pResService.getProduct(ProductID);
		return Product;
	}

	/*
	 * public List<Category> getCategories() { List<Category>
	 * listOfCategory=serviceImpl.getCategories(); return listOfCategory; }
	 */

	@DELETE
	@Path("/products/{ProductID}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteProduct(@PathParam("ProductID") int ProductID) {
		pResService.deleteProduct(ProductID);
	}

	@PUT
	@Path("/products")
	public void updateProduct(Product product) {
		pResService.updateProduct(product);
	}

}
