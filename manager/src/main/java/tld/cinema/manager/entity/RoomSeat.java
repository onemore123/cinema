package tld.cinema.manager.entity;

import tld.cinema.manager.interfaces.ScreeningRoomSeat;
import tld.cinema.manager.interfaces.Seat;

public abstract class RoomSeat implements ScreeningRoomSeat {
    private Long id;
    private int number;

    public Long id() {
        return this.id;
    }

    public int number() {
        return this.number;
    }

    @Override
    public String toString() {
        return "Id: " + id + " number: " + number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof RoomSeat)) {
            return false;
        }

        RoomSeat seat = (RoomSeat)obj;

        return id == seat.id
            && number == seat.number;
    }

    @Override
    public int hashCode() {
        int result = Long.hashCode(id);
        result = 31 * result + Integer.hashCode(number);

        return result;
    }
}
