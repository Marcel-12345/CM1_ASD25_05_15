import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceTransaksi data = null;
        int pilihan;

        while (true) {
            System.out.println("===================== POLINEMA BANK ====================");
            System.out.println("BANK MENU: ");
            System.out.println("1. Data Norek");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Search Data");
            System.out.println("4. Display min/max Saldo");
            System.out.println("5. Sort Data");
            System.out.println("6. Exit");
            System.out.print("Choose Menu (1-6): ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    if (data != null) {
                        data.sortBySaldoAsc();
                        System.out.println(" ");
                        data.tampil();
                    } else {
                        System.out.println("Belum ada data.");
                    }
                    break;
                case 6:
                    System.out.println("Keluar.");
                    return;
                default:
                    break;
            }
        }
    }
}