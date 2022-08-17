package ss13_search.bai_tap.exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            System.out.printf("arr[%d] = ", i);
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Nhập số cần tìm trong chuỗi: ");
        int number = scanner.nextInt();

        System.out.println(binarySearch(arr,0,arr.length - 1,number));
    }

    private static int binarySearch(int[] arr,int left,int right,int key){
        if (left > right){
            return -1;
        }

        int mid = (left + right)/2;
        if (arr[mid] == key){
            return mid;
        }

        if (arr[mid] < key){
            return binarySearch(arr, mid + 1, right, key);
        }
        return binarySearch(arr, left, mid - 1, key);
    }

}
