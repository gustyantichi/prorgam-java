/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totalupah;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class totalupah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Jumlah Jam kerja ?");
        int jam  = input.nextInt();
        int total= (jam *  2500);
        System.out.println(jam+"*" +2500+"=" + total);
        
    }
}
