package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.lottoNumber.LottoNumber;

import java.util.List;

public class WinnerNumber {
    public static final String BONUS_NUMBER_HAS_WIN_NUMBER = "보너스번호와 당첨번호가 중복됩니다.";

    private final BonusNumber bonusNumber;
    private final List<LottoNumber> winnerNumbers;

    public WinnerNumber(List<LottoNumber> winnerNumbers, BonusNumber bonusNumber) {
        validateBonusNumberNotContainWinnerNumber(winnerNumbers, bonusNumber);
        this.winnerNumbers = winnerNumbers;
        this.bonusNumber = bonusNumber;
    }

    private void validateBonusNumberNotContainWinnerNumber(List<LottoNumber> winnerNumbers, BonusNumber bonusNumber) {
        if (winnerNumbers.contains(bonusNumber.getBonusNumber())) {
            throw new IllegalArgumentException(BONUS_NUMBER_HAS_WIN_NUMBER);
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
