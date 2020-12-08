package tld.cinema.manager.entity;

import java.util.List;

import javax.persistence;

import tld.cinema.manager.interfaces.ScreeningRoom;
import tld.cinema.manager.interfaces.Seat;

@Entity
@Table(name = "screening_room")
public class ScreeningRoom implements ScreeningRoom {
    @Id
    @GeneratedValue
    private Long id;
    private int roomNumber;
    private int roomCapacity;
    private List<Seat> seats;

    public static ScreeningRoom instanceOf(int roomNumber, int roomCapacity) {
        ScreeningRoom room = new ScreeningRoom();
        room.roomNumber = roomNumber;
        room.roomCapacity = roomCapacity;

        return room;
    }

    public Long id() {
        return this.id;
    }

    public int roomNumber() {
        return this.roomNumber;
    }

    public int roomCapacity() {
        return this.roomCapacity;
    }

    public List<Seat> seats() {
        return this.seats;
    }
}
