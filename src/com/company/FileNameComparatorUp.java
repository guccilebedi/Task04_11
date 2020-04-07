package com.company;

import java.util.Comparator;

public class FileNameComparatorUp implements Comparator<FileName> {

    @Override
    public int compare(FileName o1, FileName o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
