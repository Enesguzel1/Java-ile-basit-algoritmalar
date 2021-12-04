
package javaapplication21;

import java.util.Random;
import java.util.Scanner;


public class JavaApplication21 {
    
   
    
    
    public static void main(String[] args) {
        Random rnd=new Random();
        int sayi=rnd.nextInt(101);
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bir Tahminde Bulunun.");
        int tahmin=101;
        while (tahmin!=sayi) {
            
        
        
         tahmin=scan.nextInt();
            if (tahmin>sayi) {
                System.out.println("Lütfen Daha Küçük Bir Değer Giriniz.");
                
            }
            else if(tahmin<sayi){
                System.out.println("Lütfen Daha Büyük Bir Değer Giriniz.");
            }      
        
        
        
        }
        System.out.println("Kazandınız");
    }
    
}











