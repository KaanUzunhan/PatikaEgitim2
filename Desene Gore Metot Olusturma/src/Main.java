import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı al
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        // Recursive işlemi başlat
        recursiveIslem(sayi);

    }

    // Recursive işlem metodu
    public static void recursiveIslem(int n) {
        if (n <= 0) {
            // Sayı 0'a ulaştığında veya negatif olduğunda, sayıyı yazdır ve işlemi sonlandır
            System.out.print(n + " ");
            return;
        } else {
            // Sayı 0'dan büyük olduğunda, sayıyı yazdır ve 5 azaltarak tekrar recursiveIslem metodunu çağır
            System.out.print(n + " ");
            recursiveIslem(n - 5);
            // Eğer sayı 10 değilse, tekrar sayıyı yazdır
            if (n != 10) {
                System.out.print(n + " ");
            }
        }
    }
}