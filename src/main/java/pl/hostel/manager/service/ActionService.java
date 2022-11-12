package pl.hostel.manager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.hostel.manager.model.Action;
import pl.hostel.manager.repository.dao.ActionDAO;

@Service
public class ActionService {

	private final ActionDAO actionDAO;

	public ActionService(ActionDAO actionDAO) {
		this.actionDAO = actionDAO;
	}

	public List<Action> getLastActions(int count) {
		return actionDAO.getLastActions(count);
	}

	public List<Action> getAllActions() {
		return actionDAO.getAllActions();
	}
	
}
