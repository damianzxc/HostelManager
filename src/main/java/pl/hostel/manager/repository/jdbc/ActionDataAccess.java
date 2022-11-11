package pl.hostel.manager.repository.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pl.hostel.manager.model.Action;
import pl.hostel.manager.repository.dao.ActionDAO;

@Repository
public class ActionDataAccess implements ActionDAO{
	
	private final JdbcTemplate jdbcTemplate;
	
	public ActionDataAccess(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Action> getAllActions() {
		return null;
	}

	@Override
	public List<Action> getLastActions() {
		return null;
	}

}
