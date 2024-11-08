import java.util.ArrayList;
import java.util.Scanner;

public class TranskripMahasiswa {
    static ArrayList<String> matkul = new ArrayList<>();
    static ArrayList<Integer> sks = new ArrayList<>();
    static ArrayList<Integer> nilai = new ArrayList<>();
    static ArrayList<String> imutu = new ArrayList<>();
    static ArrayList<Double> ibobot = new ArrayList<>();
    static int jSKS = 0;
    static double sumIPSemester = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("-".repeat(30));
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Semester: ");
        int semester = input.nextInt();
        System.out.println("-".repeat(30));
        input.nextLine();

        String inputLagi = "y";
        double bobot = 0.0;
        String mutu = "";

        do {
            System.out.println();
            System.out.println("-".repeat(30));
            System.out.print("Mata Kuliah: ");
            String mataKuliah = input.nextLine();
            System.out.print("SKS: ");
            int sksMatkul = input.nextInt();
            System.out.print("Nilai: ");
            int nilaiMatkul = input.nextInt();
            System.out.println("-".repeat(30));

            input.nextLine();

            if (nilaiMatkul <= 40) {
                bobot = 0.0;
                mutu = "E";
            }
            else if(nilaiMatkul <= 50){
                bobot = 1.00;
                mutu = "D";
            }
            else if(nilaiMatkul <= 54){
                bobot = 1.70;
                mutu = "C-";
            }
            else if(nilaiMatkul <= 59){
                bobot = 2.00;
                mutu = "C";
            }
            else if(nilaiMatkul <= 64){
                bobot = 2.30;
                mutu = "C+";
            }
            else if(nilaiMatkul <= 69){
                bobot = 2.70;
                mutu = "B-";
            }
            else if(nilaiMatkul <= 74){
                bobot = 3.00;
                mutu = "B";
            }
            else if(nilaiMatkul <= 79){
                bobot = 3.30;
                mutu = "B+";
            }
            else if(nilaiMatkul <= 84){
                bobot = 3.70;
                mutu = "A-";
            }
            else if(nilaiMatkul >= 85){
                bobot = 4.00;
                mutu = "A";
            }

            sumIPSemester = sumIPSemester + (bobot*sksMatkul);
            jSKS = jSKS + sksMatkul;

            matkul.add(mataKuliah);
            sks.add(sksMatkul);
            nilai.add(nilaiMatkul);
            imutu.add(mutu);
            ibobot.add(bobot);

            System.out.println();
            System.out.print("Mau input lagi? (y/n): ");
            inputLagi = input.nextLine().toLowerCase();
        } while (inputLagi.equals("y"));
        System.out.println("");
        System.out.println("=".repeat(60));
        System.out.println("Nama: "+nama);
        System.out.println("Semester: "+semester);
        System.out.println("=".repeat(60));
        System.out.println("No \t Mata Kuliah \t SKS \t Mutu \t Bobot \t Nilai");
        for (int i = 0; i < matkul.size(); i++) {
            String mataKuliah = matkul.get(i);
            int sksMatkul = sks.get(i);
            int nilaiMatkul = nilai.get(i);
            mutu = imutu.get(i);
            bobot = ibobot.get(i);
            System.out.println((i+1)+ "." +"\t "+ mataKuliah +"\t "+ sksMatkul +"\t  "+ mutu +"\t  "+ bobot +"\t  "+ nilaiMatkul);
        }

        System.out.println();
        System.out.println("=".repeat(60));
        double avgIPSemester = sumIPSemester/jSKS;
        System.out.println("Jumlah SKS: "+jSKS);
        System.out.println("IP Semester: "+avgIPSemester);
        System.out.println("Jumlah SKS yang bisa diambil semester depan: 24");
        System.out.println("=".repeat(60));
        input.close();
        
    }
}