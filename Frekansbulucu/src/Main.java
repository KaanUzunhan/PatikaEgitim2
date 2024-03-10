public class Main {
    public static void main(String[] args) {
        // Diziyi tanımlayın
        int[] dizi = {1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 1};

        // Frekansları saklamak için bir dizi oluşturun
        int[] frekanslar = new int[dizi.length];

        // Her elemanın frekansını hesaplayın
        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            // Elemanın frekansını bulun
            int frekans = 0;
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[j] == eleman) {
                    frekans++;
                }
            }
            // Frekansı dizide saklayın
            frekanslar[i] = frekans;
        }

        // Sonuçları yazdırın
        System.out.println("Dizi Elemanları ve Frekansları:");
        for (int i = 0; i < dizi.length; i++) {
            // Her bir eleman ve frekansını yazdırın
            System.out.println(dizi[i] + " : " + frekanslar[i]+ "  Kere tekrar edildi ") ;
            // Aynı elemanın frekansını tekrar yazdırmamak için 0 yapın
            frekanslar[i] = 0;
        }
    }
}