package lotto.domain.validator.lottoResult;

import lotto.domain.lottoResult.BonusNumber;
import lotto.domain.utils.WinnerNumberHandler;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class WinnerNumberValidatorTest {
    @DisplayName("당첨번호의 유효성 검사 기능 테스트")
    @Test
    void name() {
        //given
        String winnerNumberCase1 = "1,2,3,4,5";
        String winnerNumberCase2 = "1,2,3,3,4,5";
        String winnerNumberCase3 = "1,2,3,4,5,67";
        String winnerNumberCase4 = "1,2,3,4,5,6";
        BonusNumber bonusNumber = new BonusNumber(9);

        WinnerNumberHandler.winnerNumberSaver(winnerNumberCase4, bonusNumber);

        //then
        Assertions.assertThatThrownBy(() -> WinnerNumberHandler.winnerNumberSaver(winnerNumberCase1, bonusNumber))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("6개의 당첨 번호를 입력해주세요");
        Assertions.assertThatThrownBy(() -> WinnerNumberHandler.winnerNumberSaver(winnerNumberCase2, bonusNumber))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("중복 없이 입력해주세요");
        Assertions.assertThatThrownBy(() -> WinnerNumberHandler.winnerNumberSaver(winnerNumberCase3, bonusNumber))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("1~45사이의 숫자를 입력해주세요");

    }
}