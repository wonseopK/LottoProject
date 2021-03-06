package utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberSpliterValidator {
    public static final int LOTTO_NUMBER_SIZE = 6;
    public static final String NUMBER_SPLITER = ",";

    public static final String NOT_ENOUGH_LOTTO_SIZE = "6개의 번호를 입력해주세요";
    public static final String DUPLICATED_NUMBER = "중복 없이 입력해주세요";
    public static final String NOT_NUMBER = "숫자만 입력해주세요";

    private NumberSpliterValidator() {

    }

    public static void validateInputWinnerNumbers(String inputWinnerNumbers) {
        List<String> winnerNumbers = Arrays.stream(inputWinnerNumbers.split(NUMBER_SPLITER)).collect(Collectors.toList());
        validateLength(winnerNumbers);
        validateNotDuplicate(winnerNumbers);
        winnerNumbers.forEach(NumberSpliterValidator::validateNumber);
    }

    private static void validateLength(List<String> winnerNumbers) {
        if (winnerNumbers.size() < LOTTO_NUMBER_SIZE) {
            throw new IllegalArgumentException(NOT_ENOUGH_LOTTO_SIZE);
        }
    }

    private static void validateNotDuplicate(List<String> winnerNumbers) {
        long distinctedCount = winnerNumbers
                .stream()
                .distinct()
                .count();
        boolean isDuplicated = distinctedCount != LOTTO_NUMBER_SIZE;
        if (isDuplicated) {
            throw new IllegalArgumentException(DUPLICATED_NUMBER);
        }
    }

    private static void validateNumber(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NOT_NUMBER);
        }
    }
}
