package pl.hostel.manager.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.hostel.manager.model.Client;
import pl.hostel.manager.service.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {

private final ClientService clientService;
	
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}
	
	@GetMapping("all")
	public ResponseEntity<List<Client>> getAllClients() {
		List<Client> clients = clientService.findAllClients();
		return new ResponseEntity<>(clients, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Client> findClientById(@PathVariable("id") Long id) {
		Client client = clientService.findClientById(id);
		return new ResponseEntity<>(client, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Client> addClient(@RequestBody Client client) {
		Client newClient = clientService.addClient(client);
		return new ResponseEntity<>(newClient, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Client> updateClient(@RequestBody Client client) {
		Client updatedClient = clientService.updateClient(client);
		return new ResponseEntity<>(updatedClient, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Client> DeleteClient(@PathVariable("id") Long id) {
		clientService.deleteClientById(id);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
