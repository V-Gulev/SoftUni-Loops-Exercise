import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        double price;
        double totalPrice = 0;
        for (int i = 0; i < N; i++) {
            double pricePerCapsule = Double.parseDouble(sc.nextLine());
            int daysInMonth = Integer.parseInt(sc.nextLine());
            int capsuleCount = Integer.parseInt(sc.nextLine());
            price = ((daysInMonth * capsuleCount) * pricePerCapsule);
            totalPrice += price;
            System.out.printf("The price for the coffee is: $%.2f", price);
            System.out.println();
        }
        System.out.printf("Total: $%.2f", totalPrice);

    }
}


