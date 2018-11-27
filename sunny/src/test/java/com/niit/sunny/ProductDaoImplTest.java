package com.niit.sunny;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DBconfig.DBConfig;
import com.niit.Dao.ProductDao;
import com.niit.DaoImpl.ProductDaoImpl;
import com.niit.model.Product;

import junit.framework.TestCase;

public class ProductDaoImplTest extends TestCase
{
	ApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class,ProductDaoImpl.class);
	   ProductDao productDao=(ProductDao)context.getBean("productDao");
	public void testSaveProduct() 
	{
		Product product =new Product();
		product.setPrice(100);
		product.setQuantity(1);
		product.setProductname("Water Bottle");
		product.setProductdesc("Blue color - l litre");
		product=productDao.addProduct(product);
		assertTrue(product.getId()>0); //TC
		
	}

	public void testGetProduct() {
		  Product product1=productDao.selectProducts(35);
		   Product product2=productDao.selectProducts(36);//id=3,
		   Product product3=productDao.selectProducts(100);//id==4
		   //Null or Not null
		   assertNotNull(product1);
		   assertNotNull(product2);//product3!=null, if it is true, success
		   assertNull(product3);//product2==null,if it is true, success
		   
		   //check for prices [actual price returned is same as expected price for id=3
		   double expectedPrice=100.0;
		   double actualPrice=product2.getPrice();
		   assertTrue(expectedPrice==actualPrice);//if true, success
	}

	public void testUpdateProduct() {
		//Get product object for the id=3
		//Update the price and quantity of the product id=3
		Product product=productDao.selectProducts(33);
		product.setPrice(100.0);
		product.setQuantity(1);
		productDao.updateProduct(product);//product has updated price and update quantity
		assertTrue(product.getPrice()==100.0);
		assertTrue(product.getQuantity()==1);
	}
		public void testdeleteProduct()
		{
			
			  
			   productDao.deleteProducts(47);
	
			   assertNull(productDao.selectProducts(49));
		}
		
		
		public void testgetallProducts()
		{
			List<Product> productList=productDao.getAllProducts();
			assertNotNull(productList.isEmpty());
		
		
}
}




			   
			   
			   
			  
			 
			 


