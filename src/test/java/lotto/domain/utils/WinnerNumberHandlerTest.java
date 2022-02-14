package lotto.domain.utils;

import lotto.domain.lottoTicket.lottoNumber.LottoNumber;
import lotto.domain.lottoTicket.lottoNumber.LottoNumberBox;
import lotto.domain.lottoResult.BonusNumber;
import lotto.domain.lottoResult.WinnerNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.WinnerNumberHandler;

class WinnerNumberHandlerTest {
    @DisplayName("당첨 번호를 스트링으로 입력받아 분리해서 당첨번호 객체를 만드는 기능 테스트")
    @Test
    void name() {
        //given
        String inputNumbers = "1,2,3,4,5,6";
        LottoNumber inputBonusNum = LottoNumberBox.getLottoNumber(8);
        BonusNumber bonusNumber = new BonusNumber(inputBonusNum);

        //when
        WinnerNumber winnerNumber = WinnerNumberHandler.winnerNumberSaver(inputNumbers, bonusNumber);

        //then
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(0)).isEqualTo(LottoNumberBox.getLottoNumber(1));
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(1)).isEqualTo(LottoNumberBox.getLottoNumber(2));
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(2)).isEqualTo(LottoNumberBox.getLottoNumber(3));
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(3)).isEqualTo(LottoNumberBox.getLottoNumber(4));
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(4)).isEqualTo(LottoNumberBox.getLottoNumber(5));
        Assertions.assertThat(winnerNumber.getWinnerNumbers().get(5)).isEqualTo(LottoNumberBox.getLottoNumber(6));

    }
}