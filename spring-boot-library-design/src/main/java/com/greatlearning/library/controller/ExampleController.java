package com.greatlearning.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.service.ExampleService;

//@Controller
@RestController
public class ExampleController {
	
	
	@Autowired
	ExampleService exampleService;
	
	@GetMapping("/info")
//	@ResponseBody   //Required when using Controller instead of Rest Controller
	public GreatLearning get() {
//		GreatLearning greatlearning = new GreatLearning();  //NoArgs Constructor through Lombok
//		greatlearning.setCourseName("Learn Controllers in Spring Boot");
//		greatlearning.setCourseType("IT");
////		greatlearning.setInstructorName("Sayan Das");
		return exampleService.get();
		
	}
	
	@PostMapping("customInfo")
	public GreatLearning custominfo(String courseName, String courseType, String firstName, String lastName) {
//		GreatLearning greatlearning = new GreatLearning();
//		greatlearning.setCourseName(courseName);
//		greatlearning.setCourseType(courseType);
////		greatlearning.setInstructorName(instructorName);
		return exampleService.custominfo(courseName, courseType, firstName, lastName);
		
	}

}
