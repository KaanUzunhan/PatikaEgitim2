import java.util.Scanner;

public class Main {
    //metot oluşturuyoruz
    public static int exponential(int number, int exponent) {
    //koşul oluşturuyoruz
        if (exponent == 0)
            return 1;
        else {
            int result = number * exponential(number, exponent - 1);
            return result;
        }
    }
     // kullanıcıdan veri alıp çıktıyı ekrana yazdırıyoruz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz: ");
        int number = scan.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        int exponent = scan.nextInt();

        System.out.println("Sonuç: " + exponential(number, exponent));

    }
}
