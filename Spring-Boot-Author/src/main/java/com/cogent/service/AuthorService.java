package com.cogent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.entity.Author;
import com.cogent.repository.AuthorRepository;

@Service
public class AuthorService {
  @Autowired
  AuthorRepository authorRepo;
  
  //Show authors
  public List<Author> getAllAuthors(){
	  return (List<Author>) authorRepo.findAll();
  }

  //Get an author
  public Optional<Author> get(int authorId){
	  return authorRepo.findById(authorId);
  }
  
  //Insert or Update author
  public Author updateAuthor(Author author) {
	  return authorRepo.save(author);
  }
  
  //Delete author
  public void deleteAuthor(Author author) {
	  authorRepo.delete(author);
  }
}
