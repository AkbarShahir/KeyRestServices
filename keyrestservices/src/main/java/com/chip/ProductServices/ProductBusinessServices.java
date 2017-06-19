package com.chip.ProductServices;

import java.util.List;

import com.chip.ProductServices.Product;
import com.chip.ProductServices.ProductDao;

public class ProductBusinessServices {

	
ProductDao productDao = new ProductDao();
	
CategoryDao catDao = new CategoryDao();

	public List<Category> getAllCategory() {
		return catDao.getAllCategory();
	}
	public List<Product> getAllProducts(){
		return productDao.getAllProducts();
	}
	
	public int addProduct(Product product)
	{
		int productID = 0;
		productID = productDao.addProduct(product);
		return productID;
	}
	
	public Product getProduct(int ProductID)
	{
		Product product  = productDao.getProduct(ProductID);
		return product;
	}
	
	/*public  List<Category>  getCategories()
	{
		List<Category> listOfCategory=productDao.getCategories();
		return listOfCategory;
	}*/
	public  void deleteProduct(int ProductID)
	{
		productDao.deleteProduct(ProductID);
		
	}
	public  void updateProduct(Product product)
	{
			productDao.updateProduct(product);
	}

	
	
	
	
	
}
