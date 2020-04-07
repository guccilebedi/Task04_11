package com.company;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<FileName> list = new ArrayList<>();
        FileUtils.fill(list, "test.txt");
        Comparator<FileName> nameUp = new FileNameComparatorUp();
        Comparator<FileName> nameDown = new FileNameComparatorDown();
        Comparator<FileName> extensionNameUp = new FileExtensionComparatorUp().thenComparing(new FileNameComparatorUp());
        Comparator<FileName> extensionNameDown = new FileExtensionComparatorDown().thenComparing(new FileNameComparatorDown());
        list.sort(nameUp);
        FileUtils.print(list);
        list.sort(nameDown);
        FileUtils.print(list);
        list.sort(extensionNameUp);
        FileUtils.print(list);
        list.sort(extensionNameDown);
        FileUtils.print(list);
    }
}
