package lotto.domain.validator.utils;

import java.util.Arrays;

public class WinnerNumberHandlerValidator {
    private WinnerNumberHandlerValidator() {

    }

    public static void validateNumber(String resultNumbers) {
        Arrays.stream(resultNumbers.split(","))
                .forEach(WinnerNumberHandlerValidator::isNumber);
    }

    private static void isNumber(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력해주세요");
        }
    }
}
