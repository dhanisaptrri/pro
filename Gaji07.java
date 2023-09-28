import java.util.Scanner;

public class Gaji07 {

    public static void main(String [] argas ) {

        Scanner sc =new Scanner(System.in);

        int jmlMasuk;
        int JmlTdkMasuk;
        int TotGaji;
        int gaji=40000;
        int potGaji=25000;

        System.out.println("Masukan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=sc.nextInt();

        System.out.println("Masuka Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=sc.nextInt();

        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);

        System.out.println("Gaji yang anda tidak terima adalah " +TotGaji);
    }
    
}
