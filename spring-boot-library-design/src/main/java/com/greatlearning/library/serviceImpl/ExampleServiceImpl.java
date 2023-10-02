package com.greatlearning.library.serviceImpl;

import org.springframework.stereotype.Service;

import com.greatlearning.library.model.FullName;
import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.service.ExampleService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ExampleServiceImpl implements ExampleService {
	
	
	@Override
	public GreatLearning get() {
		log.info("Inside get() method");
		GreatLearning greatlearning = new GreatLearning();  //NoArgs Constructor through Lombok
		greatlearning.setCourseName("Learn Controllers in Spring Boot");
		greatlearning.setCourseType("IT");
//		greatlearning.setInstructorName("Sayan Das");
		greatlearning.setInstructorName(FullName.builder().firstName("Sayan").lastName("Das")
				.build());
		return greatlearning;
		
	}
	
	@Override
	public GreatLearning custominfo(String courseName, String courseType, String firstName, String lastName) {
		log.info("inside custominfo() method");
		GreatLearning greatlearning = new GreatLearning();
		greatlearning.setCourseName(courseName);
		greatlearning.setCourseType(courseType);
//		greatlearning.setInstructorName(instructorName);
		greatlearning.setInstructorName(FullName.builder().firstName("Sayan").lastName("Das")
				.build());
		return greatlearning;
		
	}

}
