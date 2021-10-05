package baseball.service;

public class InputCheck {
    private static final String regExpr = "^[0-9]+$";

    private InputCheck(){

    }
    public static boolean isDigitNumber(String inputNumber){
        return inputNumber.matches(regExpr);
    }
}
