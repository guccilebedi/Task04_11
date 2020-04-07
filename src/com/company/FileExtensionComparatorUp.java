package com.company;

import java.util.Comparator;

public class FileExtensionComparatorUp implements Comparator<FileName> {

    @Override
    public int compare(FileName o1, FileName o2) {
        return o1.getExtension().compareTo(o2.getExtension());
    }
}
