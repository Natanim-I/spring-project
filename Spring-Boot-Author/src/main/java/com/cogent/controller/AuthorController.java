package com.cogent.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.entity.Author;
import com.cogent.service.AuthorService;

@Controller
@ResponseBody

@RestController
public class AuthorController {
	@Autowired
	AuthorService authorService;
	//Get authors list
	@GetMapping(value= {"/authors"})
	public List<Author> getAllAuthors(){
		List<Author> authors = authorService.getAllAuthors();
		System.out.println("Authors "+authors.size());
		return authors;
	}
	
	//Get an author
	@GetMapping("/author/{id}")
	public Author get(@PathVariable("id") Integer id) {
		Optional<Author> author = authorService.get(id);
		return author.get();
	}

	//Add author
	@PostMapping("/authors")
	public Author addAuthor(@RequestBody Author author) {
		return authorService.updateAuthor(author);
	}
	
	//Update author
	@PutMapping("/authors")
	public Author editAuthor(@RequestBody Author author) {
		return authorService.updateAuthor(author);
	}
	
	//Delete author
	@DeleteMapping("/authors")
	public String deleteAuthor(@RequestParam(value="id") Integer id) {
		Optional<Author> author = authorService.get(id);
		authorService.deleteAuthor(author.get());
		return "Author id "+id+" deleted!";
	}
}
