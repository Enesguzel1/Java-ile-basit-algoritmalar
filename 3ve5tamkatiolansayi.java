package algoritmadeneme4;
import java.util.Scanner;
public class Algoritmadeneme4{
    
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir değer giriniz.");
        int girdi1=scan.nextInt();
        if (girdi1%3==0 && girdi1%5==0) //girilen sayıyının 3'e ve 5'e tam bölünüp bölünmediğini kontrol ediyoruz.
        {
            System.out.println("Girdiğiniz sayı 3'e ve 5'e tam bölünüyor");
            
        }
        else{
            System.out.println("Sayınız 3'e ve 5'e bölünmüyor.");
        }
        
        
        
    }
    
}