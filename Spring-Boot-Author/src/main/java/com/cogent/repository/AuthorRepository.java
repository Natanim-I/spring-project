package com.cogent.repository;

import org.springframework.data.repository.CrudRepository;

import com.cogent.entity.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
