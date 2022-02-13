package lotto.domain.lottoResult;

import lotto.domain.lottoNumber.LottoNumberBox;
import lotto.domain.utils.WinnerNumberHandler;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinnerNumberTest {
    @DisplayName("입력받은 보너스번호와 당첨번호의 중복 검사")
    @Test
    void name() {
        String winnerNumbers = "1,2,3,4,5,6";
        BonusNumber bonusNumber = new BonusNumber(LottoNumberBox.getLottoNumber(3));

        Assertions.assertThatThrownBy(() -> WinnerNumberHandler.winnerNumberSaver(winnerNumbers, bonusNumber))
                .isNotInstanceOf(IllegalArgumentException.class).hasMessage("보너스번호와 당첨번호가 중복됩니다ㅏ.");
    }
}