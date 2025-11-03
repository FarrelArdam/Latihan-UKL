import java.util.Scanner;

public class UKL_Soal1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;

        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        double totalBiaya = berat * biayaPerKg;

        if (volume > 100) {
            totalBiaya += 50000;
        }

        System.out.println("=========================================");
        System.out.println("Berat paket : " + berat + " kg");
        System.out.println("Jarak pengiriman : " + jarak + " km");
        System.out.println("Volume paket : " + volume + " cm");
        System.out.println("Biaya total pengiriman: Rp " + totalBiaya);
        System.out.println("=========================================");
    }
}
