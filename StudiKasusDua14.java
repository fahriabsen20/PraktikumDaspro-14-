import java.util.Scanner;

public class StudiKasusDua14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int peringkatJuara;
        int statusPendanaanPKM;

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = input.nextLine();

        System.out.print("Jenis kegiatan (BEMLAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = input.nextLine();

        System.out.print("Jumlah dokumen : ");
        jumlahDokumen = input.nextInt();

        System.out.print("Peringkat juara : ");
        peringkatJuara = input.nextInt();

        System.out.print("Status pendanaan PKM : ");
        statusPendanaanPKM = input.nextInt();
    }
}