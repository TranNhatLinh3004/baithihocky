package ontap;

import java.util.Scanner;
public class Cau6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
int n = sc.nextInt();
float kq =(float) Math.sqrt(n);
if (kq == (int)kq){
    System.out.println("là số chính phương");
} else {
    System.out.println("khong phai so chính phương8");
}
    }
    }

