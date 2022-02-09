package lotto.domain.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ResultNumberHandler {
    private static final String NUMBER_SPERATOR = ",";

    private ResultNumberHandler() {
    }

    public static List<Integer> splitResultNumbers(String resultNumbers) {
        return Arrays.stream(resultNumbers.split(NUMBER_SPERATOR))
                .map(number -> Integer.valueOf(number.trim()))
                .collect(Collectors.toList());
    }
}
