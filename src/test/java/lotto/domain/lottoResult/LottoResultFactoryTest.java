package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.lottoNumber.LottoNumber;
import lotto.domain.lottoTicket.lottoNumber.LottoNumberBox;
import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;
import utils.WinnerNumberHandler;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LottoResultFactoryTest {
    @DisplayName("로또티켓과 당첨번호를 입력하고 결과가 보너스인지 확인하는 테스트")
    @Test
    void name() {
        //given
        String winnerNumbers = "1,2,3,4,5,6";
        BonusNumber bonusNumber = new BonusNumber(LottoNumberBox.getLottoNumber(7));
        WinnerNumber winnerNumber = WinnerNumberHandler.winnerNumberSaver(winnerNumbers, bonusNumber);

        List<LottoNumber> lottoNumberss = Arrays.asList(
                LottoNumberBox.getLottoNumber(1),
                LottoNumberBox.getLottoNumber(2),
                LottoNumberBox.getLottoNumber(3),
                LottoNumberBox.getLottoNumber(4),
                LottoNumberBox.getLottoNumber(5),
                LottoNumberBox.getLottoNumber(7)
        );
        LottoTicket lottoTicket = new LottoTicket(lottoNumberss);
        List<LottoTicket> lottoTickets = new ArrayList<>();
        lottoTickets.add(lottoTicket);

        LottoTickets lottoTicketsFinal = new LottoTickets(lottoTickets);

        //when
        LottoResult lottoResult = LottoResultFactory.getLottoResult(winnerNumber, lottoTicketsFinal);

        //then
        Assertions.assertThat(lottoResult.getResult().get(Rank.BONUS)).isEqualTo(1);
    }
}