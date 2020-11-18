/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 
 public class App {
    public static void main(String[] args) throws Exception {
        String namaPetugas;
        int jumlahSiswa;

        Nilai result = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya nilai Mahasiswa :  ");
        jumlahSiswa = scn.nextInt();
        System.out.println();

        result.inputNilaiMahasiswa(jumlahSiswa);
        System.out.println();
        result.tampilNilaiTerbesarTerkecil(jumlahSiswa);
        
        System.out.println("Nilai Terbesar : " + result.max);
        System.out.println("Nilai Terkecil : " + result.min);
        System.out.println();
        System.out.println("Nama Petugas : " + namaPetugas);
    }
}
