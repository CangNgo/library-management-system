package com.fpoly.core.utils;

import com.fpoly.core.models.User;

public class Auth {

    public static User user = null;

    public static void clear() {
        Auth.user = null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isManager() {
        return Auth.isLogin() && user.getManager();
    }

    public static String getManv() {
        return user.getUsername();
    }
}
