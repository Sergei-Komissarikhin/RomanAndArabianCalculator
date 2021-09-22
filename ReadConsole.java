import java.io.IOException;
import java.util.Scanner;


public class ReadConsole {

    static String[] read() throws  IOException{

        Scanner sc = new Scanner(System.in);

        String expression = sc.nextLine();
        String [] splitExpression = expression.split(" ");
        if(splitExpression.length != 3){
            throw new IOException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        return splitExpression;

    }
}
