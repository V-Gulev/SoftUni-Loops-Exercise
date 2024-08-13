import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        double spentMoney = 0;

        while (true) {
            String gameName = sc.nextLine();

            if (gameName.equals("Game Time") && budget>0) {
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", spentMoney, budget);
                break;
            }else if (gameName.equals("Game Time")) break;

            switch (gameName) {
                case "OutFall 4":
                    if (budget < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        budget -= 39.99;
                        spentMoney += 39.99;
                        System.out.println("Bought OutFall 4");
                    }
                    break;
                case "CS: OG":
                    if (budget < 15.99) {
                        System.out.println("Too Expensive");
                    } else {
                        budget -= 15.99;
                        spentMoney += 15.99;
                        System.out.println("Bought CS: OG");
                    }
                    break;
                case "Zplinter Zell":
                    if (budget < 19.99) {
                        System.out.println("Too Expensive");
                    } else {
                        budget -= 19.99;
                        spentMoney += 19.99;
                        System.out.println("Bought Zplinter Zell");
                    }
                    break;
                case "Honored 2":
                    if (budget < 59.99) {
                        System.out.println("Too Expensive");
                    } else {
                        budget -= 59.99;
                        spentMoney += 59.99;
                        System.out.println("Bought Honored 2");
                    }
                    break;
                case "RoverWatch":
                    if (budget < 29.99) {
                        System.out.println("Too Expensive");
                    } else {
                        budget -= 29.99;
                        spentMoney += 29.99;
                        System.out.println("Bought RoverWatch");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (budget < 39.99) {
                        System.out.println("Too Expensive");
                    } else {
                        budget -= 39.99;
                        spentMoney += 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

            if (budget == 0) {
                System.out.println("Out of money!");
            }
        }
    }
}
