public class Tugas3 {
    public static void main(String[] args) {
        int[][] bunga = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        int[] harga = {75000, 50000, 60000, 10000};
        int[] stok = {0, 0, 0, 0};
        int pendapatanRoyalGarden1 = 0;
        for (int i = 0; i < bunga[0].length; i++) {
            for (int j = 0; j < bunga.length; j++) {
                    stok[i] += bunga[j][i];
            }
        } 
        System.out.println("Stok Aglonema\t: " + stok[0]);
        System.out.println("Stok Keladi\t: " + stok[1]);
        System.out.println("Stok Alocasia\t: " + stok[2]);
        System.out.println("Stok Mawar\t: " + stok[3]);
        System.out.println("=============================");
        bunga[0][0] -= 1;
        bunga[0][1] -= 2;
        bunga[0][2] -= 0;
        bunga[0][3] -= 5;
        for (int i = 0; i < bunga[0].length; i++) {
            stok[i] = 0;
            for (int j = 0; j < bunga.length; j++) {
                    stok[i] += bunga[j][i];
            }
        } 
        System.out.println("Stok Aglonema\t: " + stok[0]);
        System.out.println("Stok Keladi\t: " + stok[1]);
        System.out.println("Stok Alocasia\t: " + stok[2]);
        System.out.println("Stok Mawar\t: " + stok[3]);
        System.out.println("=============================");
        for (int i = 0; i < stok.length; i++) {
            pendapatanRoyalGarden1 += stok[i]*harga[i];
        }
        System.out.println("Pendapatan Royal Garden 1");
        System.out.println("Rp. " + pendapatanRoyalGarden1);
    }
}