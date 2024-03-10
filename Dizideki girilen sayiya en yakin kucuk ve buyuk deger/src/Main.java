import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {15,12,788,1,-1,-778,2,0}; // Örnek bir dizi
        int hedef = 5; // Girilen sayı
        System.out.println("Girilen sayı: " + hedef);

        Arrays.sort(dizi); // Diziyi küçükten büyüğe sırala

        int enKucukEnYakin = 0;
        int enBuyukEnYakin = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < hedef) {
                enKucukEnYakin = dizi[i];
            } else {
                enBuyukEnYakin = dizi[i];
                break; // Hedeften büyük ya da eşit olan ilk sayıyı bulduğunda döngüden çık
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enKucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enBuyukEnYakin);
    }
}
