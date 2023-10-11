public class MahasiswaBeraksi {
    public static void main(String[] args){
        Mahasiswa siswa = new Mahasiswa();

        siswa.Membaca = "membaca";
        siswa.Nyontek = "Menyontek";
        siswa.Modifikasi = "Memodifikasi";
        System.out.println ("Mahasiswa itu "+ siswa.Membaca);
        System.out.println ("Mahasiswa itu "+ siswa.Nyontek);
        System.out.println ("Mahasiswa itu "+ siswa.Modifikasi);
    }
}
