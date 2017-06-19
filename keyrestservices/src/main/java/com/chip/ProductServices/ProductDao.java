package com.chip.ProductServices;

import java.sql.DriverManager;
import java.util.ArrayList;

import java.util.List;
import java.util.Date;
import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.chip.ProductServices.Category;
import com.chip.ProductServices.Product;

/*import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;*/
/*import com.tutorialspoint.EmployeeEntity.Employee;*/

public class ProductDao {

	SessionFactory sessionFact = new Configuration().configure().buildSessionFactory();

	public void deleteProduct(int productid) {

		// SessionFactory sessionFact = new
		// Configuration().configure().buildSessionFactory();
		Session session = sessionFact.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Product pr = (Product) session.get(Product.class, productid);
			// session.delete(employee); //This also can be used
			session.delete("Product", pr);
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
	}

	public int addProduct(Product product) {
		Session session = sessionFact.openSession();
		Transaction tx = null;
		int productId = 0;
		try {
			tx = session.beginTransaction();
			// Product employee = new Employee(fname, lname, salary);
			productId = (Integer) session.save(product);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sessionFact.close();
		}
		return productId;
	}

	public void updateProduct(Product pro) {
		// SessionFactory sessionFact = new
		// Configuration().configure().buildSessionFactory();

		Session session = sessionFact.openSession();
		Transaction tx = null;

		try {

			tx = session.beginTransaction();
			Product pr = (Product) session.get(Product.class, pro.getPRODUCT_ID());

			pr.setNOTE(pro.getNOTE());
			pr.setPRODUCT_CATEGORY(pro.getPRODUCT_CATEGORY());
			pr.setPRODUCT_DESC(pro.getPRODUCT_DESC());
			pr.setPRODUCT_DISCOUNT(pro.getPRODUCT_DISCOUNT());
			pr.setPRODUCT_NAME(pro.getPRODUCT_NAME());
			pr.setPRODUCT_QTY(pro.getPRODUCT_QTY());
			pr.setPRODUCT_REORDER_LEVEL(pro.getPRODUCT_REORDER_LEVEL());
			pr.setPRODUCT_SELLPRICE(pro.getPRODUCT_SELLPRICE());
			pr.setPRODUCT_SIZE(pro.getPRODUCT_SIZE());
			pr.setPRODUCT_UNITPRICE(pro.getPRODUCT_UNITPRICE());
			pr.setPRODUCT_WEIGHT(pro.getPRODUCT_WEIGHT());
			pr.setSUPPLIER_ID(pro.getSUPPLIER_ID());

			session.update(pr);
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

	}

	public Product getProduct(int ProductID) {

		Session session = sessionFact.openSession();
		Transaction tx = null;
		Product product = null;

		try {
			tx = session.beginTransaction();
			product = (Product) session.get(Product.class, ProductID);
			tx.commit();

		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sessionFact.close();
		}
		return product;

	}

	public List<Product> getAllProducts() {

		List<Product> ProductList = new ArrayList<Product>();

		// SessionFactory sessionFact = new
		// Configuration().configure().buildSessionFactory();
		Session session = sessionFact.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();

			String HQL = "FROM Product";
			Query query = session.createQuery(HQL);

			// ProductList = query.getResultList();
			List products = query.getResultList();

			for (Iterator iterator = products.iterator(); iterator.hasNext();) {
				Product product = (Product) iterator.next();

				ProductList.add(new Product(product.getPRODUCT_ID(), product.getPRODUCT_NAME(),
						product.getPRODUCT_DESC(), product.getPRODUCT_CATEGORY(), product.getSUPPLIER_ID(),
						product.getPRODUCT_QTY(), product.getPRODUCT_UNITPRICE(), product.getPRODUCT_SELLPRICE(),
						product.getPRODUCT_WEIGHT(), product.getPRODUCT_SIZE(), product.getPRODUCT_DISCOUNT(),
						product.getUNITS_IN_STOCK(), product.getUNITS_ORDER_SUPPLIER(),
						product.getPRODUCT_REORDER_LEVEL(), product.getNOTE(), null, null, null, null

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

		return ProductList;
	}

	public List<Category> getCategories() {

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

				CategoryList.add(new Category(category.getCategoryID(), category.getCategoryName()

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
