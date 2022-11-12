package pl.hostel.manager.repository.mapper;

import pl.hostel.manager.model.Action;
import pl.hostel.manager.model.ActionType;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ActionRowMapper implements RowMapper<Action> {

	@Override
	public Action mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Action(
				rs.getLong("id"),
				rs.getDate("start_date"),
				rs.getDate("end_date"),
				new ActionType(
						rs.getLong("action_type_id"),
						rs.getString("type"),
						rs.getString("type_description")),
				rs.getString("description"),
				rs.getString("note")
				);
	}

}
