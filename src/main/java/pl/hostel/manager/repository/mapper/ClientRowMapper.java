package pl.hostel.manager.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import pl.hostel.manager.model.Client;

public class ClientRowMapper implements RowMapper<Client> {

	@Override
	public Client mapRow(ResultSet rs, int i) throws SQLException {
		return new Client(
				rs.getLong("id"),
				rs.getString("name"),
				rs.getString("surname"),
				rs.getString("telephone"),
				rs.getString("address"),
				rs.getString("city"),
				rs.getString("country"),
				List.of()
				);
	}

}
