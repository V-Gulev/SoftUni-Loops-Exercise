import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        double age = Double.parseDouble(sc.nextLine());
        switch (day) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    System.out.println("12$");
                } else if (age <= 64 && age>=0) {
                    System.out.println("18$");
                } else if (age <= 122 && age>=0) {
                    System.out.println("12$");
                } else System.out.println("Error!");
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    System.out.println("15$");
                } else if (age <= 64 && age>=0) {
                    System.out.println("20$");
                } else if (age <= 122 && age>=0) {
                    System.out.println("15$");
                } else System.out.println("Error!");
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    System.out.println("5$");
                } else if (age <= 64 && age >= 0) {
                    System.out.println("12$");
                } else if (age <= 122 && age>=0) {
                    System.out.println("10$");
                } else System.out.println("Error!");
                break;
        }


    }
}


