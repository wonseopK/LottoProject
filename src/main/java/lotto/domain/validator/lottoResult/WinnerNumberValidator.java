package lotto.domain.validator.lottoResult;


import java.util.List;

public class WinnerNumberValidator {
    public static final int LOTTO_NUMBER_SIZE = 6;

    private WinnerNumberValidator() {
    }

    public static void validateWinnerNumbers(List<Integer> winnerNumbers) {
        // TODO: 2022/02/10
        if (isNotValidSize(winnerNumbers)) {
            throw new IllegalArgumentException("6개의 당첨 번호를 입력해주세요");
        }
        if (isDuplicated(winnerNumbers)) {
            throw new IllegalArgumentException("중복 없이 입력해주세요");
        }
        if (isNotValidRangeNumbers(winnerNumbers)) {
            throw new IllegalArgumentException("1~45사이의 숫자를 입력해주세요");
        }

    }

    private static boolean isNotValidSize(List<Integer> winnerNumbers) {
        return winnerNumbers.size() != LOTTO_NUMBER_SIZE;
    }

    private static boolean isDuplicated(List<Integer> winnerNumbers) {
        int distinctedCount = (int) winnerNumbers
                .stream()
                .distinct()
                .count();
        return distinctedCount != LOTTO_NUMBER_SIZE;
    }

    private static boolean isNotValidRangeNumbers(List<Integer> winnerNumbers) {
        return winnerNumbers.stream()
                .anyMatch(WinnerNumberValidator::isNotValidRangeNumber);
    }

    private static boolean isNotValidRangeNumber(int number) {
        return number < 1 || number > 45;
    }

}
