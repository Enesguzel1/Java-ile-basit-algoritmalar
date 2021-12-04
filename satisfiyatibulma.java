package algoritmadeneme3;
import java.util.Scanner;
public class Algoritmadeneme3{
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Ürünü Alış Fiyatını Giriniz.");
        double urunfiyati=scan.nextDouble();
        System.out.println("Bu Ürüne Eklenen Verginin Oranını Giriniz.(Yüzde kısmını!)");
        double vergiorani=scan.nextDouble();
        System.out.println("Ürüne Ekleyeceğiniz Kâr Oranını Giriniz.");
        double karorani=scan.nextDouble();
        
        double satisfiyat=urunfiyati+((urunfiyati*vergiorani/100)+(urunfiyati*karorani/100));
        System.out.println("Ürünün Satış Fiyatı: "+satisfiyat);
        
    }
    
}