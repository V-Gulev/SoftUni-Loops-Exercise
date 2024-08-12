import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String country= sc.nextLine();
        switch (country) {
            case "England","USA":
                System.out.println("English");
                break;
            case "Spain","Argentina","Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
