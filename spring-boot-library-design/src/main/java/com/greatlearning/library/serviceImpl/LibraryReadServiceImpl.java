package com.greatlearning.library.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.greatlearning.library.entity.Library;
import com.greatlearning.library.repository.LibraryRepository;

@Service
public class LibraryReadServiceImpl {
	
	@Autowired
	LibraryRepository readRepository;
	
	public List<Library> getAllLibrary() {
		return readRepository.findAll();
	}
	
	public List<Library> getAllLibrariesWithNoBooks() {
		Library libraryWithNoBooks= new Library();
		libraryWithNoBooks.setCommaSeperatedBookName("");
		//exampleMatcher will make sure that only setCommaSeperatedBookName willbe considered.
		ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("author", 
				ExampleMatcher.GenericPropertyMatchers.exact()).withIgnorePaths("id","commaSeperatedBookName");
//		System.out.println("Just to see how this obj looks like "+libraryWithNoBooks);
		Example<Library> example = Example.of(libraryWithNoBooks, exampleMatcher);
		
		return readRepository.findAll(example);
	}

}
