/** Roman numbers from Ten to One Hundred*/
public enum RomanNumeralsMoreThanTen {
    X(10), XX(20), XXX(30), XL(40), L(50), LX(60), LXX(70), LXXX(80), XC(90), C(100);
    private int num;
    RomanNumeralsMoreThanTen(int i) {
        this.num = i;
    }

    public int getNum() {
        return num;
    }
}
