package algoritmadeneme10;
import java.util.Scanner;
public class Algoritmadeneme10{
    
    
    public static void main (String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz");
        int sayi = scan.nextInt();
        int yuzlerbas,onlarbas,birlerbas;
        yuzlerbas=sayi/100;
        onlarbas=(sayi-(yuzlerbas*100))/10;
        birlerbas=sayi%10;
        
        System.out.println("Yüzler basamağı: "+yuzlerbas);
        System.out.println("Onlar basamağı: "+onlarbas);
        System.out.println("Bir basamağı: "+birlerbas);
        
    }
    
}