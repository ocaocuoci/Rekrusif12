import java.util.Scanner;

public class CetakPrima {

    public static boolean isPrima(int a, int b) {
        if (b == 1) {
            return true;
        }
        if (a % b == 0) {
            return false;
        }
        return isPrima(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan a: ");
        int a = sc.nextInt();

        if (a <= 1) {
            System.out.println(a + " bukan bilangan prima.");
        } else {
            boolean prima = isPrima(a, a - 1);
            if (prima) {
                System.out.println(a + " adalah bilangan prima.");
            } else {
                System.out.println(a + " bukan bilangan prima.");
            }
        }
    }
}
