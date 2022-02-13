package lotto.domain.lottoResult;

import lotto.domain.lottoNumber.LottoNumber;
import lotto.domain.validator.lottoResult.WinnerNumberValidator;

import java.util.List;

public class WinnerNumber {
    private BonusNumber bonusNumber;
    private final List<LottoNumber> winnerNumbers;

    public WinnerNumber(List<LottoNumber> winnerNumbers, BonusNumber bonusNumber) {
//        WinnerNumberValidator.validateWinnerNumbers(winnerNumbers);
//        validateBonusNumberNotContainWinnerNumber(winnerNumbers, bonusNumber);
        this.winnerNumbers = winnerNumbers;
        this.bonusNumber = bonusNumber;
    }

    private void validateBonusNumberNotContainWinnerNumber(List<LottoNumber> winnerNumbers, BonusNumber bonusNumber) {
        if (winnerNumbers.contains(bonusNumber.getBonusNumber())) {
            throw new IllegalArgumentException("당첨번호에 중복되는 숫자입니다.");
        }

    }

    public List<LottoNumber> getWinnerNumbers() {
        return winnerNumbers;
    }

    public BonusNumber getBonusNumber() {
        return bonusNumber;
    }

    // TODO: 2022/02/10 set쓰지않기
}
