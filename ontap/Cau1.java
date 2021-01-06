package ontap;

import java.util.Scanner;
public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập N: ");
        int n =sc.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + " Là số chẵn");
            } else {
                System.out.println(n + " Là số lẻ");
        }
    }
}
