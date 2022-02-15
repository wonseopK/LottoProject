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
        Money money = Money.create(3000);

        List<LottoTicket> lottoTickets1 = new RandomLottoMachine(money).buyTickets();

        LottoTickets lottoTickets = new LottoTickets(lottoTickets1);

        Assertions.assertThat(lottoTickets.getLottoTickets().size()).isEqualTo(3);
    }
}