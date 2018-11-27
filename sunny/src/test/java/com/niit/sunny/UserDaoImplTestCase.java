/*package com.niit.sunny;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DaoImpl.UserDaoImpl;

import junit.framework.TestCase;

public class UserDaoImplTestCase extends TestCase {
	ApplicationContext context=new AnnotationConfigApplicationContext(DBConfig.class,UserDaoImpl.class);
	   UserDao userDao=(UserDao)context.getBean("userDao");
	public void testSaveUser() 
	{
		User user =new User();
		
		user.setEmail("Blue@gmail.com");
		user.setPassword("Waterbottle");
		
		user=userDao.addUser(user);
		
	//	assertTrue(user.getEmail()>0);
		
	}

	 public void testGetUser()
	 {
	  User user1=userDao.selectUser(100);
	  User user2=userDao.selectUser(103);
	  User user3=userDao.selectUser(15);
	  assertNotNull(user1);
	  assertNotNull(user2);
	  assertNull(user3);
	  String expectedmailId="Blue@gmail.com";
	  String actualmailId=user1.getEmail();
	  assertTrue(expectedmailId.equals(actualmailId));
	 }
	 public void testDeleteUser()
	 {
	  userdao.deleteUser(100);  
	  assertNull(userDao.selectUser(100));	 
	 }
	 public void testGetAllUsers()
	 {
	  List<User> userList=userDao.getUser(); 
	  assertNotNull(userList.isEmpty());
	 }

}
*/