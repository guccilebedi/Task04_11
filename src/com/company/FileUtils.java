package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

    public static void fill(List<FileName> list, String fileName) throws FileNotFoundException {
        Scanner scn = new Scanner(new File(fileName));
        String txt = new String();
        while (scn.hasNext()) {
            if (txt.isEmpty()) {
                txt = scn.nextLine();
            } else {
                txt = txt + "." + scn.nextLine();
            }
        }
        String[] txtArr = txt.split("\\.");
        for (int i = 0; i < txtArr.length - 1; i++) {
            FileName file = new FileName(txtArr[i], txtArr[i + 1]);
            list.add(file);
            i++;
        }
    }

    public static void print(List<FileName> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "." + list.get(i).getExtension());
        }
        System.out.println("\n");
    }
}
