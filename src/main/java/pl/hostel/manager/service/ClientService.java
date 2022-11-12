package pl.hostel.manager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.hostel.manager.exception.NotFoundException;
import pl.hostel.manager.model.Client;
import pl.hostel.manager.repository.dao.ClientDAO;

@Service
public class ClientService {

	private final ClientDAO repository;
	
	public ClientService(ClientDAO repository) {
		this.repository = repository;
	}
	
	public Client addClient(Client client) {
		return repository.addClient(client);
	}
	
	public List<Client> findAllClients() {
		return repository.getAllClients();
	}
	
	public Client findClientById(Long id) {
		return repository.getClientById(id)
				.orElseThrow(() -> new NotFoundException("Client by id "+ id + " was not found."));
	}

	public Client updateClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteClientById(Long id) {
		// TODO Auto-generated method stub
		
	}
	
}
