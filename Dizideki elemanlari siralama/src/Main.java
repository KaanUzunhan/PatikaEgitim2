import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dizi boyutunu kullanıcıdan al
        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();

        // Diziyi oluştur
        int[] dizi = new int[boyut];

        // Elemanları kullanıcıdan al
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            dizi[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(dizi);

        // Sıralanmış diziyi yazdır
        System.out.print("Sıralama: ");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
    }
}