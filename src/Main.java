import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde örn:1,85 ) giriniz : ");

        double height = scanner.nextDouble();


        // Boyu metre cinsinden değilse, cm olarak girildiyse dönüştür

       if (height>=100 && height<=300){
           height=height/100;
       }

        System.out.println("Lütfen kilonuzu giriniz : ");

        int weight = scanner.nextInt();


        // Eğer girilen boy veya kilo 0 veya negatifse, hatalı giriş mesajı veriyoruz

        if (height<=0 || weight<=0){
            System.out.println("Hatalı giriş! Boy ve kilo pozitif olmalıdır.");

        }else {

            // Boy ve kilo geçerli ise, vücut kitle indeksini hesaplıyoruz

            double bodyMassIndex =weight/(height*height);

            System.out.println("Vücut Kitle İndeksiniz : " + bodyMassIndex);

        }
    }
}
