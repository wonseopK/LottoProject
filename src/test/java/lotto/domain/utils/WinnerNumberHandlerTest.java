package lotto.domain.utils;

import lotto.domain.lottoResult.BonusNumber;
import lotto.domain.lottoResult.WinnerNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WinnerNumberHandlerTest {
    @DisplayName("당첨 번호를 스트링으로 입력받아 분리해서 당첨번호 객체를 만드는 기능 테스트")
    @Test
    void name2() {
        //given
        String inputNumbers = "1,2,3,4,5,6";

        BonusNumber bonusNumber = new BonusNumber(9);
        //when
        WinnerNumber winnerNumber = WinnerNumberHandler.winnerNumberSaver(inputNumbers, bonusNumber);

        //then
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(0)).isEqualTo(1);
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(1)).isEqualTo(2);
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(2)).isEqualTo(3);
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(3)).isEqualTo(4);
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(4)).isEqualTo(5);
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(5)).isEqualTo(6);
    }

    @DisplayName("당첨 번호 범위 1~45, 숫자인지 유효성 검사")
    @Test
    void name() {
        //given


        //when

        //then
    }
}