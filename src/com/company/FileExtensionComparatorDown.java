package com.company;

import java.util.Comparator;

public class FileExtensionComparatorDown implements Comparator<FileName> {

    @Override
    public int compare(FileName o1, FileName o2) {
        return o2.getExtension().compareTo(o1.getExtension());
    }
}
