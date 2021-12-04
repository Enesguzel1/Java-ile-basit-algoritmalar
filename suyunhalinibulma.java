package algoritmadeneme5;
import java.util.Scanner;
public class Algoritmadeneme5{
    
    
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen suyunuzun sıcaklığını giriniz.");
        double sicaklik=scan.nextDouble();
        if(sicaklik<0){
            System.out.println("Suyunuz Katı Haldedir.");
            
        }
        else if(sicaklik>0 && sicaklik<100){
            System.out.println("Suyunuz Sıvı Haldedir.");
            
        }
        else{
            System.out.println("Suyunuz Gaz Halindedir.");
        }
    }
    
    
}