/**
 * Class Name:			HomeController
 * Created On:			7:02:18 PM, Apr 2, 2014
 *
 * Copyright (c) 2014 Cordis Technology. All rights reserved.
 *
 * Use is subject to license terms.
 */

package com.codistech.web.controller;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests for the application home page.
 */
@RestController
@EnableDiscoveryClient
// @RefreshScope
public class HomeController {

	@Value("${appname:Config Server is not working. Please check...}")
	private String	appname;
	@Value("${version:Config Server is not working. Please check...}")
	private String	version;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public Map<String, Object> home(Locale locale, Model model) {

		Map<String, Object> response = new HashMap<>();
		response.put("appname", appname);
		return response;

	}

}
