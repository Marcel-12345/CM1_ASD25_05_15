public class Bank{
    String noRekening;
    String nama;
    String namaIbu;
    String noHp;
    String email;

    Bank(String noRekening, String nama, String namaIbu, String noHp, String email){
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.noHp = noHp;
        this.email = email;
    }

    void tampilDataNorek(){
        System.out.println(noRekening + "\t" + nama + "\t\t" + namaIbu + "\t\t" + noHp + "\t" + email);
    }
}