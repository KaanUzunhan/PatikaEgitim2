public class Main {
    public static double harmonikOrtalama(int[] dizi) {
        int n = dizi.length;
        double harmonikSeri = 0.0;

        for (int i = 0; i < n; i++) {
            harmonikSeri += 1.0 / dizi[i];
        }

        return n / harmonikSeri;
    }

    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5};
        double sonuc = harmonikOrtalama(dizi);
        System.out.println("Dizinin harmonik ortalaması: " + sonuc);
    }
}