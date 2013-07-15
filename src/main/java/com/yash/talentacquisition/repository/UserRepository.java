package com.yash.talentacquisition.repository;


import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yash.talentacquisition.model.User;

@Repository
public class UserRepository {
	private transient final Logger logger = LoggerFactory.getLogger( getClass() );
    
    @Autowired(required=true)
    private SessionFactory sessionFactory;
    
	public User findUserByEmail(String email) {
		logger.debug("####### : trying to find users by email : "+email);
		Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(User.class)
            .add( Restrictions.eq("email", email) );
		return (User) criteria.uniqueResult();
	}
}
