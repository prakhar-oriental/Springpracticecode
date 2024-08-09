package com.org.basic.Springbootbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.basic.Springbootbasic.model.PostRequest;
import com.org.basic.Springbootbasic.model.PostResponse;
import com.org.basic.Springbootbasic.model.sampleResponse;

@RestController
@RequestMapping("/sample")
public class webController {
	
   @GetMapping("/data")
  public sampleResponse sample(@RequestParam(value="name",defaultValue="java") String name) 
  {
	sampleResponse obj = new sampleResponse();
	obj.setMessage(name);
	obj.setId(3);
	  return obj;
  }
   
   @PostMapping
   public PostResponse Test(@RequestBody PostRequest inputPayload)
   {
	   PostResponse response = new PostResponse();
	   response.setId(inputPayload.getId()*100);
	   response.setMessage(inputPayload.getName());
	   response.setExtra("some extra");
	   return response;
   }
   
   
}
