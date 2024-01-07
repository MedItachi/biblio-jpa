package org.mql.biblio.controllers;

import java.util.List;

import org.mql.biblio.models.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {
	@Autowired
	private List<Author> authors;
	
	public AuthorController() {
		
	}
	//List des points terminaux : End-points
	@GetMapping
	public List<Author> getAllAuthors(){
		return authors;
	}
	//Optional to avoid null
	@GetMapping("/{id}")
	public ResponseEntity<Author> getAuthor(@PathVariable("id") int id){
		
		for(Author author : authors) {
			if(author.getId()==id) return ResponseEntity.ok().body(author);
		}
		return  ResponseEntity.notFound().build();
	}
	
	/*
	 *l'Annotation @RequestBody suppose que la requete est ube requete AJAX avec
	 *les donnes recu dans le corp sous format JSON/XMl
	 *S'il s'agit d'une requete Post ordinaire on ne doit pas utiliser cette annotation
	 *on pourra utlise par contre l'annotation @ModelAttribute , on peut aussi utliser
	 *l'annoation @RequestParam sur les parametres du point terminal 
	 */
	
	@PostMapping
	public Author addAuthor(@RequestBody Author author) {
		authors.add(author);
		return author;
	}
	
	

}
