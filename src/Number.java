

/** Check and get Numbers with boolean value. Boolean meaning that number is roman or not */

public class Number {
    private int num = 0;
    private boolean roman = true;

    Number checkNumber(String strNum){
        try {
            num = RomanNumerals.valueOf(strNum).getNum();
        }catch (IllegalArgumentException ex){
            roman = false;
        }
        if(!roman) {
            try {
                num = Integer.parseInt(strNum);
            } catch (NumberFormatException ex) {
                throw new NumberFormatException("Вы ввели не целое число");
            }
        }
        if(num < 1 || num > 10){
            throw new NumberFormatException("Введенное число вне диапазона (1 - 10)");
        }
        return this;
    }

    public int getNum() {
        return num;
    }

    public boolean isRoman() {
        return roman;
    }


}
