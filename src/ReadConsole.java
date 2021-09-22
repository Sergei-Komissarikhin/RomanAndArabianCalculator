import java.io.IOException;
import java.util.Scanner;

/** Чтение из консоли. Проверка на колличество операторов и операндов.
 * Возвращение массива */

public class ReadConsole {

    static String[] read() throws  IOException{

        Scanner sc = new Scanner(System.in);

        String expression = sc.nextLine();
        String [] splitExpression = expression.split(" ");

        if(splitExpression.length > 3){
            throw new NumberFormatException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }else if(splitExpression.length < 3)
            throw new NumberFormatException("Введенная строка не является математической операцией");

        return splitExpression;

    }
}
