package lotto.domain.validator.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WinnerNumberHandlerValidator {
    private WinnerNumberHandlerValidator() {

    }

    public static void validateNumber(String resultNumbers) {
        List<String> winnerNumbers = Arrays.stream(resultNumbers.split(",")).collect(Collectors.toList());
        System.out.println(winnerNumbers.size()+"size");
        validateLength(winnerNumbers);
        winnerNumbers.forEach(WinnerNumberHandlerValidator::isNumber);
    }

    private static void validateLength(List<String> winnerNumbers){
        if (winnerNumbers.size() < 6){

        }
    }
    private static void isNumber(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력해주세요");
        }
    }
}
