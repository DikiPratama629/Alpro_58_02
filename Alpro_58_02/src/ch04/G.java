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
public class G
{
     public static void main(String[] args) {
        int[] intArray = new int[] {82,12,41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int[] kelipatan5 = new int[12];
        int index = 0;
        int nomor =1;
        
        for(int i=1; i<=82; i++){
            if(i%5==0){
            kelipatan5[index]=i;
                System.out.println(kelipatan5[index]+" ");
                nomor++;
                
            }
        }
    }
}
