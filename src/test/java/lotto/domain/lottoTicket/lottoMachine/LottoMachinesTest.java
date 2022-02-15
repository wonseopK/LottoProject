package lotto.domain.lottoTicket.lottoMachine;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.money.Money;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LottoMachinesTest {
    @DisplayName("자동출력 머신 사용시 티켓 출력갯수 검사")
    @Test
    void name() {
        Money money = Money.create(3000);
        LottoMachines lottoMachines = new LottoMachines();
        lottoMachines.addLottoMachine(new RandomLottoMachine());
        List<LottoTicket> lottoTickets = lottoMachines.makeTickets(money);

        Assertions.assertThat(lottoTickets.size()).isEqualTo(3);


    }
}