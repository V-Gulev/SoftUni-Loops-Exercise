import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int sum = 1;
        int startingNumber=number;
        int totalSum = 0;
        while (number != 0) {
            int digit = number % 10;
            for (int i = 1; i <= digit; i++) {
                sum = sum * i;
            }
            totalSum += sum;
            number /= 10;
            sum=1;
        }
        if (totalSum == startingNumber) {
            System.out.println("yes");
        } else System.out.println("no");
    }
}


