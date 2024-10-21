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
public class De2Cau2 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập Bán Kính: ");
        double bankinh = scanner.nextDouble();
        
        double DienTich = 4 * Math.PI * Math.pow(bankinh, 2); 
        double TheTichHinhCau = (4.0 / 3.0) * Math.PI * Math.pow(bankinh, 3); 
        
        System.out.println("Diện Tích:  %.2f\n" +  DienTich);
         System.out.println("Thể tích hình cầu :  %.2f\n" +  TheTichHinhCau);
    }
}
