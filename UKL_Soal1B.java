import java.util.Scanner;

public class UKL_Soal1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan GENAP.");
        } else {
            System.out.println(bilangan + " adalah bilangan GANJIL.");
        }
    }
}
