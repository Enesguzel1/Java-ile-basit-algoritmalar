package algoritmadeneme8;
import java.util.Scanner;
public class Algoritmadeneme8{
    
    public static void main (String[] args){
        // Bir şirkette çalışanların maaşları hesaplanırken uyulan kriterler şunlardır; işçi 40 ve 40 saatten fazla çalışmışsa çalışma saatinin iki katı ile saatlik ücreti çarpılır. 
        // eğer işçi 40 saatten az çalışmış ise sadece çalışma saati ve saatlik ücreti çarpılır.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Çalışma Saatinizi Giriniz.");
        int calismasaati = scan.nextInt();
        System.out.println("Saatlik Ücretinizi Giriniz.");
        int saatlikücret=scan.nextInt();
        
        if (calismasaati>=40) {
            int maas=calismasaati*2*saatlikücret;
            System.out.println("Maaşınız: "+maas);
        }
        else if(calismasaati<40){
            int maas=calismasaati*saatlikücret;
            System.out.println("Maaşınız: "+maas);
        }
        else{
            System.out.println("Hatalı Giriş Yaptınız.");
        }
                
            
        
        
    }
    
}