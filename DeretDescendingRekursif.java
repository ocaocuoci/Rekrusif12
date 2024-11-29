import java.util.Scanner;
public class DeretDescendingRekursif{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Masukkan angka b: ");
        int b  = sc.nextInt();

        System.out.println("deret dari " + b + "sampai 0 (rekursif): ");
        tampilkanRekursif(b);

    }
    public static void tampilkanRekursif (int b){
        if (b < 0){
            return;
        }
        System.out.print(b + " ");
        tampilkanRekursif(b - 1);
    }
}