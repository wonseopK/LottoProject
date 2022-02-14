package utils;

import lotto.domain.lottoTicket.lottoNumber.LottoNumber;
import lotto.domain.lottoTicket.lottoNumber.LottoNumberBox;
import lotto.domain.lottoResult.BonusNumber;
import lotto.domain.lottoResult.WinnerNumber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberSpliter {
    private static final String NUMBER_SPLITTOR = ",";

    private NumberSpliter() {
    }

    public static List<LottoNumber> splitNumbers(String winnserNumbers) {
        NumberSpliterValidator.validateInputWinnerNumbers(winnserNumbers);
        return Arrays.stream(winnserNumbers.split(NUMBER_SPLITTOR))
                .map(number -> LottoNumberBox.getLottoNumber(Integer.parseInt(number.trim())))
                .collect(Collectors.toList());
    }

    public static WinnerNumber winnerNumberSaver(String inputNumbers, BonusNumber bonusNumber) {
        List<LottoNumber> winnerNumbers = NumberSpliter.splitNumbers(inputNumbers);

        return new WinnerNumber(winnerNumbers, bonusNumber);
    }
}
