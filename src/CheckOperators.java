/** Checking operators */
public class CheckOperators {

    String operators = "+-*/";

    String check(String str){
        if(str.length() != 1 && !operators.contains(str)){
            throw new IllegalArgumentException("Такого оператора не существует");
        }
        return str;
    }
}
