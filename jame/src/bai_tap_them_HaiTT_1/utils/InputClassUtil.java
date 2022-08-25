package bai_tap_them_HaiTT_1.utils;

import bai_tap_them_HaiTT_1.exception.InputClassException;
import bai_tap_them_HaiTT_1.exception.InputNameException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputClassUtil {
    private static final String CLASS_REGEX = "[CA][0-9]{4}[GI]1";
    public static String getClassRegex(String str) throws InputClassException {
        StringBuilder string = new StringBuilder();
        if (str.matches(CLASS_REGEX)) {
            str = str.toLowerCase().trim();
            str = str.replaceAll("[ ]+", " ");
            String[] arrName = str.split(" ");

            for (String s : arrName) {
                string.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
            }
        } else {
            throw new InputClassException("LỖI: Bạn phải nhập tên lớp theo định dạng (A|C)XXXX(G|I)1, mời nhập lại!!!");
        }
        return string.toString().trim();
    }
}
