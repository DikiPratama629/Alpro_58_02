/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;
import java.util.Arrays;
/**
 *
 * @author Diki Pratama
 */
public class C
{
    public static void main(String[] args) {
        int[]bil={82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Bilangan Ganjil : ");
        for(int i=0; i<bil.length; i++){
            if(bil[i]%2!=0){
                System.out.println(bil[i]+"");
            }
        }
        System.out.println(" ");
    }
}
