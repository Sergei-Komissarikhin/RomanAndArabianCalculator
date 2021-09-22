import java.io.IOException;
import java.util.Arrays;

public class Expression {
    private Number firstOperand;
    private Number secondOperand;
    private String operator;

    String [] splitExpression;

    {
        try {
            splitExpression = ReadConsole.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    Expression(){
        firstOperand = new Number().takeNumber(splitExpression[0]);
        secondOperand = new Number().takeNumber(splitExpression[2]);

    }

    @Override
    public String toString() {
        return "Expression{" +
                "firstOperand=" + firstOperand +
                ", secondOperand=" + secondOperand +
                ", operator='" + operator + '\'' +
                ", splitExpression=" + Arrays.toString(splitExpression) +
                '}';
    }
}
