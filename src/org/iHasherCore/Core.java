package org.iHasherCore;

import org.iHasherCore.hash.MD5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;


public class Core {
    public static void main(String[] args) {
        if(args.length == 0 || args.length > 3) {
            try {
                InputStream file_help = Core.class.getResourceAsStream("/resources/help");
                assert file_help != null;
                BufferedReader help = new BufferedReader(new InputStreamReader(file_help));
                for(int i = 0; i < help.read(); i++) {
                    System.out.println(help.readLine());
                }
            }
            catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        try {
            MD5.generateHash(args[0], args[1]);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}