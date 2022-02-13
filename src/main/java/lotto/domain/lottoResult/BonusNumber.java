package lotto.domain.lottoResult;

import lotto.domain.lottoNumber.LottoNumber;

public class BonusNumber {
    private LottoNumber bonusNumber;

    public BonusNumber(LottoNumber bonusNumber) {
        this.bonusNumber = bonusNumber;
    }

    public LottoNumber getBonusNumber() {
        return bonusNumber;
    }
}
