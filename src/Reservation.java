import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import static sun.security.krb5.Config.duration;

public class Reservation {
    private int roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("ddMM/yyyy");

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

    public long duration() {
        long diff = checkin.getTime() - checkout.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkin, Date checkout) {
        checkin = this.checkin;
        checkout = this.checkout;
    }

    @Override
    public String toString() {
        return "Reservation {" +
                "roomNumber=" + roomNumber +
                ", checkin=" + sdf.format(checkin) +
                ", checkout=" + sdf.format(checkout) +
                ", duration=" + duration() + " (days)" +
                '}';
    }
}
