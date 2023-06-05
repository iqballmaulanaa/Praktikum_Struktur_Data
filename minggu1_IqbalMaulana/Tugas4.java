public class Tugas4 {
    public static double[] pendapatan (int[] jumlah, int harga){
        double[] total = new double[jumlah.length];
        for (int i = 0; i < jumlah.length; i++){
            total[i] = jumlah[i] * harga;
        }
        for (int i = 0; i < jumlah.length; i++){
            if (jumlah[i] > 10){
                total[i] = total[i] - (total[i] * 0.05);
            }
        }
        return total;
    }
    public static double jumlahTotal(double[] total) {
        double totalPendapatan = 0;
        for (int i = 0; i < total.length; i++){
            totalPendapatan += total[i];
        }
        return totalPendapatan;
    }
    public static void main(String[] args) {
        String[] nama = {"Ani", "Budi", "Bina", "Cita"};
        int[] jumlahPembelian = {4, 15, 6, 11};
        int hargaPerKg = 4500;
        double[] totalPendapatan = pendapatan(jumlahPembelian, hargaPerKg);
        for (int i = 0; i < jumlahPembelian.length; i++){
            System.out.println("Total " + nama[i] + "\t= Rp. " + totalPendapatan[i]);
        }
        System.out.println("===========================");
        System.out.println("Total Pendapatan");
        System.out.println("Rp. " + jumlahTotal(totalPendapatan));
    }
}