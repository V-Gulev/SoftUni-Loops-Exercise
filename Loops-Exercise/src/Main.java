import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lostGames = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());
        double headsets = 0;
        double mouses = 0;
        double keyboards = 0;
        double display = 0;
        for (int i = 2; i <= lostGames; i += 2) {
            headsets++;
        }
        for (int i = 3; i <= lostGames; i += 3) {
            mouses++;
        }
        for (int i = 6; i <=lostGames ; i+=6) {
            keyboards++;
        }
        for (int i = 12; i <=lostGames ; i+=12) {
            display++;
        }
        double totalCost=display*displayPrice+headsetPrice*headsets+keyboardPrice*keyboards+mousePrice*mouses;
        System.out.printf("Rage expenses: %.2f lv.",totalCost);

    }
}


