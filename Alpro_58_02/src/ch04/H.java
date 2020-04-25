/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;
import java.util.Scanner;
import java.util.ArrayDeque;

/**
 *
 * @author Diki Pratama
 */
public class H {
    public static void main(String[] args) {
        int[] intArray = new int[] {82,12,41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        Scanner justin = new Scanner(System.in);
        int angka, count=5;
        System.out.println("Masukkan angka :");
        angka = justin.nextInt();
        while(angka >0){
            System.out.println("Jumlah " + angka);
            
            angka=angka/10;
            count++;
        }
    }
}
