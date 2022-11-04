package pl.hostel.manager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.hostel.manager.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

	//spring is understanding this 
	void deletePersonById(Long id);
	
	Optional<Person> findPersonById(Long id);

	
}
