package ss17_binary_file.bai_tap.utils;

import java.util.Scanner;

public class InputFileUtils {
    public static String getString(String target) {
        Scanner sc = new Scanner(System.in);
        System.out.print(target);
        return sc.nextLine();
    }

    public static boolean getBoolean(String target) {
        Scanner sc = new Scanner(System.in);
        System.out.print(target);
        return Boolean.parseBoolean(sc.nextLine());
    }

    public static double getDouble(String target) {
        Scanner sc = new Scanner(System.in);
        System.out.print(target);
        double d;
        while (true) {
            try {
                d = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return d;

    }

    public static int getInt(String target) {
        Scanner sc = new Scanner(System.in);
        System.out.print(target);
        int n;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return n;
    }
}
