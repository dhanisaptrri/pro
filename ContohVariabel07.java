import java.util.Scanner;

public class ContohVariabel07 {

    public static void main (String [] args){

        Scanner input =new Scanner(System.in);

        String hobi = "Bermain petak umpet";
        boolean isPintar = true;
        char gender = 'L';
        byte usia = 20;
        double $ipk =3.24, tinggi = 1.78;
        System.out.println(hobi);
        System.out.println("Apakah pandai? " + isPintar);
        System.out.println("Jenis kelamain: " + gender);
        System.out.println("Umurku saat ini: " + usia);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}