import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Room number: ");
            int roomNumber = sc.nextInt();

            System.out.println("Checkin date: ");
            Date checkin = sdf.parse(sc.next());
            System.out.println("Checkout date: ");
            Date checkout = sdf.parse(sc.next());

            Reservation reservation = new Reservation(roomNumber, checkin, checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println("Enter data to update the reservation:");
            System.out.println("Checkin: ");
            checkin = sdf.parse(sc.next());
            System.out.println("Checkout: ");
            checkout = sdf.parse(sc.next());

            reservation.updateDates(checkin, checkout);
            System.out.println("Rservation: " + reservation);
        }
        catch (ParseException e) {
            System.out.println("Invalid date format " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error in reservation " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input " + e.getMessage());
        }
    }
}
