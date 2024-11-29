import java.util.Scanner;

public class DeretDescendingIteratif{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Masukkan angka b: ");
        int b  = sc.nextInt();

        System.out.println("deret dari " + b + "sampai 0 (Iteratif): ");
        tampilkanRekursif(b);

    }
    public static void tampilkanRekursif (int b){
        for(int i = b; i >= 0; i--){
            System.out.print(i + " ");
        }
    }
}