/** Calculate result */
public class Calculate {

    static String getResult() {
        Expression exp = new Expression();
        int result;
        int a = exp.getFirstOperand().getNum();
        int b = exp.getSecondOperand().getNum();
        String str = exp.getOperator();


        switch (str) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                result = a / b;
                break;
        }
        if(exp.isArabianNumbers()) {
            return String.valueOf(result);
        }
        return ArabianToRoman.convert(result);
    }

}
