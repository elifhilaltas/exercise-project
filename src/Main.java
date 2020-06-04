
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Hareketi kaç defa yapacaksınız?");
        System.out.print("Burpee Sayısı ? ");
        int burpee =scanner.nextInt();
        System.out.print("situp Sayısı ? ");
        int situp =scanner.nextInt();
        System.out.print("pushup Sayısı ? ");
        int pushup =scanner.nextInt();
        System.out.print("squat Sayısı ? ");
        int squat =scanner.nextInt();
        scanner.nextLine();
        
       // hareketYap(hareketTuru,sayi);
       Idman idman1 = new Idman(burpee, pushup, situp, squat);
        System.out.println("İdman başlıyor....   ");
        
        while (idman1.idmanBittiMi()== false) {            
            
            
             System.out.print("Geçerli Hareketlerden Birini Seçiniz : \n "
                + "* Burpee \n "
                + "*Pushup \n "
                + "*Situp \n "
                + "*Squat \n Hareket : ");

        String turu =scanner.nextLine(); 
        System.out.print("Kaç defa ? :");
        int sayi = scanner.nextInt(); 
        scanner.nextLine();
        idman1.hareketYap(turu, sayi);
        
        }
        
        System.out.println("İdman Bitti !!!  Tebrikler..");
    }
}
