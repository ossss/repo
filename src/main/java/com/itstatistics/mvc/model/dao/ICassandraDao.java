package com.itstatistics.mvc.model.dao;

import java.util.List;

public interface ICassandraDao<T> {

	public List<T> getDataByKey(String... keys);

	public void persist(T... entities);
}
