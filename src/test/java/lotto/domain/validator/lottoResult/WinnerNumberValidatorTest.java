package lotto.domain.validator.lottoResult;

import lotto.domain.lottoNumber.LottoNumberBox;
import lotto.domain.lottoResult.BonusNumber;
import lotto.domain.utils.WinnerNumberHandler;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class WinnerNumberValidatorTest {
    @DisplayName("당첨번호 갯수 6개인지 유효성 검사")
    @Test
    void name() {
        String winnerNumbers = "1,2,3,4,5";
        BonusNumber bonusNumber = new BonusNumber(LottoNumberBox.getLottoNumber(9));

        Assertions.assertThatThrownBy(() -> WinnerNumberHandler.winnerNumberSaver(winnerNumbers, bonusNumber))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("6개의 당첨 번호를 입력해주세요");
    }

    @DisplayName("번호 중복 검사")
    @Test
    void name2() {
        String winnerNumberCase2 = "1,2,3,3,4,5";
        BonusNumber bonusNumber = new BonusNumber(LottoNumberBox.getLottoNumber(9));

        Assertions.assertThatThrownBy(() -> WinnerNumberHandler.winnerNumberSaver(winnerNumberCase2, bonusNumber))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("중복 없이 입력해주세요");
    }
}