package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.lottoNumber.LottoNumberBox;
import utils.NumberSpliter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WinnerNumberTest {
    @DisplayName("입력받은 보너스번호와 당첨번호의 중복 검사")
    @Test
    void name() {
        String winnerNumbers = "1,2,3,4,5,6";
        BonusNumber bonusNumber = new BonusNumber(LottoNumberBox.getLottoNumber(3));

        Assertions.assertThatThrownBy(() -> NumberSpliter.winnerNumberSaver(winnerNumbers, bonusNumber))
                .isInstanceOf(IllegalArgumentException.class).hasMessage(WinnerNumber.BONUS_NUMBER_HAS_WIN_NUMBER);
    }
}