package pl.hostel.manager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.hostel.manager.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

	void deleteClientById(Long id);
	
	Optional<Client> findClientById(Long id);

}
