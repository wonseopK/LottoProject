package lotto.domain.utils;

import lotto.domain.lottoNumber.LottoNumber;
import lotto.domain.lottoNumber.LottoNumberBox;
import lotto.domain.lottoResult.BonusNumber;
import lotto.domain.lottoResult.WinnerNumber;
import lotto.domain.validator.utils.WinnerNumberHandlerValidator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WinnerNumberHandler {
    private static final String NUMBER_SPERATOR = ",";

    private WinnerNumberHandler() {
    }

    private static List<LottoNumber> splitResultNumbers(String winnserNumbers) {
        WinnerNumberHandlerValidator.validateNumber(winnserNumbers);
        return Arrays.stream(winnserNumbers.split(NUMBER_SPERATOR))
                .map(number -> LottoNumberBox.getLottoNumber(Integer.parseInt(number.trim())))
                .collect(Collectors.toList());
    }

    public static WinnerNumber winnerNumberSaver(String inputNumbers, BonusNumber bonusNumber) {
        List<LottoNumber> winnerNumbers = WinnerNumberHandler.splitResultNumbers(inputNumbers);

        return new WinnerNumber(winnerNumbers, bonusNumber);
    }
}
