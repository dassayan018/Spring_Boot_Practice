package com.greatlearning.library.service;

import com.greatlearning.library.model.GreatLearning;

public interface ExampleService {

	GreatLearning get();

	GreatLearning custominfo(String courseName, String courseType, String firstName, String lastName);

}