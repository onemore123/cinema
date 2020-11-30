package tld.cinema.manager.model;

import tld.cinema.manager.interfaces.Seat;

public abstract class Seat implements Seat {
    private Long id;
    private int number;

    public static Seat instanceOf(int number) {
        Seat seat = new Seat();
        seat.number = number;

        return seat;
    }

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

        if (!(obj instanceof Seat)) {
            return false;
        }

        Seat seat = (Seat)obj;

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
