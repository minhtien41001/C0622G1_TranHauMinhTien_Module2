package test;

import java.util.LinkedList;
import java.util.List;

public class AbcD {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Tien");
        linkedList.add("Bao");
        linkedList.add("Tan");
        linkedList.add("Kien");

        System.out.println(linkedList);

        linkedList.remove("Bao");
        System.out.println(linkedList);

        linkedList.set(2,"Hoang");
        System.out.println(linkedList);

        System.out.println(linkedList.size());


    }




}
