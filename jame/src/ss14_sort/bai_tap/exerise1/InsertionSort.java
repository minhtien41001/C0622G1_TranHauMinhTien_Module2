package ss14_sort.bai_tap.exerise1;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng: ");
        int arrLength = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[arrLength];

        for (int i = 0; i < arrLength ; i++){
            System.out.printf("Nhập phần tử thứ %d của mảng: ",i + 1);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng trước khi sắp xếp: ");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Mảng sau khi sắp xếp là: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; j--){
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }
}
