public class Number {
    private int num = 0;
    private boolean roman = true;



    Number takeNumber(String strNum){
        try {
            num = RomanNumerals.valueOf(strNum).getNum();
        }catch (IllegalArgumentException ex){
            roman = false;
        }
        if(!roman) {
            try {
                num = Integer.parseInt(strNum);
            } catch (NumberFormatException ex) {
                System.out.println("Неверный формат");
            }
        }
        if(num < 1 && num > 10){
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

    @Override
    public String toString() {
        return "TakeNumber{" +
                "num=" + num +
                ", roman=" + roman +
                '}';
    }
}
