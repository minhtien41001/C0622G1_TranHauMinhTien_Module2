package ss13_search.bai_tap.exercise1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi của bạn: ");
        String chain = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < chain.length(); i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(chain.charAt(i));

            for (int j = i+1; j < chain.length(); j++){
                if (chain.charAt(j) > list.getLast()){
                    list.add(chain.charAt(j));
                }
            }
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character character : max){
            System.out.println(character);
        }
    }
}
