import java.util.Scanner;
public class HargaBayar24 {
    public static void main(String[] args) {
        int harga, jumlah, jmlHal, dis;
        double total, bayar, jmlDis;
        String merk;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan merk buku yang dibeli : ");
        merk = input.next();
        System.out.print("Masukkan jumlah halaman buku yang dibeli : ");
        jmlHal = input.nextInt();
        System.out.print("Masukkan harga barang yang dibeli : ");
        harga = input.nextInt();
        System.out.print("Masukkan jumlah barang yang dibeli : ");
        jumlah = input.nextInt();
        System.out.print("Masukkan jumlah diskon (%): ");
        dis = input.nextInt();

        total=harga*jumlah;
        jmlDis=total*dis/100;
        bayar=total-jmlDis;

        System.out.println("\nMerk buku yang dibeli: " +merk);
        System.out.println("Jumlah halaman buku yang dibeli: " + jmlHal);
        System.out.println("Diskon yang anda dapatkan adalah: " + jmlDis);
        System.out.println("Jumlah yang harus anda bayar adalah: " +bayar);

    }
}