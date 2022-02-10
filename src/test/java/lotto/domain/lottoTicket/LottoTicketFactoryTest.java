package lotto.domain.lottoTicket;

import lotto.view.OutputView;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class LottoTicketFactoryTest {
    @DisplayName("6자리 로또 번호 생성 기능")
    @Test
    void name() {
        LottoTickets lottoTickets = LottoTicketFactory.giveOrderedTicket(5);
        long numberSize = lottoTickets.getLottoTickets().get(0).getLottoNumbers().size();
        long distinctedNumberSize = lottoTickets.getLottoTickets().get(0).getLottoNumbers().stream().distinct().count();
        boolean isDuplicated = distinctedNumberSize != numberSize;

        Assertions.assertThat(isDuplicated).isEqualTo(false);
        Assertions.assertThat(numberSize).isEqualTo(6);
        OutputView.printOrderedTickets(lottoTickets);

    }

    @DisplayName("로또번호 1~45 범위 검사 기능")
    @RepeatedTest(30)
    void name2() {
        LottoTickets lottoTickets = LottoTicketFactory.giveOrderedTicket(1);
        for (Integer number : lottoTickets.getLottoTickets().get(0).getLottoNumbers()) {
            Assertions.assertThat(number).isBetween(1, 45);
        }
    }
}