package tld.cinema.manager.entity;

import java.util.List;

import javax.persistence.*;

import tld.cinema.manager.interfaces.ScreeningRoom;
import tld.cinema.manager.interfaces.Seat;

@Entity
@Table(name = "room")
public class Room implements ScreeningRoom {
    @Id
    @GeneratedValue
    private Long id;
    private int roomNumber;
    private int roomCapacity;
    private List<Seat> seats;

    public static Room instanceOf(int roomNumber, int roomCapacity) {
        Room room = new Room();
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
