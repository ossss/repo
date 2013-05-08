package com.itstatistics.mvc.model;

import java.util.Calendar;
import java.util.List;

import org.firebrandocm.dao.PersistenceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itstatistics.mvc.model.dao.CassandraDao;
import com.itstatistics.mvc.model.entities.Language;

@Component
public class LanguageStatisticsServiceModel {

	@Autowired
	CassandraDao<Language> dao;

	@Autowired
	PersistenceFactory persistenceFactory;

	public void fillCassandra() {
		final Language lang = new Language();
		lang.setCity("Poznan");
		lang.setCountry("Poland");
		lang.setDate(Calendar.getInstance().getTime());
		lang.setLanguageName("Java");
		lang.setNumberOfJobs(100);
		lang.setWwwAddress("www.pracuj.pl");
		dao.persist(lang);
	} 

	public List<Language> getData(String... languages) {
		return dao.getDataByKey(languages);
	}

}
