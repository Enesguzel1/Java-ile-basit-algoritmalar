package algoritmadeneme6;
import java.util.Scanner;
public class Algoritmadeneme6{
    public static void main(String[] args){
        // Bir şirkette çalışanlar her ay sahip oldukları çocuk sayısına göre maaşlarına ek aile yardımı almaktadır. Çalışanın çocuk sayısı 1 ise maaşının %5'i kadar, 
        // 2 ise %10'u, 3 ve daha fazla çocuğu varsa maaşının %15'i kadar ek aile yardımı almaktadır. 
        

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Aldığınız Sabit Maaşı Giriniz");
        double maas=scan.nextDouble();
        System.out.println("Yeni Maaşınızı Hesaplamamız İçin Çocuk Sayısını Girmelisiniz!");
        int cocuk=scan.nextInt();
        if (cocuk==1) {
            maas=maas+(maas*1/20);
            System.out.println("Maaşınız: "+maas);
            
        }
        else if(cocuk==2){
            maas=maas+(maas*1/10);
            System.out.println("Maaşınız: "+maas);
        }
        else if(cocuk>2 ){
            maas=maas+(maas*3/20);
            System.out.println("Maaşınız: "+maas);
            
        }
    }
    
}