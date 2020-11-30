import tld.cinema.manager.interfaces.Seat;

/**
 * A chair in the cinema's screening room
 */
public interface ScreeningRoomSeat extends Seat {
    /**
     * Reservation status indicator
     * @return boolean true if the place has been reserved or false - if not
     */
    public boolean reserved();
    /**
     * Make a reservation
     * @return Seat current object with updated @code{reserved = true} state
     */
    public Seat reserve();
    /**
     * Discard reservation
     * @return Seat current object with updated @code{reserved = false} state
     */
    public Seat cancelReservation();
}
