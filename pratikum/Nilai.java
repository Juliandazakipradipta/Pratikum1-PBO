public class Nilai{
    int NIM;
    String nama;
    float NilaiAbsen;
    float NilaiUAS;
    float NilaiUTS;
    float NilaiTugas;

    float Nilai(){
        return (NilaiAbsen*10/100)+(NilaiTugas*20/100)+(NilaiUTS*30/100)+(NilaiUAS*40/100);
    }

    void CetakNilai()
    {
        System.out.println("NIM : "+ this.NIM);
        System.out.println("Nama : "+ this.nama);
        System.out.println("Nilai Absen[10%] : "+ this.NilaiAbsen);
        System.out.println("Nilai Tugas[20%] : "+ this.NilaiTugas);
        System.out.println("Nilai UTS [30%] : "+ this.NilaiUTS);
        System.out.println("Nilai UAS [40%] : "+ this.NilaiUAS);
        System.out.println("Nilai Akhir : "+ this.Nilai());
        System.out.println("\n");

    }
}