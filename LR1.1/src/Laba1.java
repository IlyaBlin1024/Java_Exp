import java.util.Scanner;

public class Laba1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день рождения: ");
        int bthmonth1;
        int bthday = in.nextInt();
        while (bthday > 31| bthday < 0) {
            if (bthday > 31| bthday < 0) {
                System.out.println("Необходимо ввести число меньше 31!");
                System.out.print("Введите день рождения: ");
                bthday = in.nextInt();
            }
        }
        System.out.print("Введите месяц рождения: ");
        int bthmonth = in.nextInt();
        while (bthmonth > 12| bthmonth < 0) {
            if (bthmonth > 12| bthmonth < 0) {
                System.out.println("Необходимо ввести число меньше 12!");
                System.out.print("Введите месяц рождения: ");
                bthmonth = in.nextInt();
            }
        }
        System.out.print("Введите год рождения: ");
        int bthyear = in.nextInt();
        while (bthyear > 2022| bthyear < 0) {
            if (bthyear > 2022| bthyear < 0){
                System.out.println("Необходимо ввести число меньше 2022!");
                System.out.print("Введите год рождения: ");
                bthyear = in.nextInt();
            }
        }
        int day = 17, month = 11, year = 2022;
        if (day+month*31<bthday+bthmonth*31) {bthyear = year - bthyear - 1;}
        else {bthyear = year - bthyear;}
        if (month >= bthmonth) {bthmonth1 = bthmonth - month;}
        else{bthmonth1 = month - bthmonth;}
        if (bthmonth1==0){}
        else {bthmonth1= 12 - bthmonth1;}
        if (day >= bthday){bthday=day-bthday;}
        else {bthday=bthday-day;}
        System.out.print(bthyear);
        System.out.println(" Лет");
        System.out.print(bthmonth1);
        System.out.println(" Месяцев");
        System.out.print(bthday);
        System.out.println(" Дней");
    }
}