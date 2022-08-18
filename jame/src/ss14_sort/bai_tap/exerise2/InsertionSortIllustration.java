package ss14_sort.bai_tap.exerise2;

import java.util.Scanner;

public class InsertionSortIllustration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng đầu vào:");
        int size = Integer.parseInt(scanner.nextLine());

        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " phần tử:");
        for (int i = 0; i < list.length; i++) {
            System.out.print("phần tử thứ " + (i + 1) + " : ");
            list[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Danh sách đầu vào của bạn: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\n Bắt đầu xử lý sắp xếp...");
        insertionSort(list);
        for (int i : list) {
            System.out.print(i + "\t");
        }
    }

    private static void insertionSort(int[] list) {

        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            System.out.println("key = " + key);
            int j = i;
            for (; j > 0; j--) {
                System.out.println("so sánh " + key + " và " + list[j - 1]);
                if (key < list[j - 1]) {
                    list[j] = list[j - 1];
                    System.out.println("dời " + list[j - 1] + " về sau 1  ô");
                } else {
                    break;
                }
            }
            System.out.println("chèn key = " + key + " vào vị trí " + (j)+'\n');
            list[j] = key;

        }
    }
}
