package com.company;

import java.util.Comparator;

public class FileNameComparatorDown implements Comparator<FileName> {

    @Override
    public int compare(FileName o1, FileName o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
