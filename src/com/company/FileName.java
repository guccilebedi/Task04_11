package com.company;

public class FileName {
    private String name;     // имя файла
    private String extension;     // расширение файла

    public FileName(String name, String extension) {     // конструктор имени файла
        this.name = name;
        this.extension = extension;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }
}
