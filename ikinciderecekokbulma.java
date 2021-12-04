package algoritmadeneme2;

import java.util.Scanner;


public class Algoritmadeneme2{
    
    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("2. Dereceden Denkleminizin Köklerini Bulan Programa Hoşgeldiniz!!");
        System.out.println("Lütfen Denkleminizin Değerlerini ax²+bx+c Denklemi Üzerindeki a,b,c'ye Karşılık Gelecek Şekilde Yazınız.");
        System.out.println("Sırası İle a,b ve c Değerlerini Giriniz.");
        double a=scan.nextInt();
        double b=scan.nextInt();
        double c=scan.nextInt();
        double delta=(b*b)-4*a*c;
        double kok=Math.sqrt(delta);
        
         
        if(delta>0){
            double x1= ((-b)+kok)/(2*a);
            double x2= ((-b)-kok)/(2*a);
            System.out.println("x1: "+x1);
            System.out.println("x2: "+x2);
        }
        else if(delta==0){
            double x1= -b/(2*a);
            System.out.println("Delta 0'dır. x1=x2'dir ve x1: "+x1);
            
        }
        else if(delta<0){
            System.out.println(" Delta sıfırdan küçüktür ve gerçek kök yoktur.");
            
        }
        
        
        
    }
    
    
    
    
    
}