import java.util.Scanner;
public class Percobaan3{
    public static double hitungLaba (double saldoInvestor, int lamaInvestasi){
        if (lamaInvestasi == 0){
            return (saldoInvestor);
        } else {
            return (1.11 * hitungLaba(saldoInvestor, lamaInvestasi -1));
        }
    }
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal: ");
        saldoAwal = sc.nextDouble();

        System.out.print("Lamanya investasi (tahun) : ");
        tahun = sc.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun: ");
        System.out.println(hitungLaba(saldoAwal,tahun));
    }
}