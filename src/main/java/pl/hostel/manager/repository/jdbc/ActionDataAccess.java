package pl.hostel.manager.repository.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pl.hostel.manager.model.Action;
import pl.hostel.manager.repository.dao.ActionDAO;
import pl.hostel.manager.repository.mapper.ActionRowMapper;

@Repository
public class ActionDataAccess implements ActionDAO{
	
	private final JdbcTemplate jdbcTemplate;
	
	public ActionDataAccess(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Action> getAllActions() {
		String sql = "SELECT a.`id` "
				+ ", a.`description` "
				+ ", a.`start_date` "
				+ ", a.`end_date` "
				+ ", a.`note` "
				+ ", a.`action_type_id` "
				+ ", atype.`id` "
				+ ", atype.`type` "
				+ ", atype.`description` as `type_description` "
				+ "FROM `hostel_manager`.`action` a "
				+ "LEFT JOIN `hostel_manager`.`action_type` atype "
				+ "ON a.`action_type_id` = atype.`id` ";
		return jdbcTemplate.query(sql, new ActionRowMapper());
	}

	@Override
	public List<Action> getLastActions(int count) {
		String sql = "SELECT a.`id` "
				+ ", a.`description` "
				+ ", a.`start_date` "
				+ ", a.`end_date` "
				+ ", a.`note` "
				+ ", a.`action_type_id` "
				+ ", atype.`id` "
				+ ", atype.`type` "
				+ ", atype.`description` as `type_description` "
				+ "FROM `hostel_manager`.`action` a "
				+ "LEFT JOIN `hostel_manager`.`action_type` atype "
				+ "ON a.`action_type_id` = atype.`id` "
				+ "ORDER BY a.`start_date` DESC "
				+ "LIMIT ?";
		return jdbcTemplate.query(sql, new ActionRowMapper(), count);
	}

}
