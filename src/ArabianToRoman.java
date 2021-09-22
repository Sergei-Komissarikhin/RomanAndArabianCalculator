/** Converting arabian number in roman if it needs*/

public class ArabianToRoman {
    static StringBuilder romanResult = new StringBuilder();
    static String convert(int result){
        if(result < 1)
            throw new NumberFormatException("В Римской системе исчисления нет отрицательных чисел и нуля");
        else if (result < 11)  return RomanNumerals.values()[result-1].toString();
        else {
            romanResult.append(RomanNumeralsMoreThanTen.values()[(result/10)-1].toString());
            if(result%10 - 1 >= 0) {
                romanResult.append(RomanNumerals.values()[result % 10 - 1].toString());
            }
            return romanResult.toString();
        }
    }
}
