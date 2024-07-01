import java.util.Scanner;
public class LatTambahan3_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan harga laptop: ");
        double hargaLaptop = scan.nextDouble();

        System.out.print("Masukkan periode angsuran (3 atau 6 atau 12 bulan): ");
        int periodeAngsuran = scan.nextInt();

        double totalAngsuran = 0;

        if (hargaLaptop >= 20000000) {
            if (periodeAngsuran == 3) {
                totalAngsuran = (hargaLaptop / 3) + (hargaLaptop * 0.5/100);
            } else if (periodeAngsuran == 6) {
                totalAngsuran = (hargaLaptop / 6) + (hargaLaptop * 1/100);
            } else if (periodeAngsuran == 12) {
                totalAngsuran = (hargaLaptop / 12) + (hargaLaptop * 2/100);
            } else {
                System.out.println("Salah masukan bulan");
            }
        } else if (hargaLaptop >= 5000000) {
            if (periodeAngsuran == 3) {
                totalAngsuran = (hargaLaptop / 3) + (hargaLaptop * 0.5/100);
            } else if (periodeAngsuran == 6) {
                totalAngsuran = (hargaLaptop / 6) + (hargaLaptop * 1/100);
            } else if (periodeAngsuran == 12) {
                totalAngsuran = (hargaLaptop / 12) + (hargaLaptop * 2/100);
            } else {
                System.out.println("Salah masukan bulan");
            }
        } else {
            System.out.println("Pembeli harus membayar cash karena harga laptop kurang dari 5.000.000");
        }

        System.out.println("Total angsuran /Bulan Rp: " + totalAngsuran);
    }
}