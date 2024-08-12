import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2= Integer.parseInt(sc.nextLine());
        int n3=n2+30;
        if (n3>=60){
            n1= n1+1;
            n3=n3-60;
        }
        if (n1 == 24) {
            n1=0;
        }
        if (n3<10){
            System.out.printf("%d:0%d",n1,n3);
        }else System.out.printf("%d:%d",n1,n3);

    }
}
