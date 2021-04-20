package org.iHasherCore;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

public class Core {
    public static void main(String[] args) {
        InputStream file_help = Core.class.getResourceAsStream("resources/help");
        BufferedReader help = new BufferedReader(new InputStreamReader(Objects.requireNonNull(file_help)));
        System.out.println(help);
    }
}
