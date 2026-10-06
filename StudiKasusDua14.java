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

        if (jumlahDokumen < 4) {
            int kurang = 4 - jumlahDokumen;

            System.out.println("Status : Dokumen tidak lengkap (kurang "
                    + kurang + " dokumen). Dana penghargaan tidak diberikan.");
        } else {
            if (jenisKegiatan.equalsIgnoreCase("BEMLAWA")
                    || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                    || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Dokumen lengkap dan berhak "
                            + "mendapatkan dana penghargaan.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi tidak "
                            + "mendapatkan dana penghargaan karena bukan juara 1-3.");
                }

            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

                if (statusPendanaanPKM == 1) {
                    System.out.println("Status : Dokumen lengkap dan berhak "
                            + "mendapatkan dana penghargaan.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi tidak "
                            + "mendapatkan dana penghargaan karena PKM tidak lolos pendanaan.");
                }

            } else {
                System.out.println("Status : Dokumen lengkap, tetapi kegiatan "
                        + "tidak termasuk yang mendapatkan dana penghargaan.");
            }
        }

        input.close();
    }
}