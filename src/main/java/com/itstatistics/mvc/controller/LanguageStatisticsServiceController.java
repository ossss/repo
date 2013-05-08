package com.itstatistics.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itstatistics.mvc.model.LanguageStatisticsServiceModel;
import com.itstatistics.mvc.model.entities.Language;

@Controller
@RequestMapping("/languages")
public class LanguageStatisticsServiceController {

	@Autowired
	LanguageStatisticsServiceModel languageStatisticsServiceModel;
	

	@RequestMapping(value = "{languages}", method = RequestMethod.GET)
	public @ResponseBody
	Language getLanguagesInJSON(@PathVariable String... languages) {
		for (String ko : languages)
			System.out.println(ko);
		
		languageStatisticsServiceModel.getData(languages);

		Language shop = new Language();
		shop.setCity("Czesc");
		shop.setCountry("czesc");
		return shop;
	}

}
