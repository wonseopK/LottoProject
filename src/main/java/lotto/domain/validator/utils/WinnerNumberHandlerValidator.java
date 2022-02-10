package lotto.domain.validator.utils;

import java.util.Arrays;

public class WinnerNumberHandlerValidator {
    private WinnerNumberHandlerValidator() {

    }

    public static void validateNumber(String resultNumbers) {
        Arrays.stream(resultNumbers.split(","))
                .forEach(number -> WinnerNumberHandlerValidator.validateIsNumber(number));
    }

    private static void validateIsNumber(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력해주세요");
        }
    }
}
