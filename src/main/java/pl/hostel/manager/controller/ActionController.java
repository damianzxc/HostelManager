package pl.hostel.manager.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.hostel.manager.model.Action;
import pl.hostel.manager.service.ActionService;

@RestController
@RequestMapping("/action")
public class ActionController {

	private final ActionService actionService;
	
	public ActionController(ActionService actionService) {
		this.actionService = actionService;
	}
	
	@GetMapping("/last")
	public ResponseEntity<List<Action>> getLastActions() {
		List<Action> lastActions = actionService.getLastActions();
		return new ResponseEntity<>(lastActions, HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Action>> getAllActions() {
		List<Action> allActions = actionService.getAllActions();
		return new ResponseEntity<>(allActions, HttpStatus.OK);
	}
}
