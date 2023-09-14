import java.util.Scanner;
public class Bank24{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tabungan_awal, lama_menabung;
        double persentase_bunga =0.02, bunga, tabungan_akhir;
        System.out.println("Masukkan jumlah tabungan awal anda: ");
        tabungan_awal = input.nextInt();
        System.out.println("Masukkan lama menabung anda: ");
        lama_menabung = input.nextInt();

        bunga = lama_menabung * persentase_bunga * tabungan_awal;
        tabungan_akhir = bunga + tabungan_awal;

        System.out.println("Bunga anda sebesar: " +bunga);
        System.out.println("Jumlah tabungan akhir anda adalah: " +tabungan_akhir);
    }
}