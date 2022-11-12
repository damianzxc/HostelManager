package pl.hostel.manager.repository.dao;

import java.util.List;

import pl.hostel.manager.model.Action;

public interface ActionDAO {

	List<Action> getAllActions();
	List<Action> getLastActions(int count);
}
