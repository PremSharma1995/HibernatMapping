package com.jbk.mapping.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.mapping.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveProduct(Product product) {

		Session session = null;
		Transaction transaction = null;
		boolean isAdded = false;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Product prd = session.get(Product.class, product.getProductId());
			if (prd == null) {
				session.save(product);
				transaction.commit();
				isAdded = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();

			}
		}

		return isAdded;
		
	}

}
