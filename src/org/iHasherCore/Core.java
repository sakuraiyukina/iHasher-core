package org.iHasherCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Core {
    public static void main(String[] args) {
        if(args.length == 0) {
            try {
                InputStream file_help = Core.class.getResourceAsStream("/resources/help");
                assert file_help != null;
                BufferedReader help = new BufferedReader(new InputStreamReader(file_help));
                for(int i = 0; i < help.read(); i++) {
                    System.out.println(help.readLine());
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        //code

    }
}