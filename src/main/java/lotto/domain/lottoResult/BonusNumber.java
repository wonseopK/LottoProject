package lotto.domain.lottoResult;

import lotto.domain.validator.lottoResult.BonusNumberValidator;

public class BonusNumber {
    private int bonusNumber;

    public BonusNumber(int bonusNumber) {
        BonusNumberValidator.validateBonusNumber(bonusNumber);
        this.bonusNumber = bonusNumber;
    }

    public int getBonusNumber() {
        return bonusNumber;
    }
}
