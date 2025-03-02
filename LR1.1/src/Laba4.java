import java.util.Scanner;

public class Laba4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество: ");
        int N = in.nextInt();
        int i = 1;
        while (N <= 0) {
            if (N <= 0) {
                System.out.println("Необходимо ввести число большее нуля!");
                System.out.print("Введите количество: ");
                N = in.nextInt();
            }
        }
        System.out.print("Введите радиус: ");
        int radius = in.nextInt();
        while (radius < 0) {
            if (radius < 0) {
                System.out.println("Необходимо ввести число большее или равное нулю!");
                System.out.print("Введите радиус: ");
                radius = in.nextInt();
            }
        }
        int vse = 0;
        while (i <= N) {
            System.out.print("X");
            System.out.print(i);
            System.out.print(": ");
            int X = in.nextInt();
            System.out.print("Y");
            System.out.print(i);
            System.out.print(": ");
            int Y = in.nextInt();
            i = i + 1;
            if (X * X + Y * Y <= radius * radius) {
                vse = vse + 1;
            }
        }
        System.out.print(vse);
        System.out.println(" точек попадают в эту окружность");
    }
}
