/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SPC
 */
public class De2Cau1 {
    public static void main(String[] args) {
        System.out.println("Câu 1");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số N (số lượng số Fibonacci muốn hiển thị): ");
        int n = scanner.nextInt();
        
          ArrayList<Integer> fibonacciList = new ArrayList<>();
          
          for(int i = 0; i <= n; i++){
              if(i == 0){
                  fibonacciList.add(0);
              }else if(i == 1){
                  fibonacciList.add(1);
              }else{
                  int nextFibo = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
                fibonacciList.add(nextFibo);
              }
          }
          int sum = 0;
          for (int num : fibonacciList) {
            sum += num;
        }
           System.out.println("Dãy số Fibonacci: " + fibonacciList);
        System.out.println("Tổng của dãy số: " + sum);
        
        scanner.close();

    }
}
