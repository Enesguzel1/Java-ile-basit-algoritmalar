package algoritmadeneme11;
import java.util.Scanner;
public class Algoritmadeneme11{
    
    public static void main(String[] args) {
        //Arka arkaya girilen rastgele 10 tamsayının ortalaması ile bu sayılardan en büyük ve en küçük olanının ortalamasını bularak elde edilen bu iki ortalamanın farkını alan algoritma örneği.
        Scanner scan=new Scanner(System.in);
        int[] dizi=new int[10];
        System.out.println("Lütfen 10 Adet Sayı Giriniz!");
        int toplam=0,toport=0;
        for (int i = 0; i < 10; i++) {
            dizi[i]=scan.nextInt();
            toplam=toplam+dizi[i];
            
            
           }
        int a=0;
        for (int j = 0; j < 10; j++) {
            if (dizi[j]>a) {
                a=dizi[j];
                
            }
            
        }
        int b = 0;
        for (int i = 0; i < 10; i++) {
            if (dizi[i]<b) {
                b=dizi[i];
            }
            
        }
        // 89-3-51
        // a girilen sayıların en büyüğü
        
        
        
        System.out.println((double)(toplam/10)-(a+b)/2);
        System.out.println((double)toplam/10);
        
        
        
    }
    
    
    
}