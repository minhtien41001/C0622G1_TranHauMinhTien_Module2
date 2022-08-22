package ss16_io_textFile.bai_tap.readFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCSVRead {
    public static void main(String[] args)  throws IOException {
        File file = new File("jame/src/ss16_io_textFile/bai_tap/readFile/CSV.txt");

        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String [] list;

        List<Country> countries = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null){
            list = line.split(",");
            countries.add(new Country(Integer.parseInt(list[0]), list[1], list[2]));
        }
        bufferedReader.close();

        System.out.print("Danh sách các quốc gia: \n ");
        System.out.print(countries);

    }
}
