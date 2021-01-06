package ontap;

import java.util.Scanner;

/**
 * Chương trình tìm ước số chung lớn nhất (USCLN)
 * và bội số cung nhỏ nhất (BSCNN) của 2 số a và b
 *
 * @author viettuts.vn
 */
public class vd2 {
    private static Scanner scanner = new Scanner(System.in);
    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        // tính USCLN của a và b
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
        // tính BSCNN của a và b
        System.out.println("BSCNN của " + a + " và " + b
              + " là: " + BSCNN(a, b));
    }
    public static int USCLN(int a, int b ){
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    public static int BSCNN(int a, int b){
        return (a*b / USCLN(a, b));
    }
}