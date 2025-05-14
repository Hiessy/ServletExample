package com.hiessy.servlet.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*
 * 
 * The <code>ControllerExample</code> class controls how access to the webApp will be obtained
 * via the browser.
 * Addresses is mapped to /localhost:8080/test/example/method1/var=123.
 * version 1.0
 * 
 * @author  Martín Díaz
 */
@RestController
@RequestMapping("/example")
public class ControllerExample {

	@RequestMapping(value = "/method1/{var}", method = RequestMethod.GET)
	@ResponseBody
	public String listenerPathTest(@PathVariable String var) throws Exception {
		
		return "this is a test" + var;
	}

}