package enboykare;
import java.util.Scanner;


public class Enboykare {

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Oluşturacağınız Dörtgenin En Uzunluğunu Giriniz.");
        int en=scan.nextInt();
        System.out.println("Lütfen Dörtgenin Boy Uzunluğunu Giriniz.");
        int boy=scan.nextInt();
        for (int i = 0; i < boy; i++) {
            for (int j = 0; j < en; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
            
        }
        
        
        
    }
    
}
