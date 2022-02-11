package lotto.domain.validator.lottoResult;

public class BonusNumberValidator {
    public static void validateBonusNumber(int number) {
        if (isNotValidRangeNumber(number)) {
            throw new IllegalArgumentException("1~45사이의 숫자를 입력해주세요");
        }
    }

    private static boolean isNotValidRangeNumber(int number) {
        return number < 1 || number > 45;
    }
}
