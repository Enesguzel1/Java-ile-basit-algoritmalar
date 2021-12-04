
package algoritmadeneme1;
import java.util.Scanner;



public class Algoritmadeneme1 {
    
    

    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Celsius'u Çevirmek İstediğiniz Sıcaklık Birimini Yazınız.(fahrenheit/kelvin)");
        String SicaklikBirimi=scan.nextLine();
        System.out.println("Lütfen Dereceyi Giriniz.");
        int derece=scan.nextInt();
        switch (SicaklikBirimi) {
            case "kelvin":
                int kelvin=derece+273;
                System.out.println("Derecenin Kelvin Karşılığı: "+kelvin);
                break;
            case "fahrenheit":
                double fahrenheit= (double)derece*(9/5)+32;
                System.out.println("Derecenin Fahrenheit Karşılığı: "+ fahrenheit);
                break;
            default:
                System.out.println("Yanlış veri girişi yaptınız");
                break;
        }
        
        
        
    }
    
}
