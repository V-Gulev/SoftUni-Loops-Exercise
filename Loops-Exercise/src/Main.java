import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        double grade = Double.parseDouble(scannerInput.nextLine());
        if (grade>=3.00){
            System.out.println("Passed!");
        }
    }
}