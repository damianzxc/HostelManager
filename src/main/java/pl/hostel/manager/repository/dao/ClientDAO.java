package pl.hostel.manager.repository.dao;

import java.util.List;
import java.util.Optional;

import pl.hostel.manager.model.Client;

public interface ClientDAO {

	List<Client> getAllClients();
	Client addClient(Client client);
	Optional<Client> getClientById(long id);
	
}
