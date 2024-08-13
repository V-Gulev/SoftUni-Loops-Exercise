import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String answer = "";
        int digit = 0;
        for (int i = 0; i < a; i++) {


            int n = Integer.parseInt(sc.nextLine());
            if (n > 100 && n < 1000) {
                digit = n % 10;
                if (digit == 2) {
                    answer += "c";
                } else if (digit == 3) {
                    answer += "f";
                } else if (digit == 4) {
                    answer += "i";
                } else if (digit == 5) {
                    answer += "l";
                } else if (digit == 6) {
                    answer += "o";
                } else if (digit == 7) {
                    answer += "r";
                } else if (digit == 8) {
                    answer += "v";
                } else if (digit == 9) {
                    answer += "y";
                }
            } else if (n > 1000) {
                digit = n % 10;
                if (digit == 9) {
                    answer += "z";
                } else if (digit == 7) {
                    answer += "s";
                }

            } else if (n > 10) {
                digit = n % 10;
                if (digit == 2) {
                    answer += "b";
                } else if (digit == 3) {
                    answer += "e";
                } else if (digit == 4) {
                    answer += "h";
                } else if (digit == 5) {
                    answer += "k";
                } else if (digit == 6) {
                    answer += "n";
                } else if (digit == 7) {
                    answer += "q";
                } else if (digit == 8) {
                    answer += "u";
                } else if (digit == 9) {
                    answer += "x";
                }
            } else {
                if (n == 2) {
                    answer += "a";
                } else if (n == 3) {
                    answer += "d";
                } else if (n == 4) {
                    answer += "g";
                } else if (n == 5) {
                    answer += "j";
                } else if (n == 6) {
                    answer += "m";
                } else if (n == 7) {
                    answer += "p";
                } else if (n == 8) {
                    answer += "t";
                } else if (n == 9) {
                    answer += "w";
                } else if (n == 0) {
                    answer += " ";
                }
            }
            System.out.print(answer);
            answer = "";
        }


    }
}
