import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        int n1 = Integer.parseInt(scannerInput.nextLine());
        int n2 = Integer.parseInt(scannerInput.nextLine());
        int n3 = Integer.parseInt(scannerInput.nextLine());
        int[] a = {n1, n2, n3};
        int[] sortedArray = Arrays.stream(a).sorted().toArray();

        for (int i = a.length - 1; i >= 0 ; i--) {
            System.out.println(sortedArray[i]);
        }
    }
}