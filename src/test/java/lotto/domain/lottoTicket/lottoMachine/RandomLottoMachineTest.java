package lotto.domain.lottoTicket.lottoMachine;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.domain.money.Money;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class RandomLottoMachineTest {
    @DisplayName("구입한 갯수만큼 로또 티캣을 반환하는지 테스트")
    @Test
    void name() {
        int inputMoney = 3000;
        Money money = Money.create(inputMoney);

        List<LottoTicket> lottoTickets1 = new RandomLottoMachine().buyTickets(money);

        LottoTickets lottoTickets = new LottoTickets(lottoTickets1);

        Assertions.assertThat(lottoTickets.getLottoTickets().size()).isEqualTo(inputMoney / Money.TICKET_PRICE);
    }
}