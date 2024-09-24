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
public class LuyThua {
    public static void main(String[] args) {
        System.out.println("Tính Lũy Thừa");
        Scanner sn = new Scanner(System.in);
        int so,mu, luythua = 1;
        
        System.out.print("Nhập số : ");
        so = sn.nextInt();
        System.out.print("Nhập lũy thừa : ");
        mu = sn.nextInt();
        
        for(int i = 0; i < mu; i++){
            luythua *= so;
        }
        System.out.print("Lũy thừa : " + luythua);
    }
}
