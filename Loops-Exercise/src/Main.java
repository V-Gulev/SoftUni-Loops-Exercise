import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String day = scanner.nextLine();
        double totalCost = 0;
        switch (typeOfPeople) {
            case "Students":
                switch (day) {
                    case "Friday":
                        totalCost = people * 8.45;
                        break;
                    case "Saturday":
                        totalCost = people * 9.80;
                        break;
                    case "Sunday":
                        totalCost = people * 10.46;
                        break;
                    default:
                        break;
                }
                if (people >= 30) {
                    totalCost *= 0.85;
                }
                break;
            case "Business":
                if (people >= 100) {
                    people -= 10;
                }
                switch (day) {
                    case "Friday":
                        totalCost = people * 10.90;
                        break;
                    case "Saturday":
                        totalCost = people * 15.60;
                        break;
                    case "Sunday":
                        totalCost = people * 16.00;
                        break;
                    default:
                        break;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        totalCost = people * 15.00;
                        break;
                    case "Saturday":
                        totalCost = people * 20.00;
                        break;
                    case "Sunday":
                        totalCost = people * 22.50;
                        break;
                    default:
                        break;
                }
                if (people >= 10 && people <= 20) {
                    totalCost *= 0.95;
                }
                break;
            default:
                break;
        }
        System.out.printf("Total price: %.2f",totalCost);

    }
}
