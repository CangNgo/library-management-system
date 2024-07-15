package com.fpoly.core.utils;

import javax.swing.*;
import java.awt.*;

public class MsgBox {
    public static void alert(Component parent, String message) {
        JOptionPane.showMessageDialog(parent, message,
                "Hệ thống quản lý đào tọa", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean conform(Component parent, String message) {
        int result = JOptionPane.showConfirmDialog(parent, message,
                "Hệ thống quản lý đào tạo",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }

    public static String prompt(Component parent, String message) {
        return JOptionPane.showInputDialog(parent, message,
                "Hệ thống quản lý đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
}
