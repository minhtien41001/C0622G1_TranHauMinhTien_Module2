package ss11_stack_queue.bai_tap.exercise3;

import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 5;

        Stack<Integer> binary = new Stack<>();
        int temp = decimal;
        while (temp > 0){
            binary.push(temp % 2);
            temp /= 2;
        }

        System.out.print(decimal + "đổi thành nhị phân: ");
        while (!binary.isEmpty()){
            System.out.println(binary.pop());
        }
    }
}
