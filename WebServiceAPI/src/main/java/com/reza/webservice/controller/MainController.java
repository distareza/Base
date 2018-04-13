package com.reza.webservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reza.webservice.vo.SampleModel;

@Controller
public class MainController {
	
	private static Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping(value = "/sampleid", method = RequestMethod.GET)
    public @ResponseBody Object getSample(HttpServletRequest request) {
    	logger.debug("Sample Page");
    	
    	SampleModel model = new SampleModel();
    	model.setName("name");
    	model.setId(1);
    	model.setEmail("email@email.com");
    	
    	return model;
	}
	
}
