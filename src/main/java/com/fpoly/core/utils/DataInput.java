/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.core.utils;

/**
 *
 * @author acer
 */
public class DataInput {
    public static boolean checkForm(Object... object){
        for (Object ob : object) {
            if (ob == "") {
                MsgBox.alert(null, "Không được để trống dữ liệu");
                return false; 
            }
        }
        return true;
    }

}
