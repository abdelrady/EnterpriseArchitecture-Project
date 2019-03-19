package edu.mum.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.mum.dao.AuthorityDao;
import edu.mum.dao.UserDao;
import edu.mum.domain.*;

@SuppressWarnings("unchecked")
@Repository
public class AuthorityDaoImpl extends GenericDaoImpl<Authority> implements AuthorityDao {

	public AuthorityDaoImpl() {
		super.setDaoType(Authority.class);
	}

}