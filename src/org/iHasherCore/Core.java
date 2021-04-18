package org.iHasherCore;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Core {
    public static void main(String[] args) {
        Path file_help = Paths.get("src/resources/help");
        try {
            List<String> help = Files.readAllLines(file_help, StandardCharsets.UTF_8);
            for (String s : help) {
                System.out.println(s);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
