import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Reservation[] totalDeQuartos = new Reservation[20];

        System.out.println("Insira quantos quartos serão ocupados:");
        int n = sc.nextInt();

        for(int i=0; i<n; i++ ) {
            System.out.println("Número do quarto: ");
            int roomNumber = sc.nextInt();

            System.out.println("Data de entrada: ");
            String checkin = sc.next();
            Date entrada = sdf.parse(checkin);

            System.out.println("Data de saída");
            String checkout = sc.next();
            Date saida = sdf.parse(checkout);

            totalDeQuartos[i] = new Reservation(roomNumber, new Date(checkin), new Date(checkout));
            

        }

        System.out.println("Quartos ocupados");
        for (Reservation c: totalDeQuartos) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }
}
