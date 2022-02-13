package lotto.domain.validator.utils;

import lotto.domain.lottoNumber.LottoNumberBox;
import lotto.domain.lottoResult.BonusNumber;
import lotto.domain.utils.WinnerNumberHandler;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class WinnerNumberHandlerValidatorTest {
    @DisplayName("스플릿한 숫자의 문자여부 검사")
    @Test
    void name() {
        //given
        String case1 = "1,d,2,3,4,5";
        String case3 = "1,2,3,4,5,6";
        BonusNumber bonusNumber = new BonusNumber(LottoNumberBox.getLottoNumber(8));

        WinnerNumberHandler.winnerNumberSaver(case3, bonusNumber);

        //then
        Assertions.assertThatThrownBy(() -> WinnerNumberHandler.winnerNumberSaver(case1, bonusNumber))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("숫자만 입력해주세요");
    }

    @DisplayName("스플릿한 숫자의 길이 검사")
    @Test
    void name2() {
        //given
        String case1 = "1,2,3,4,5";
        BonusNumber bonusNumber = new BonusNumber(LottoNumberBox.getLottoNumber(8));

        //then
        Assertions.assertThatThrownBy(() -> WinnerNumberHandler.winnerNumberSaver(case1, bonusNumber))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("스플릿한 숫자의 중복 검사")
    @Test
    void name3() {
        //given
        String input = "1,2,3,4,5,5";
        BonusNumber bonusNumber = new BonusNumber(LottoNumberBox.getLottoNumber(8));

        Assertions.assertThatThrownBy(()->WinnerNumberHandler.winnerNumberSaver(input, bonusNumber))
                .isInstanceOf(IllegalArgumentException.class);


    }
}