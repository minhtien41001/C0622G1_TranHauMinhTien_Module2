package ss13_search.bai_tap.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi của bạn : ");
        String string = scanner.nextLine();

        List<Character> maxString = new ArrayList<>();
        List<Character> tempString = new ArrayList<>();

        tempString.add(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) <= string.charAt(i - 1)) {
                tempString.clear();
            }

            tempString.add(string.charAt(i));

            if (tempString.size() > maxString.size()) {
                maxString.clear();
                maxString.addAll(tempString);
            }
        }

        System.out.println("Chuỗi được sắp xếp theo thứ tự có độ dài lớn nhất: ");
        for (Character character : maxString) {
            System.out.print(character);
        }
    }
}
