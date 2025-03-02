import java.util.Scanner;

public class Laba2 {public static void main(String[] args) {
    int day;
    int month;

    Scanner in = new Scanner(System.in);
    System.out.print("Введите день: ");
    day = in.nextInt();
    while (day > 31 | day < 0) {
        if (day > 31) {
            System.out.println("Необходимо ввести число меньше 31!");
            System.out.print("Введите день: ");
            day = in.nextInt();
        }
    }
    System.out.print("Введите мясяц: ");
    month = in.nextInt();
    while (month > 12 | month < 0) {
        if (month > 12) {
            System.out.println("Необходимо ввести число меньше 12!");
            System.out.print("Введите месяц: ");
            month = in.nextInt();
        }
    }
    if ((month>=3)&&(month<=5)){
        System.out.print("Весна");
    }
    if ((month>=6)&&(month<=8)) {
        System.out.print("Лето");
    }
    if ((month>=9)&&(month<=11)) {
        System.out.print("Осень");
    }
    if ((month==12)|(month==1)|(month==2)) {
        System.out.print("Зима");
    }
}
}
