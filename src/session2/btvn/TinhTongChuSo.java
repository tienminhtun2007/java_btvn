package session2.btvn;
import java.util.Scanner;
public class TinhTongChuSo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int number = Integer.parseInt(input.nextLine());
        if (number < 0) {
            number = Math.abs(number);
        }
        int sum = 0;
        while (number > 0) {
            int num = number % 10;
            sum += num;
            number = number / 10;
        }
        System.out.print("Tổng các chữ số là: " + sum);
    }
}
