import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank[] daftarBank = new Bank[5];
        daftarBank[0] = new Bank("16030927 3084", "Wallace", "Mei Mei", "082-458-264-3263", "wallace@gmail.com");
        daftarBank[1] = new Bank("16100167 0573", "Darius", "Susanti", "081-357-843-0547", "darius@pt.org");
        daftarBank[2] = new Bank("16240401 2243", "Fuller", "Rosalia", "085-556-712-7062", "fuller@mail.com");
        daftarBank[3] = new Bank("16270525 0112", "Maria", "Krabela", "082-267-223-0234", "maria@gmail.com");
        daftarBank[4] = new Bank("16101617 2416", "Gery", "Fatimah", "083-683-416-8323", "gery@gery.com");

        ServiceTransaksi data = new ServiceTransaksi(5);
        data.tambah(new Transaksi("Tr005", 500000, 200000, 700000, "23-04-2024", "Kredit", daftarBank[0]));
        data.tambah(new Transaksi("Tr004", 450000, 150000, 600000, "23-04-2024", "Kredit", daftarBank[1]));
        data.tambah(new Transaksi("Tr003", 750000, 300000, 450000, "23-04-2024", "Debit", daftarBank[2]));
        data.tambah(new Transaksi("Tr002", 200000, 100000, 300000, "23-04-2024", "Kredit", daftarBank[3]));
        data.tambah(new Transaksi("Tr001", 300000, 100000, 200000, "23-04-2024", "Debit", daftarBank[4]));

        int pilih = 0;

        while (pilih != 6) {
            System.out.println("\n===================== POLINEMA BANK ====================");
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
                System.out.println("No Rekening\tNama\t\tNama Ibu\tNo. HP\t\t\tEmail");
                    for (Bank b : daftarBank) {
                        b.tampilDataNorek();
                    }
                    break;
                case 2:
                System.out.println("Kode Transaksi\tNo Rekening\tSaldo\t\tDebit/Kredit\tFinal Saldo\tTanggal Transaksi\tType");
                    data.displayData();
                    break;
                case 3:
                    System.out.print("Input Email: ");
                    String email = sc.nextLine();
                    data.Seacrhing(email);
                    break;
                case 4:
                    data.findMinMax();
                    break;
                case 5:
                    data.Sorting();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Input tidak valid, masukkan ulang!");
                    break;
            }
        }
        sc.close();
    }
}