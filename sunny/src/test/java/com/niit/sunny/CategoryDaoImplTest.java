package com.niit.sunny;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DBconfig.DBConfig;
import com.niit.Dao.CategoryDao;
import com.niit.DaoImpl.CategoryDaoImpl;
import com.niit.model.Category;

import junit.framework.TestCase;

public class CategoryDaoImplTest extends TestCase {
	ApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class,CategoryDaoImpl.class);
	   CategoryDao categoryDao=(CategoryDao)context.getBean("categoryDao");
	public void testSaveCategory() 
	{
		Category	 category =new Category();
		category.setId(36);
		category.setCategoryname("furniture");
		category.setCategorydesc("made up of oak");
		category=categoryDao.addCategory(category);
		assertTrue(category.getId()>0); //TC
		
	}

	public void testGetCategory() {
		Category category1=categoryDao.selectCategory(34);
		Category category2=categoryDao.selectCategory(4);
		Category category3=categoryDao.selectCategory(1);
		   
		   assertNotNull(category1);
		   assertNotNull(category2);
		   assertNull(category3);
		   
		   
		   String expectedCategoryName="furniture";
		   String actualCategoryName=category1.getCategoryname();
		   assertTrue(expectedCategoryName.equals(actualCategoryName));
	}

	public void testUpdateCategory() {
		
		Category category=categoryDao.selectCategory(6);
		category.setCategoryname("Mobile");
		category.setCategorydesc("all brands available");
		
		categoryDao.updateCategory(category);
		assertTrue(category.getCategoryname()=="Mobile");
		assertTrue(category.getCategorydesc()=="all brands available");
		
	}
		public void testdeleteCategory()
		{
			
			  
			   categoryDao.deleteCategory(68);
	
			   assertNull(categoryDao.selectCategory(68));
		}
		
		
		public void testGetallCategory()
		{
			List<Category> categoryList=categoryDao.getAllCategory();
			assertNotNull(categoryList.isEmpty());
		
		
}

}
