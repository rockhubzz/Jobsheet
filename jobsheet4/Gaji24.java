import java.util.Scanner;
public class Gaji24{
    public static void main(String[] args) {
        int jmlMasuk, jmlTdkMasuk, totGaji;
        int gaji, potGaji;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah hari kerja anda: ");
        jmlMasuk = input.nextInt();
        System.out.print("Masukkan jumlah hari tidak masuk anda: ");
        jmlTdkMasuk = input.nextInt();
        System.out.print("Masukkan jumlah besaran gaji anda: ");
        gaji = input.nextInt();
        System.out.print("Masukkan jumlah potongan gaji anda: ");
        potGaji = input.nextInt();
        totGaji=(jmlMasuk*gaji) - (jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah: Rp." +totGaji);
    }
}