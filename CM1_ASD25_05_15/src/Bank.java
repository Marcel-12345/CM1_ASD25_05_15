

public class Bank{
    String noRekening;
    String nama;
    String namaIbu;
    String noHp;
    String email;

    Bank(String noRekening, String nama, String namaIbu, String noHp, String email){
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.noHp = noHp;
        this.email = email;
    }

    void tampilDataNorek(){
        System.out.println(nama + "\t" + namaIbu + "\t" + noHp + "\t" + email);
    }
}