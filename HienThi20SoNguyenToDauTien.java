package ss2.BaiTap.HienThi20SoNguyenToDauTien;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("nhap so number");
        num = input.nextInt();
        int count = 0;
        int N = 2;
        while (count < num) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(N + " ");
                count++;
            }
            N++;
        }
    }
}