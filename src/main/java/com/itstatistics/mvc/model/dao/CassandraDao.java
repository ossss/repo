package com.itstatistics.mvc.model.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.firebrandocm.dao.PersistenceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CassandraDao<T> implements ICassandraDao<T> {

	@Autowired
	PersistenceFactory persistenceFactory;
	Class<T> cassandraDaoType;


	public List<T> getDataByKey(String... keys) {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		cassandraDaoType = (Class) pt.getActualTypeArguments()[0];
		List<T> resultList = new ArrayList<T>();
		for (String key : keys) {
			resultList.add(persistenceFactory.get(cassandraDaoType, key));
		}
		return resultList;
	}

	public void persist(T... entities) {
		persistenceFactory.persist(entities);
	}

}
