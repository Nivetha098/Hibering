package com.niit.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.ProductDao;
import com.niit.model.Product;
@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao{

		@Autowired
	SessionFactory sessionFactory;
		public Product addProduct(Product product) 
		{
			sessionFactory.getCurrentSession().save(product);
			return product;

		}
		public List<Product> getAllProducts() {
			
			// TODO Auto-generated method stub
			return  sessionFactory.getCurrentSession().createQuery("from Product").list();
		}
		public void updateProduct(Product product)
		{
			sessionFactory.getCurrentSession().update(product);

		}
		public void deleteProducts(int id)
		{
			Session session=sessionFactory.getCurrentSession();
			Product p1=(Product) session.get(Product.class, id);
			session.delete(p1);
			

		}
		public Product selectProducts(int id)
		{
		Object obj=sessionFactory.getCurrentSession().get(Product.class,id);
		Product p=(Product)obj;
		return p;
		
		}
			
		}
		
				




		


