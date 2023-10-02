package com.greatlearning.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.library.model.FullName;
import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.serviceImpl.LibraryReadServiceImpl;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootLibraryDesignApplication implements CommandLineRunner {
	
	@Autowired
	LibraryReadServiceImpl libraryReadServiceImpl;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLibraryDesignApplication.class, args);
		System.out.println("Hi.!!!!!!");
		System.out.println("hello spring boot____________");
		System.out.println("Hello Dev Tools");
		System.out.println("Running fine");

	}

	@Override
	public void run(String... args) throws Exception {
//		GreatLearning greatlearning = new GreatLearning();
//		greatlearning.setCourseName("Designing microservices using spring boot");
//		greatlearning.setCourseType("IT");
//		greatlearning.setInstructorName("Sayan Das");
//		System.out.println("Great Learning object" + greatlearning);
//		System.out.println("Course Name" + greatlearning.getCourseName());
//		System.out.println("Course Type" + greatlearning.getCourseType());
//		greatlearning.setCourseName("Designing microservices using spring boot");  //using lombok, we can avoid broilerplate codes
//		greatlearning.getCourseName();
//		System.out.println(greatlearning.getCourseName());

//		GreatLearning greatlearning = new GreatLearning("Using Lombok AllArgs and NoArgs Constructor", 
//				"IT", "Sayan Das");
//		System.out.println(greatlearning);  //AllArgsConstructor through Lombok
//		
//		GreatLearning glWithBuilderPattern = GreatLearning.builder().courseName("lombok builder")
//				.courseType("IT").instructorName("Sayan Das").build();
//		System.out.println("Implementation with @Builder Pattern" +glWithBuilderPattern);

//		GreatLearning glComplexObject = GreatLearning.builder()
//				.courseName("Complex object creation with " + "builder pattern").courseType("IT")
//				.instructorName(FullName.builder().firstName("Sayan").lastName("Das").build()).build();
//		
//		GreatLearning glComplexObject1 = GreatLearning.builder()
//				.courseName("Complex object creation example "+ "builder pattern").courseType("IT")
//				.instructorName(FullName.builder().firstName("MS").lastName("Dhoni").build()).build();
//
////		System.out.println("Complex object with Builder pattern " + glComplexObject);
//		log.info("GL Complex Object Creation -> {}", glComplexObject);
//		log.info("Complex object creation -> {}", glComplexObject1);
		
		log.info("Fetch all Libraries -> {}", libraryReadServiceImpl.getAllLibrary());
//		libraryReadServiceImpl.getAllLibrariesWithNoBooks();
		log.info("Fetch all libraries with no books -> {}",libraryReadServiceImpl.getAllLibrariesWithNoBooks());

	}

}
