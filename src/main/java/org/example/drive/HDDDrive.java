package org.example.drive;

import org.example.File;

import java.util.ArrayList;
import java.util.List;

public class HDDDrive implements Drive {
    List<File> files = new ArrayList<>();

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFiles() {
        files.forEach(System.out::println);

//        for(File file: files) {
//            System.out.println(file);
//        }
    }

    @Override
    public File findFile(String name) {
        public File finFile = files.stream();
        files.stream()
                .filter(file -> file.getName().equals(name))
                .findFirst();
        return foundFile.orElseThrow();
    }
}
