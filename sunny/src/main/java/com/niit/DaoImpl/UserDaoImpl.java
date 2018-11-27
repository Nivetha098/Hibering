package com.niit.DaoImpl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.UserDao;
import com.niit.model.User;

@Repository("userDao")
@Transactional

public class UserDaoImpl implements UserDao{

	@Autowired
SessionFactory sessionFactory;
	public User addUser(User user) 
	{
		sessionFactory.getCurrentSession().save(user);
		return user;

	}
	
	public void updateUser(User user)
	{
		sessionFactory.getCurrentSession().update(user);

	}
	
		public List<User> getUser() {
		
		return sessionFactory.getCurrentSession().createQuery("from User").list();

	}

	public void deleteUser(int id) {
		Session session=sessionFactory.getCurrentSession();
		User p1=(User) session.get(User.class, id);
		session.delete(p1);
		
	}

	public User selectUser(int id) {
		// TODO Auto-generated method stub
		Object obj=sessionFactory.getCurrentSession().get(User.class,id);
		User p=(User)obj;
		return p;
	}

	
		
	}
			
	
			
	

	


