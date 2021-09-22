import java.io.IOException;

public class Expression {
    private int firstOperand;
    private int secondOperand;
    private String operator;
    boolean romanNumbers = false;

    String [] splitExpression = ReadConsole.read();

    public Expression() throws IOException {
    }
}
