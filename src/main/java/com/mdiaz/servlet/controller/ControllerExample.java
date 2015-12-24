package com.mdiaz.servlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String listenerPathTest(@PathVariable String var) throws Exception{    	

    	return "this is a test" + var;
    }
    
    @RequestMapping(value = "/method2", method = RequestMethod.GET)     
  	@ResponseBody
  	public void listenerPathTest(HttpServletRequest request, HttpServletResponse response) throws Exception{
  
    	System.out.println("Accesed method");
    	response.setHeader("success", null);
    	
    }

}