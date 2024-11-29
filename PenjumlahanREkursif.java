import java.util.Scanner;

public class PenjumlahanREkursif{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Masukkan angka b: ");
        int b  = sc.nextInt();

        System.out.println("deret dari " + b + "sampai 0 (rekursif): ");
        tampilkanRekursif(b);

        int jumlah = jumlahNilai(b);
        System.out.println(" = "+ jumlah);

    }
    public static void tampilkanRekursif (int b){
        if (b < 0){
            return;
        }
        System.out.print(b + " + ");
        tampilkanRekursif(b - 1);
    }
    public static int jumlahNilai(int a){
        if (a == 0){
            return a;
        }
        return a + jumlahNilai(a - 1);
    }
}