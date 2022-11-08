package pl.hostel.manager.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.hostel.manager.exception.ClientNotFoundException;
import pl.hostel.manager.model.Client;
import pl.hostel.manager.repository.ClientRepository;

@Service
@Transactional
public class ClientService {

	private final ClientRepository repository;
	
	@Autowired
	public ClientService(ClientRepository repository) {
		this.repository = repository;
	}
	
	public Client addClient(Client client) {
		return repository.save(client);
	}
	
	public List<Client> findAllClients() {
		return repository.findAll();
	}
	
	public Client updateClient(Client client) {
		return repository.save(client);
	}
	
	public Client findClientById(Long id) {
		return repository.findClientById(id)
				.orElseThrow(() -> new ClientNotFoundException("Client by id "+ id + " was not nound"));
	}
	
	public void deleteClientById(Long id) {
		repository.deleteClientById(id);
	}
	
	
}
