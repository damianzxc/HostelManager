package pl.hostel.manager.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.hostel.manager.exception.PersonNotFoundException;
import pl.hostel.manager.model.Person;
import pl.hostel.manager.repository.PersonRepository;

@Service
@Transactional
public class PersonService {

	private final PersonRepository repository;
	
	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.repository = personRepository;
	}
	
	public Person addPerson(Person person) {
		person.setPersonCode(UUID.randomUUID().toString());
		return repository.save(person);
	}
	
	public List<Person> findAllPersons() {
		return repository.findAll();
	}
	
	public Person updatePerson(Person person) {
		return repository.save(person);
	}
	
	public Person findPersonById(Long id) {
		return repository.findPersonById(id)
				.orElseThrow(() -> new PersonNotFoundException("Person by id "+ id + " was not nound"));
	}
	
	public void deletePersonById(Long id) {
		repository.deletePersonById(id);
	}
}
