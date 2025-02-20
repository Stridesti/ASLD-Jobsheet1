import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahMataKuliah = scanner.nextInt();
        scanner.nextLine();
        String namaMataKuliah[] = { "Pancasila", "Konsep Teknologi INformasi", "Critical Thinking Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja" };
        int sks[] = { 2, 2, 2, 3, 2, 2, 3, 2 };
        String nilaiHuruf[] = new String[8];

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMataKuliah[i] = scanner.nextLine();
            System.out.print("Masukkan bobot SKS untuk " + namaMataKuliah[i] + ": ");
            sks[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan nilai huruf untuk " + namaMataKuliah[i] + ": ");
            nilaiHuruf[i] = scanner.nextLine();
        }

        double totalNilaiSetara = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMataKuliah; i++) {
            double nilaiSetara = 0.0;
            if (nilaiHuruf[i].equals("A")) {
                nilaiSetara = 4.0;
            } else if (nilaiHuruf[i].equals("A")) {
                nilaiSetara = 3.7;
            } else if (nilaiHuruf[i].equals("B+")) {
                nilaiSetara = 3.3;
            } else if (nilaiHuruf[i].equals("B")) {
                nilaiSetara = 3.0;
            } else if (nilaiHuruf[i].equals("B")) {
                nilaiSetara = 2.7;
            } else if (nilaiHuruf[i].equals("C+")) {
                nilaiSetara = 2.3;
            } else if (nilaiHuruf[i].equals("C")) {
                nilaiSetara = 2.0;
            } else if (nilaiHuruf[i].equals("C")) {
                nilaiSetara = 1.7;
            } else if (nilaiHuruf[i].equals("D")) {
                nilaiSetara = 1.0;
            } else if (nilaiHuruf[i].equals("E")) {
                nilaiSetara = 0.0;
            }

            totalNilaiSetara += nilaiSetara * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = (totalSKS > 0) ? totalNilaiSetara / totalSKS : 0;

        System.out.printf("IP Semester: %.2f%n", ipSemester);

        scanner.close();
    }
}
