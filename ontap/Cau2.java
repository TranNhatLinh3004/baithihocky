package ontap;

import java.util.Scanner;
public class Cau2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();
        System.out.print("Nhập số c: ");
        int c = sc.nextInt();
        if(a >= 0 && a >= b ){
            System.out.println("Số lớn nhất là " + a);
            } else if (b >= c ) {
            System.out.println("Số lớn nhất là " + b);
        } else {
            System.out.println("Số lớn nhất là " + c);
        }
    }
}
