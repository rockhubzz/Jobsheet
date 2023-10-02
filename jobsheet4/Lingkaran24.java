import java.util.Scanner;
public class Lingkaran24{
    public static void main(String[] args) {
        int r;
        double keliling, luas, phi=3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran (cm): ");
        r = input.nextInt();
        keliling = 2*phi*r;
        luas = phi*r*r;
        System.out.println("Keliling: " + keliling + " cm");
        System.out.println("Luas: " + luas + " cm");
    }
}