package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.lottoNumber.LottoNumber;

public class BonusNumber {
    private LottoNumber bonusNumber;

    public BonusNumber(LottoNumber bonusNumber) {
        this.bonusNumber = bonusNumber;
    }

    public LottoNumber getBonusNumber() {
        return bonusNumber;
    }
}
