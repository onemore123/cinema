package tld.cinema.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tld.cinema.manager.model.ScreeningRoom;

public interface ScreeningRoomRepository extends JpaRepository<Room, Long> {

}   
