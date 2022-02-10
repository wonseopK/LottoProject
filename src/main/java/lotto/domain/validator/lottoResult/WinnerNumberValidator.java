package lotto.domain.validator.lottoResult;

import lotto.domain.lottoResult.WinnerNumber;
import lotto.view.OutputView;

import java.util.List;

public class WinnerNumberValidator {
    public static final int LOTTO_NUMBER_SIZE = 6;

    private WinnerNumberValidator() {
    }

    public static void checkIsValid(List<Integer> winnerNumbers) {

        boolean isValidSize = WinnerNumberValidator.checkIsValidSize(winnerNumbers);
        boolean isDuplicated = WinnerNumberValidator.checkIsDuplicated(winnerNumbers);
        boolean checkIsValidRangeNumbers = WinnerNumberValidator.checkIsValidRangeNumbers(winnerNumbers);
        System.out.println("출력" + checkIsValidRangeNumbers);

        if (!isValidSize) {
            throw new IllegalArgumentException("6개의 당첨 번호를 입력해주세요");
        }
        if (!isDuplicated) {
            throw new IllegalArgumentException("중복 없이 입력해주세요");
        }
        if (!checkIsValidRangeNumbers) {
            throw new IllegalArgumentException("1~45사이의 숫자를 입력해주세요");
        }

    }

    private static boolean checkIsValidSize(List<Integer> winnerNumbers) {
        return winnerNumbers.size() == LOTTO_NUMBER_SIZE;
    }

    private static boolean checkIsDuplicated(List<Integer> winnerNumbers) {
        int distinctedCount = (int) winnerNumbers
                .stream()
                .distinct()
                .count();
        return distinctedCount == LOTTO_NUMBER_SIZE;
    }

    private static boolean checkIsValidRangeNumbers(List<Integer> winnerNumbers) {
        int erroCount = (int) winnerNumbers.stream()
                .filter(number->checkIsValidRangeNumber(number))
                .count();
        System.out.println(erroCount);
        return erroCount < 1;
    }

    private static boolean checkIsValidRangeNumber(int number) {
        return number < 1 || number > 45;
    }

}
