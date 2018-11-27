package com.niit.sunny;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DBconfig.DBConfig;
import com.niit.Dao.SupplierDao;
import com.niit.DaoImpl.SupplierDaoImpl;
import com.niit.model.Supplier;

import junit.framework.TestCase;

public class SupplierDaoImplTest extends TestCase {
	ApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class,SupplierDaoImpl.class);
	   SupplierDao supplierDao=(SupplierDao)context.getBean("supplierDao");
	public void testSaveSupplier() {
		Supplier supplier =new Supplier();
		supplier.setId(89);
		supplier.setSuppliername("food");
		supplier.setSupplierdesc("snacks and breads");
		
		supplier=supplierDao.addSupplier(supplier);
		assertTrue(supplier.getId()>0); 
	}
	public void testUpdateSupplier()
	{
	  Supplier supplier=supplierDao.selectSupplier(103);
	 
	  supplier.setSuppliername("clothes");
	  supplier.setSupplierdesc("gens wear");
	  supplierDao.updateSupplier(supplier);

	  assertTrue(supplier.getSuppliername()=="clothes");
	  assertTrue(supplier.getSupplierdesc()=="gens wear");
	 }
	 public void testGetSupplier()
	 {
	  Supplier supplier1=supplierDao.selectSupplier(106);
	  Supplier supplier2=supplierDao.selectSupplier(109);
	  Supplier supplier3=supplierDao.selectSupplier(1000);
	  assertNotNull(supplier1);
	  assertNotNull(supplier2);
	  assertNull(supplier3);
	  
	  String expectedSupplierdesc="snacks and breads";
	  String actualsupplierdesc=supplier2.getSupplierdesc();
	  assertTrue(expectedSupplierdesc.equals(actualsupplierdesc));
	 }
	 public void testDeleteSupplier()
	 {
	  supplierDao.deleteSupplier(70);  
	  assertNull(supplierDao.selectSupplier(70));	 
	 }   
	public void testGetAllSupplier()
	 {
	  List<Supplier> supplierList=supplierDao.getAllSupplier(); 
	  assertNotNull(supplierList.isEmpty());
	 }

}
