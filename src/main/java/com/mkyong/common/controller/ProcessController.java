package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ProcessController
 */
@Controller
@RequestMapping("/process")
public class ProcessController {

	/**
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		return "process";
	}
}
