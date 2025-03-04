import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Калькулятор дробей");
        System.out.print("Нажмите ENTER чтоб начать");
        String input = in.nextLine();
        System.out.println("Можно считать выражения по типу: \"-1/3 * (33/7 + 14/5) - 4/5\"");
        System.out.println();

        while (true) {
            System.out.println();
            System.out.print("Введите выражение или quit" +
                    ", если хотите закончить: ");
            input = in.nextLine();

            if(input.equals("quit")){
                System.out.println("Был рад поработать для вас!");
                break;
            }

            try {
                double answer;
                if(input.contains("(") || input.contains(")")){
                    answer = Manipulations.with_brackets(input);
                }
                else{
                    answer = Manipulations.infinity_string(input);
                }
                Fraction fraction = Manipulations.make_fraction(answer);
                System.out.println("Ответ: " + fraction + " = " + answer);
            } catch(Ex_here_nol ex){
                System.out.println("Проверьте выражение и введите заново без деления на 0");
            } catch(Ex_not_fraction ex){
                System.out.println("Проверьте выражение на наличие лишних знаков или нехватки пробелов");
            }
        }
    }
}