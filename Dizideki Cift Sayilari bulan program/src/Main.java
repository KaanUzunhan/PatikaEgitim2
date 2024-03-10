public class Main {
    public static void main(String[] args) {
        int[] dizi = {2, 3, 4, 7, 6, 6, 7, 8, 8, 9, 10, 10, 11}; // Örnek bir dizi

        int[] tekrarEdenCiftler = new int[dizi.length];
        int tekrarEdenCiftlerIndex = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0 && contains(dizi, dizi[i])) {
                tekrarEdenCiftler[tekrarEdenCiftlerIndex++] = dizi[i];
            }
        }

        System.out.println("Dizideki tekrar eden çift sayılar:");
        for (int j = 0; j < tekrarEdenCiftlerIndex; j++) {
            System.out.println(tekrarEdenCiftler[j]);
        }
    }

    // Özel contains metodu
    public static boolean contains(int[] array, int key) {
        int count = 0;
        for (int element : array) {
            if (element == key) {
                count++;
            }
        }
        return count > 1;
    }
}