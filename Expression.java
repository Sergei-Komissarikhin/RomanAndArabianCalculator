public class Expression {
    private int firstOperand;
    private int secondOperand;
    private String operator;
    boolean romanNumbers = false;

    public Expression(int firstOperand, int secondOperand, String operator, boolean romanNumbers) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
        this.romanNumbers = romanNumbers;
    }

    public int getFirstOperand() {
        return firstOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public String getOperator() {
        return operator;
    }

    public boolean isRomanNumbers() {
        return romanNumbers;
    }
}
