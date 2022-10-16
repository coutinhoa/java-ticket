import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write or age and write true if you are freshman or false if you are not");

        int age = scanner.nextInt();
        boolean isFreshman =scanner.nextBoolean();
        scanner.nextLine();
        Ticket ticket1 = new Ticket(age, isFreshman);

        age = scanner.nextInt();
        isFreshman =scanner.nextBoolean();
        scanner.nextLine();
        Ticket ticket2 = new Ticket(age, isFreshman);

        var price1 = ticket1.getPriceWith(ticket2);
        var price2= ticket2.getPriceWith(ticket1);
        scanner.close();

        System.out.println(price1);
        System.out.println(price2);
            ;

    }
}