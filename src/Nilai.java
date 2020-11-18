/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
 
 public class Nilai {
    public int nilai[] = new int[20];
    public int max, min;
    
    public void inputNilaiMahasiswa(int jumlahSiswa) {
        int i;
        Scanner scn = new Scanner(System.in);
        for (i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = scn.nextInt();
        }
    }
    public void tampilNilaiMahasiswa(int jumlahSiswa){
        int i;
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
    }
    public void tampilNilaiTerbesarTerkecil(int jumlahSiswa) {
        int i;
        
        //Inisialisasi Max dan Min
        min = nilai[1];
        max = nilai[1];
        
        //Penghitungan Nilai Terbesar dan Terkecil
        for (i = 1; i <= jumlahSiswa; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            } else if (nilai[i] < min) {
                min = nilai[i];
            }
        }
    }
}