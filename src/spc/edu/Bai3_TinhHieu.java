/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author SPC
 */
public class Bai3_TinhHieu {
    public static void main(String[] args) {
        System.out.println("Chương Trình Tính Hiệu Số");
        double a, b, hieu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Số a : ");
        a = sc.nextDouble();
        
        System.out.print("Nhập Số b : ");
        b = sc.nextDouble();
        
        hieu = a - b;
        
        System.out.println("a - b = " + hieu);
    }
}
