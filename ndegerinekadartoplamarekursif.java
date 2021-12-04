
package ntopfonk;

import java.util.Scanner;
public class Ntopfonk {

    public static int Fonksiyon(int n){
        if(n==1) return 1;
        return n+Fonksiyon(n-1);
        
    }
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in); System.out.println("Lütfen n değerini giriniz.");
       int n= scan.nextInt(); 
       System.out.println(Fonksiyon(n));
    }
    
}
