import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        String name = scannerInput.nextLine();
        int age = Integer.parseInt(scannerInput.nextLine());
        double grade = Double.parseDouble(scannerInput.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,grade);
    }
}