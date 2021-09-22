import java.io.IOException;
import java.util.Scanner;


public class ReadConsole {

    static String [] read() throws  IOException{

        Scanner sc = new Scanner(System.in);

        String expression = sc.nextLine();

        String [] splittingExpression = expression.split(" ");

        if(splittingExpression.length != 3){
            throw new IOException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }


        int a = 0;
        boolean romanNumber = true;

        try {
            a = RomanNumerals.valueOf(splittingExpression[0]).getNum();
        }catch (IllegalArgumentException ex){
            romanNumber = false;
        }

        if(!romanNumber) {
            try {
                a = Integer.parseInt(splittingExpression[0]);
            } catch (NumberFormatException ex) {
                System.out.println("Неверный формат");
            }
        }
        System.out.println(a);
        return null;
    }
}
