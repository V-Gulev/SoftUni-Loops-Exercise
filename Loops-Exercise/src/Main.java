import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double moneyDouble;
        while (true) {
            String money = sc.nextLine();
            if (money.equals("Start")) {
                break;
            }
            switch (money) {
                case "0.1", "0.2", "0.5", "1", "2":
                    moneyDouble = Double.parseDouble(money);
                    sum += moneyDouble;
                    break;
                default:
                    moneyDouble = Double.parseDouble(money);
                    System.out.printf("Cannot accept %.2f", moneyDouble);
                    System.out.println(" ");
                    break;
            }
        }
        while (true) {
            String food = sc.nextLine();
            if (food.equals("End")){
                System.out.printf("Change: %.2f",sum);
                break;
            }
            switch (food) {
                case "Nuts":
                    if (sum >= 2) {
                        System.out.println("Purchased Nuts");
                        sum-=2;
                    } else System.out.println("Sorry, not enough money");
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        System.out.println("Purchased Water");
                        sum-=0.7;
                    } else System.out.println("Sorry, not enough money");
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        System.out.println("Purchased Soda");
                        sum-=0.8;
                    } else System.out.println("Sorry, not enough money");
                    break;
                case "Coke":
                    if (sum >= 1) {
                        System.out.println("Purchased Coke");
                        sum-=1;
                    } else System.out.println("Sorry, not enough money");
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        System.out.println("Purchased Crisps");
                        sum-=1.5;
                    } else System.out.println("Sorry, not enough money");
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }


        }
    }
}


