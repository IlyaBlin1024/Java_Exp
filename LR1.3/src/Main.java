import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x;
        double n;
        System.out.print("Введите перменную x: ");
        x = in.nextDouble();
        System.out.print("Введите переменную n: ");
        n = in.nextDouble();
        while (n > 15 | n < -15) {
            if (n > 15 | n < -15) {
                System.out.println("Число не должно быть больше 15 и меньше -15!");
                System.out.print("Введите перменную n: ");
                n = in.nextDouble();
            }
        }
        double l = 1;
        if (n == 0) {
            l = x;
            System.out.print(l);
        }
        if (n < 0) {
            for (int i = -1; i >= n; i--)
                l = l / x;
            System.out.print(l);
        }
        if (n > 0) {
            for (int i = 1; i <= n; i++)
                l = l * x;
            System.out.print(l);
        }
    }
}
