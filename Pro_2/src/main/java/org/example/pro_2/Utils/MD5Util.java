package org.example.pro_2.Utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
    public static byte[] md5(String txt) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            return digest.digest(txt.getBytes());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String encryptPassword(String password) {
        if (password == null || password.isEmpty()) {
            return null; // 或者抛出异常，视情况而定
        }

        byte[] hash = md5(password);
        if (hash == null) {
            return null; // 或者抛出异常，视情况而定
        }

        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        return hexString.toString();
    }


}
