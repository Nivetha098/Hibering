package com.niit.Dao;

import java.util.List;

import com.niit.model.Product;


public interface ProductDao {
		public Product addProduct(Product product);
		public List<Product> getAllProducts();
		public void updateProduct(Product product);
		public void deleteProducts(int id);	
		public Product selectProducts(int id);
		

}
