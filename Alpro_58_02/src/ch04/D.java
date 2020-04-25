/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;

/**
 *
 * @author Diki Pratama
 */
public class D
{
    public static void main(String[] args) {
        int[] kelipatan3 = new int[12];
        int index = 0;
        int nomor =1;
        
        for(int i=1; i<=82; i++){
            if(i%3==0){
            kelipatan3[index]=i;
                System.out.println(" "+kelipatan3[index]);
                nomor++;
                
            }
        }
    }
}

