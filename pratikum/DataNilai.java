public class DataNilai {
        public static void main(String[] args){
            Nilai siswa1= new Nilai();
            Nilai siswa2= new Nilai();
    
            siswa1.NIM=7878990;
            siswa1.nama= "Julianda Zaki Pradipta";
            siswa1.NilaiAbsen=10;
            siswa1.NilaiTugas=98;
            siswa1.NilaiUTS=89;
            siswa1.NilaiUAS=90;
            siswa1.Nilai();
            siswa1.CetakNilai();
    
            siswa2.NIM=5674567;
            siswa2.nama= "Fadia Hanifah";
            siswa2.NilaiAbsen=9;
            siswa2.NilaiTugas=99;
            siswa2.NilaiUTS=100;
            siswa2.NilaiUAS=89;
            siswa2.Nilai();
            siswa2.CetakNilai();
    
        }
    }
    

