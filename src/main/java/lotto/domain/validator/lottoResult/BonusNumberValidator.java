package lotto.domain.validator.lottoResult;

public class BonusNumberValidator {
    public static void checkIsValid(int number){
        boolean isValidRange = isValidRangeNumber(number);
        if(isValidRange){
            throw new IllegalArgumentException("1~45사이의 숫자를 입력해주세요");
        }
    }

    private static boolean isValidRangeNumber(int number){
        return number >= 1 && number <=45;
    }
}
