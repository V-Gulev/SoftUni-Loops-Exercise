import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String reversed = "";
        int tries = 0;
        for (int i = username.length() - 1; i >= 0; i--) {
            reversed += username.charAt(i);
        }
        while (true) {
            String password = sc.nextLine();
            if (tries==3){
                System.out.printf("User %s blocked!",username);
                break;
            }
            if (password.equals(reversed)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
                tries++;
            }
        }
    }
}


