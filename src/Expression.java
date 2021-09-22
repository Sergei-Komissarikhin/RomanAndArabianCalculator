/** Getting operands and operator from ReadConsole. Number systems check. */

import java.io.IOException;

public class Expression {
    private final Number firstOperand;
    private final Number secondOperand;
    private final String operator;

    String [] splitExpression;
    {
        try {
            splitExpression = ReadConsole.read();
        } catch (IOException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }
    Expression(){
        firstOperand = new Number().checkNumber(splitExpression[0]);
        secondOperand = new Number().checkNumber(splitExpression[2]);
        operator = new CheckOperators().check(splitExpression[1]);
    }

    boolean isArabianNumbers(){
        if(firstOperand.isRoman() != secondOperand.isRoman()){
            throw new NumberFormatException("Вы используете разные системы счисления одновременно");
        }
        return !firstOperand.isRoman() && !secondOperand.isRoman();
    }


    public Number getFirstOperand() {
        return firstOperand;
    }

    public Number getSecondOperand() {
        return secondOperand;
    }

    public String getOperator() {
        return operator;
    }
}
