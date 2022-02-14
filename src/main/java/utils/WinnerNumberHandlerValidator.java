package utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WinnerNumberHandlerValidator {
    private WinnerNumberHandlerValidator() {

    }

    public static void validateInputWinnerNumbers(String inputWinnerNumbers) {
        List<String> winnerNumbers = Arrays.stream(inputWinnerNumbers.split(",")).collect(Collectors.toList());
        validateLength(winnerNumbers);
        validateNotDuplicate(winnerNumbers);
        winnerNumbers.forEach(WinnerNumberHandlerValidator::validateNumber);
    }

    private static void validateLength(List<String> winnerNumbers) {
        if (winnerNumbers.size() < 6) {
            throw new IllegalArgumentException("6개의 당첨 번호를 입력해주세요");
        }
    }

    private static void validateNotDuplicate(List<String> winnerNumbers) {
        long distinctedCount = winnerNumbers
                .stream()
                .distinct()
                .count();
        boolean isDuplicated = distinctedCount != 6;
        if (isDuplicated) {
            throw new IllegalArgumentException("중복 없이 입력해주세요");
        }
    }

    private static void validateNumber(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력해주세요");
        }
    }
}
