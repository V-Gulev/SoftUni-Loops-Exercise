import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double availableMoney = Double.parseDouble(sc.nextLine());
        int studentCount = Integer.parseInt(sc.nextLine());
        double lightsaberPrice = Double.parseDouble(sc.nextLine());
        double robePrice = Double.parseDouble(sc.nextLine());
        double beltPrice = Double.parseDouble(sc.nextLine());
        int freeBelt = studentCount / 6;
        int sabersNeeded = (int) Math.ceil(studentCount * 1.1);
        double cost = sabersNeeded * lightsaberPrice + (studentCount * robePrice) + ((studentCount - freeBelt) * beltPrice);
        double neededMoney = cost - availableMoney;
        if (cost <= availableMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", cost);
        } else System.out.printf("George Lucas will need %.2flv more.", neededMoney);


    }
}


