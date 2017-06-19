package com.chip.ProductServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CategoryDao {

	SessionFactory sessionFact = new Configuration().configure().buildSessionFactory();

	public List<Category> getAllCategory() {

		List<Category> CategoryList = new ArrayList<Category>();

		// SessionFactory sessionFact = new
		// Configuration().configure().buildSessionFactory();
		Session session = sessionFact.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			String HQL = "FROM Category";
			Query query = session.createQuery(HQL);

			// ProductList = query.getResultList();
			List categories = query.getResultList();

			for (Iterator iterator = categories.iterator(); iterator.hasNext();) {
				Category category = (Category) iterator.next();

				CategoryList.add(new Category(category.CategoryID, category.CategoryName

				));
			}

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

		return CategoryList;
	}

}
