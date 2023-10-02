package com.greatlearning.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.library.entity.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {
	//extends JPArepository(enitiy name, primary key data type)

}
