package pl.hostel.manager.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pl.hostel.manager.model.Person;
import pl.hostel.manager.service.*;

@RestController
@RequestMapping("/persons")
public class PersonController {

	private final PersonService personService;
	
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@GetMapping("all")
	public ResponseEntity<List<Person>> getAllPersons() {
		List<Person> persons = personService.findAllPersons();
		return new ResponseEntity<>(persons, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Person> getAllPersons(@PathVariable("id") Long id) {
		Person person = personService.findPersonById(id);
		return new ResponseEntity<>(person, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Person> addPerson(@RequestBody Person person) {
		Person newPerson = personService.addPerson(person);
		return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Person> updatePerson(@RequestBody Person person) {
		Person updatedPerson = personService.updatePerson(person);
		return new ResponseEntity<>(updatedPerson, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Person> DeletePerson(@PathVariable("id") Long id) {
		personService.deletePersonById(id);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
