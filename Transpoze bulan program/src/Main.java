public class Main {
    public static void main(String[] args) {
        // Örnek bir matris oluşturun
        int[][] matris = {{2, 3, 4}, {5, 6, 4}};

        // Matrisin boyutlarını alın
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;

        // Transpoz matrisi için yeni bir dizi oluşturun
        int[][] transpozMatris = new int[sutunSayisi][satirSayisi];

        // Matrisin transpozunu hesaplayın
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpozMatris[j][i] = matris[i][j];
            }
        }

        // Matrisi ve transpozunu ekrana yazdırın
        System.out.println("Matris:");
        matrisiYazdir(matris);
        System.out.println("Transpoze:");
        matrisiYazdir(transpozMatris);
    }

    // Matrisi ekrana yazdıran yardımcı fonksiyon
    public static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
    }
}