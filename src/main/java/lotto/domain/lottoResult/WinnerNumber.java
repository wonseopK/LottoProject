package lotto.domain.lottoResult;

import lotto.domain.validator.lottoResult.WinnerNumberValidator;

import java.util.List;

public class WinnerNumber {
    private BonusNumber bonusNumber;

    private List<Integer> winnerNumbers;

    public WinnerNumber(List<Integer> winnerNumbers) {
        WinnerNumberValidator.checkIsValid(winnerNumbers);
        this.winnerNumbers = winnerNumbers;
    }

    public List<Integer> getWinnerNumbers() {
        return winnerNumbers;
    }

    public BonusNumber getBonusNumber() {
        return bonusNumber;
    }

    public void setBonusNumber(BonusNumber bonusNumber) {
        this.bonusNumber = bonusNumber;
    }
}
