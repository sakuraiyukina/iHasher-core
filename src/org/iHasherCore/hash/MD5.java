package org.iHasherCore.hash;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static void generateHash(String algorithm, String data) throws NoSuchAlgorithmException {
        switch (algorithm) {
            case "-f":
                break;
            case "-s":
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                byte[] metadata = messageDigest.digest(data.getBytes());
                StringBuilder stringBuilder = new StringBuilder(new BigInteger(1, metadata).toString(16));
                while (stringBuilder.length() < 32) {
                    stringBuilder.insert(0, "0");
                }
                System.out.println(stringBuilder);
        }
    }
}