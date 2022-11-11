package pl.hostel.manager.repository.jdbc;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pl.hostel.manager.model.Client;
import pl.hostel.manager.repository.dao.ClientDAO;
import pl.hostel.manager.repository.mapper.ClientRowMapper;

@Repository
public class ClientDataAccess implements ClientDAO {

	private final JdbcTemplate jdbcTemplate;
	
	public ClientDataAccess(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Client> getAllClients() {
		String sql = "SELECT * FROM client";
		return jdbcTemplate.query(sql, new ClientRowMapper());
	}

	@Override
	public Client addClient(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Client> getClientById(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
}
