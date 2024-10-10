import java.util.Date;
import java.time.LocalDate;

public class Reservation {
    private int roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation(int roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public int Duration() {
        return 0;
    }

    public void updateDates(Date checkin, Date checkout) {
        checkin = this.checkin;
        checkout = this.checkout;
    }
}
