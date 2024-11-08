import java.util.Scanner;
public class Gaji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gaji,jamLembur;

        System.out.println("Masukan Gaji: ");
        gaji = sc.nextInt();
        System.out.println("Jam Lembur: ");
        jamLembur = sc.nextInt();

        if (jamLembur > 4) {
            int upahLemburPerjam = (int) Math.ceil(gaji/173);
            int penambah = jamLembur - 4;
            int upah = ((4*upahLemburPerjam)+(penambah*2*upahLemburPerjam));
            int totalGaji = gaji + upah;

            System.out.println("Gaji yang diterima: "+totalGaji);
        }
        sc.close();
    }
}
