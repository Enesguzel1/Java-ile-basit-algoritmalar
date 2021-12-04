
package algoritmadeneme9;
import java.util.Scanner;
public class Algoritmadeneme9 {
    public static void main(String[] args) {
        // Bu algoritmada girilen sayıya kadar olan tek sayıların toplamını, tek sayıların çarpımını ve çift sayıların karelerinin toplamını buluyoruz.(girilen sayı dahil değil!)
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir değer giriniz.");
        int deger=scan.nextInt();
        int toplam=0,carpim=1,karelertoplam=0;
        
        for (int i = 1; i < deger; i=i+2){
            toplam=toplam+i;
            carpim=carpim*i;
        }
        for (int j = 0; j < deger; j=j+2) {
            int karealma=j*j;
            karelertoplam=karelertoplam+karealma;
            
        }
        
        System.out.println("Girdiğiniz değere kadar olan tek sayıların toplamı= "+toplam);
        System.out.println("Girdiğiniz değere kadar olan tek sayıların çarımıpı= "+carpim);
        System.out.println("Girdiğiniz değere kadar olan çift sayıların karelerinin toplamı= "+karelertoplam);
    }
    
}
