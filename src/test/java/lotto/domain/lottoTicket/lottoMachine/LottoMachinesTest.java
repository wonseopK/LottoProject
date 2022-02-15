package lotto.domain.lottoTicket.lottoMachine;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.money.Money;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LottoMachinesTest {
    @DisplayName("자동출력 머신 사용시 티켓 출력갯수 검사")
    @Test
    void name() {
        Money money = Money.create(3000);
        List<LottoMachine> lottoMachinesContainer = new ArrayList<>();
        lottoMachinesContainer.add(new RandomLottoMachine());

        LottoMachines lottoMachines = new LottoMachines(lottoMachinesContainer);
        List<LottoTicket> lottoTickets = lottoMachines.makeTickets(money);

        Assertions.assertThat(lottoTickets.size()).isEqualTo(3);

    }

    @DisplayName("로또머신 생성시 매개변수에 생성된 머신들이 없을때 생성자 생성이 불가능하도록 검사하는 기능 테스트")
    @Test
    void name2() {
        List<LottoMachine> lottoMachineContainer = new ArrayList<>();

        Assertions.assertThatThrownBy(()->new LottoMachines(lottoMachineContainer))
                .isInstanceOf(IllegalArgumentException.class);
    }
}