package session4.btvn;
import java.util.Scanner;

public class SapXepGiamDanTimKiemSo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int elementNumber = Integer.parseInt(input.nextLine());
        int[] numbers = new int[elementNumber];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 1; i <= elementNumber; i++ ) {
            System.out.print("Phần tử thứ " + i + ": ");
            numbers[i-1] = Integer.parseInt(input.nextLine());
        }
        SelectionSort(numbers);
        System.out.println("Mảng sau khi đã sắp xếp giảm dần:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.print("Nhập số cần tìm: ");
        int find = Integer.parseInt(input.nextLine());
        int mid = binarySearch(numbers, find);
        for (int i = 0; i < numbers.length; i++ ) {
            if (numbers[i] == find){
                System.out.println("Tìm kiếm tuyến tính: Số " + find + " có tại vị trí " + i);
            }
        }
        System.out.print("Tìm kiếm nhị phân: Số " + find + " có tại vị trí " + mid );
    }


    public static void SelectionSort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (numbers[j] > numbers[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
    }


    public static int binarySearch(int[] numbers, int key) {
        int left = 0, right = numbers.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
