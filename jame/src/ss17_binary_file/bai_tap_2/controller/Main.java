package ss17_binary_file.bai_tap_2.controller;

import ss17_binary_file.bai_tap_2.exception.FileExistsException;
import ss17_binary_file.bai_tap_2.model.CopyFileBinary;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File sourceFile = new File("jame/src/ss17_binary_file/bai_tap_2/data/sourcefile.csv");
            File destFile = new File("jame/src/ss17_binary_file/bai_tap_2/data/targetfil.csv");
            if (destFile.exists()) {
                throw new FileExistsException("File đã tồn tại!");
            }
            CopyFileBinary.copyFileBinary(sourceFile, destFile);
            System.out.println("Copy thành công!");

        } catch (IOException | FileExistsException e) {
            System.out.println(e.getMessage());
        }

    }
}
