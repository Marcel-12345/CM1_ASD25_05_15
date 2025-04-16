public class ServiceTransaksi {
    Transaksi[] Trs;
    int index;

    public ServiceTransaksi(int kapasitas) {
        Trs = new Transaksi[kapasitas];
        index = 0;
    }

    public void tambah(Transaksi t) {
        if (index < Trs.length) {
            Trs[index] = t;
            index++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void displayData() {
        for (int i = 0; i < index; i++) {
            Trs[i].tampilDataTransaksi();
            System.out.println("--------------------");
        }
    }

    public Transaksi searchByKode(String kode) {
        for (int i = 0; i < index; i++) {
            if (Trs[i].kodeTransaksi.equals(kode)) {
                return Trs[i];
            }
        }
        return null;
    }

    public void findMinInOutByType(String tipe) {
        Transaksi min = null;
        for (int i = 0; i < index; i++) {
            if (Trs[i].type.equalsIgnoreCase(tipe)) {
                if (min == null || Trs[i].inOutSaldo < min.inOutSaldo) {
                    min = Trs[i];
                }
            }
        }
        if (min != null) {
            System.out.println("Transaksi " + tipe + " dengan nilai terkecil:");
            min.tampilDataTransaksi();
        } else {
            System.out.println("Tidak ada transaksi dengan tipe: " + tipe);
        }
    }

    public Transaksi findMaxSaldo() {
        if (index == 0) return null;
        Transaksi max = Trs[0];
        for (int i = 1; i < index; i++) {
            if (Trs[i].saldo > max.saldo) {
                max = Trs[i];
            }
        }
        return max;
    }

    public void sortBySaldoAsc() {
        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - i - 1; j++) {
                if (Trs[j].saldo > Trs[j + 1].saldo) {
                    Transaksi temp = Trs[j];
                    Trs[j] = Trs[j + 1];
                    Trs[j + 1] = temp;
                }
            }
        }
    }
}
