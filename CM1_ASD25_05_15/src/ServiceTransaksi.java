public class ServiceTransaksi {
    Transaksi[] Trans;
    int index;

    public ServiceTransaksi(int kapasitas) {
        Trans = new Transaksi[kapasitas];
        index = 0;
    }

    public void tambah(Transaksi t) {
        if (index < Trans.length) {
            Trans[index] = t;
            index++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void displayData() {
        for (int i = 0; i < index; i++) {
            Trans[i].tampilDataTransaksi();
            System.out.println("--------------------");
        }
    }

    void Seacrhing(String email) {
        boolean temukan = false;
        for (Transaksi t : Trans) {
            if (t != null && t.bankAcc.email.equalsIgnoreCase(email)) {
                t.tampilDataTransaksi();
                temukan = true;
            }
        }
        if (!temukan) {
            System.out.println("Transaksi dengan email " + email + " tidak ditemukan.");
        }
    }

    void findMinMax() {
        if (Trans.length == 0 || Trans[0] == null) {
            System.out.println("Tidak ada data transaksi.");
            return;
        }

        Transaksi max = Trans[0];
        for (Transaksi t : Trans) {
            if (t != null && t.inOutSaldo > max.inOutSaldo) {
                max = t;
            }
        }

        System.out.println("Menampilkan Transaksi dengan Debit/Kredit Tertinggi:");
        max.tampilDataTransaksi();
    }

    void Sorting() {
        for (int i = 0; i < Trans.length - 1; i++) {
            for (int j = 0; j < Trans.length - i - 1; j++) {
                if (Trans[j] != null && Trans[j + 1] != null && Trans[j].inOutSaldo > Trans[j + 1].inOutSaldo) {
                    Transaksi temp = Trans[j];
                    Trans[j] = Trans[j + 1];
                    Trans[j + 1] = temp;
                }
            }
        }

        System.out.println("Transaksi diurutkan berdasarkan Debit/Kredit ASC:");
        displayData();
    }
}
