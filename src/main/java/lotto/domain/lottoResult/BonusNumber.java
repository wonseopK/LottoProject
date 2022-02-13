package lotto.domain.lottoResult;

import lotto.domain.lottoNumber.LottoNumber;
import lotto.domain.lottoNumber.LottoNumberBox;
import lotto.domain.validator.lottoResult.BonusNumberValidator;

public class BonusNumber {
    private LottoNumber bonusNumber;

    public BonusNumber(LottoNumber bonusNumber) {
//        BonusNumberValidator.validateBonusNumber(bonusNumber);
        this.bonusNumber = bonusNumber;
    }

    public LottoNumber getBonusNumber() {
        return bonusNumber;
    }
}
