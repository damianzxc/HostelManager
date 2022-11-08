package pl.hostel.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.hostel.manager.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

	int getVacantRoomsNumber();
	int getOccupiedRoomsNumber();
	
}
