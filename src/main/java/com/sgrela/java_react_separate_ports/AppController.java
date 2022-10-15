package com.sgrela.java_react_separate_ports;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AppController.class);
	
	@RequestMapping({"/"})
	public String loadUI() {
		LOGGER.info("loading UI");
		return "forward:/index.html";
	}

}
