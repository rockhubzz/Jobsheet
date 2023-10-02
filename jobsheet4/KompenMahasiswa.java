import java.util.Scanner;

public class KompenMahasiswa {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    byte subChoice2;
    int rekap, smt1 = 3, smt2 = 1, smt3 = 8, smt4 = 3, smt5 = 6, kompen1, kompen2, kompen3, kompen4, kompen5;
                        System.out.println("\n=== Alpaku ===");
                        System.out.println("1. Semester 1");
                        System.out.println("2. Semester 2");
                        System.out.println("3. Semester 3");
                        System.out.println("4. Semester 4");
                        System.out.println("5. Semester 5");
                        System.out.println("6. Rekap Tugas Kompen");
                        System.out.print("Masukkan pilihan anda: ");
                        subChoice2 = input.nextByte();

                        // Submenu Alpaku
                        byte subSubChoice2;
                        switch (subChoice2) {
                            case 1: // Semester 1
                                kompen1 = smt1*10;
                                System.out.println("Jumlah Alpa Semester 1: " + smt1 + " jam");
                                System.out.println("Total jam tugas kompen Semester 1: " + kompen1 + " jam");
                                break;
                            case 2: // Semester 2
                            kompen2 = smt2*8;
                                System.out.println("Jumlah Alpa Semester 2: " + smt2 + " jam");
                                System.out.println("Total jam tugas kompen Semester 2: " + kompen2 + " jam");
                                break;
                            case 3: // Semester 3
                            kompen3 = smt3*6;
                                System.out.println("Jumlah Alpa Semester 3: " + smt3 + " jam");
                                System.out.println("Total jam tugas kompen Semester 3: " + kompen3 + " jam");
                                break;
                            case 4: // Semester 4
                            kompen4 = smt4*4;
                                System.out.println("Jumlah Alpa Semester 4: " + smt4 + " jam");
                                System.out.println("Total jam tugas kompen Semester 4: " + kompen4 + " jam");
                                break;
                            case 5: // Semester 5
                            kompen5 = smt5 * 2;
                                System.out.println("Jumlah Alpa Semester 5: " + smt5 + " jam");
                                System.out.println("Total jam tugas kompen Semester 5: " + kompen5 + " jam");
                                break;

                            case 6: // Rekap Total Tugas Kompen
                                rekap = (smt1 * 10) + (smt2 * 8) + (smt3 * 6) + (smt4 * 4) + (smt5 * 2);
                                System.out.println("Total Tugas kompen yang harus diselesaikan: " + rekap + " jam");
                                break;
                            }
                        }
                    }