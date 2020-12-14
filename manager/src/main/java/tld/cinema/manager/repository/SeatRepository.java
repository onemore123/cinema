package tld.cinema.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tld.cinema.manager.model.ScreeningRoom;

public interface SeatRepository extends JpaRepository<RoomSeat, Long> {

}   
