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
public class TinhChuVi_DT {
    public static void main(String[] args) {
        System.out.println("Chương Trình Tính Chu Vi");
        Scanner sc = new Scanner(System.in);
        double dai , rong, Dientich, Chuvi;
        System.out.print("Nhập Chiều Dài : " );
        dai = sc.nextDouble();
        System.out.print("Nhập Chiều Rộng: ");
        rong = sc.nextDouble();
        
        Dientich = dai * rong;
        Chuvi = dai + rong * 2;
        
        System.out.print("Diện Tích : " + Dientich);
        System.out.print("Chu Vi + " + Chuvi);
        
    }
   
}
