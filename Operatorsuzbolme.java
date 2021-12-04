package operatorsuzbolme;
import java.util.Scanner;
public class Operatorsuzbolme{
    
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Bölüneni Giriniz.");
        int bolunen=scan.nextInt();
        System.out.println("Lütfen Böleni Giriniz.");
        int bolen=scan.nextInt();
        int bolum=0;
        if(bolunen==bolen){
            bolum=1;
            bolunen=bolunen-bolen;
        }
        for (int i = 0; bolen<=bolunen; i++) {
            
        
        if(bolunen>bolen){
            bolunen=bolunen-bolen;
            bolum+=1;
            
        }
          
        }
         
        System.out.println("Kalan: "+bolunen);
        System.out.println("Bölüm: "+bolum);
        
        
        
        
        
        
        
        
        
        
    }
}