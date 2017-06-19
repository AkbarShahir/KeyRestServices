package com.chip.LoginServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.chip.ProductServices.Product;

public class LoginDao {

	SessionFactory sessionFact = new Configuration().configure().buildSessionFactory();

	public LoginUser checkAuthentication(org.json.simple.JSONObject loginUser) {

		Session session = sessionFact.openSession();
		Transaction tx = null;
		List<LoginUser> LoginList = new ArrayList<LoginUser>();
		
		String username = (String)loginUser.get("username");
		String password = (String)loginUser.get("password");
		
		try {
			tx = session.beginTransaction();
			
			
			String HQL = "FROM LoginUser log where log.username=:uid and log.password=:pwd" ;
			Query query = session.createQuery(HQL);
            query.setParameter("uid", username);
            query.setParameter("pwd", password);
            
			//String HQL = "FROM LoginUser";
			//Query query = session.createQuery(HQL);

			// ProductList = query.getResultList();
			LoginList = query.getResultList();
			tx.commit();
		}

		catch (Exception e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}

		finally {
			session.close();
			sessionFact.close();
		}

		return LoginList.isEmpty() ? null : LoginList.get(0);
		//return CategoryList;
	}

}
