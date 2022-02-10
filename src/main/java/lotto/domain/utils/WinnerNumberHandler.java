package lotto.domain.utils;

import lotto.domain.lottoResult.WinnerNumber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WinnerNumberHandler {
    private static final String NUMBER_SPERATOR = ",";

    private WinnerNumberHandler() {
    }

    private static List<Integer> splitResultNumbers(String resultNumbers) {
        return Arrays.stream(resultNumbers.split(NUMBER_SPERATOR))
                .map(number -> Integer.valueOf(number.trim()))
                .sorted()
                .collect(Collectors.toList());
    }

    public static WinnerNumber winnerNumberSaver(String inputNumbers) {
        List<Integer> winnerNumbers = WinnerNumberHandler.splitResultNumbers(inputNumbers);
        return new WinnerNumber(winnerNumbers);
    }
}
