package yildizileucgen;
import java.util.Scanner;
public class Yildizileucgen{
    
    public static void main(String[] args){
        /*  
            *
           ***
          *****
         *******
        ********* 
        
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Piramitin Satır Sayısını Giriniz");
        int satirSayisi=scan.nextInt();
        
        for (int satir = 0; satir < satirSayisi; satir++) {
            
            for (int bosluk = 0; bosluk < (satirSayisi-(satir+1)); bosluk++) {
                System.out.print(" ");
            }
            
            
            for (int yildiz = 0; yildiz < (satir*2)+1; yildiz++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
        
        
        
        
        
        }
    }
