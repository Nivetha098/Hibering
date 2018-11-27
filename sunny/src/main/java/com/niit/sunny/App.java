
package com.niit.sunny;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.niit.DBconfig.DBConfig;
import com.niit.Dao.CategoryDao;
import com.niit.Dao.ProductDao;
import com.niit.Dao.SupplierDao;
import com.niit.Dao.UserDao;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;
import com.niit.model.User;


public class App 
{
	
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
   	 	UserDao userDao = (UserDao) context.getBean("userDao");
   	 	User user=new User();
  
   	 	
   	 	user.setPassword("63819");

   	 	user.setEmail("sanjana@gmail.com");
   	  //  userDao.addUser(user);
   	 
   	 //	userDao.updateUser(user);
   	   
//   userDao.deleteUser(user);
   	 List<User> userList=userDao.getUser();
   	 	for(User userobj:userList)
   	 	{
   	 		System.out.println( userobj.getEmail()+" "+userobj.getPassword() );
   	 	
   	 		
   	 	}
   	 ProductDao productDao = (ProductDao) context.getBean("productDao");
	 	Product product=new Product();
	 	product.setId(1);
	 	product.setProductname("samsung");
	 	product.setProductdesc("4GB RAM 64 ROM ");
	 	product.setQuantity(20);
	 	product.setPrice(45799.8);
		//productDao.addProduct(product);
	 	
	 //	productDao.updateProduct(product);
	 //	productDao.deleteProducts(1);
	   //Product productobj=productDao.selectProducts(1);
	 
	 	List<Product> productList=productDao.getAllProducts();
	 	for(Product productobj:productList)

	 	{
	 		System.out.println(productobj.getId()+" " +productobj.getProductname()+" " +productobj.getProductdesc()+" "+productobj.getPrice()+" "+productobj.getQuantity() );
	 	
	 		
	 	}
	 	CategoryDao categorydao = (CategoryDao) context.getBean("categorydao");
	 	Category category=new Category();
	 	category.setId(1001);
	 	category.setCategoryname("Mobile");
	 	category.setCategorydesc("all brands available ");
	 
		//categoryDao.addCategory(category);
	 	
	 	
	 	//categoryDao.updateCategory(category);
	 //	categoryDao.deleteCategory(1);
	 	//categoryDao.selectCategory(1);	
	 	List<Category> categoryList=categorydao.getAllCategory();
	 	for(Category categoryobj:categoryList)

	 	{
	 		System.out.println(categoryobj.getId()+" " +categoryobj.getCategoryname()+" " +categoryobj.getCategorydesc() );
	 	
	 		
	 	}
	 	SupplierDao supplierDao = (SupplierDao) context.getBean("supplierDao");
	 	Supplier supplier=new Supplier();
	 	supplier.setId(1001);
	 	supplier.setSuppliername("mark");
	 	supplier.setSupplierdesc("good contractor for eatables");
	 
	 //	supplierDaoaddSupplier(supplier);
	 	
	 	
	// 	supplierDao.updateSupplier(supplier);
	 //	supplierDao.deleteSupplier(1);
	 Supplier supplier1=supplierDao.selectSupplier(1001);
	 System.out.println(supplier1.getId()+" " +supplier1.getSuppliername()+" " +supplier1.getSupplierdesc() );
	 	
	 	
	 	List<Supplier> supplierList=supplierDao.getAllSupplier();
	 	for(Supplier supplierobj:supplierList)

	 	{
	 System.out.println(supplierobj.getId()+" " +supplierobj.getSuppliername()+" " +supplierobj.getSupplierdesc() );
	 	
	 		
		}
   	 	
   	 	
    }

    }

