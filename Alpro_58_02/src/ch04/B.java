/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menampilkansemuabilanganarray;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Diki Pratama
 */
public class B{
   public static void main(String[]args){
       int[] number = {82,12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
       if(contains(number, 41)){
           System.out.println("Hai Array");
       }
   }

    private static boolean contains(final int[] Array, final int v) {
        boolean result = false;
        for(int i : Array){
            if(i == v){
                result = true;
                break;
            }
    }
        return result;
    }
}
    

