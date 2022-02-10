package lotto.domain.lottoResult;

import lotto.domain.validator.lottoResult.WinnerNumberValidator;

import java.util.List;

public class WinnerNumber {
    private BonusNumber bonusNumber;
    private final List<Integer> winnerNumbers;

    public WinnerNumber(List<Integer> winnerNumbers, BonusNumber bonusNumber) {
        WinnerNumberValidator.checkIsValid(winnerNumbers);
        this.winnerNumbers = winnerNumbers;
        this.bonusNumber = bonusNumber;
    }

    public List<Integer> getWinnerNumbers() {
        return winnerNumbers;
    }

    public BonusNumber getBonusNumber() {
        return bonusNumber;
    }

    // TODO: 2022/02/10 set쓰지않기
}
