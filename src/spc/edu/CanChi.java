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
public class CanChi {
    public static void main(){
        System.out.println("Tính Căn Chi");
        
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Nhập năm: ");
        year = sc.nextInt();
        
        String can [] = {"canh","tan", "nham","quy", "giap", "at", "binh", "dinh", "mau", "ky"};
        String Chi [] = {"than", "dau", "tuat", "hoi","ty","suu", "dan", "mao", "thin", "ti","ngo","mui"};
        
        String CN = can[year % 10];
        String chi = Chi[year % 12];
        
        System.out.println(" " + CN  + "---"+" " + chi);
        
    }
}
