import java.util.Scanner;

public class fibonacci{
    public static int sepasangMarmut(int bulan){
        if (bulan == 1 || bulan == 2){
            return 1;
        } 
        return sepasangMarmut(bulan - 1) + sepasangMarmut(bulan - 2);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Masukkan bulan yang ingin dihitung (1-12): ");
        int bulan = sc.nextInt();

        int totalPasangan = sepasangMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada bulan ke-:" + bulan + " adalah: " + totalPasangan);

        sc.close();
    }
}