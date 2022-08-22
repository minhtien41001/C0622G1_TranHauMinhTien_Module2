package ss16_io_textFile.bai_tap.copyFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        File file = new File (path);
        String line;
        int sum = 0;

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                sum += line.length();
                list.add(line);
            }

            bufferedReader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Số ký tự có trong file là: " + sum);
        return list;
    }

    public static void writeFile(String path, List<String> list) {
        File file = new File(path);

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String str : list) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String source = "jame/src/ss16_io_textFile/bai_tap/copyFile/source.txt";
        String target = "jame/src/ss16_io_textFile/bai_tap/copyFile/target.txt";
        CopyFile.writeFile(target,CopyFile.readFile(source));
    }
}
