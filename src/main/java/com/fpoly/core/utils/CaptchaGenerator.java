package com.fpoly.core.utils;

import java.util.Random;

public class CaptchaGenerator {
    private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyz123456789";
    private static final int CAPTCHA_LENGTH = 6;

    public static String generateCaptcha() {
        StringBuilder captcha = new StringBuilder(CAPTCHA_LENGTH);
        Random random = new Random();
        for (int i = 0; i < CAPTCHA_LENGTH; i++) {
            int index = random.nextInt(CHAR_LIST.length());
            captcha.append(CHAR_LIST.charAt(index));
        }
        return captcha.toString();
    }

    public static void main(String[] args) {
        System.out.println("Generated CAPTCHA: " + generateCaptcha());
    }
}
