package lotto.domain.lottoResult;

import lotto.domain.validator.lottoResult.WinnerNumberValidator;

import java.util.List;

public class WinnerNumber {
    private List<Integer> winnerNumbers;

    public WinnerNumber(List<Integer> winnerNumbers) {
        WinnerNumberValidator.checkIsValid(winnerNumbers);
        this.winnerNumbers = winnerNumbers;
    }

    public List<Integer> getWinnerNumbers() {
        return winnerNumbers;
    }
}
