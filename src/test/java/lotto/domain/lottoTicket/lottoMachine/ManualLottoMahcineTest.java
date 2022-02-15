package lotto.domain.lottoTicket.lottoMachine;

import lotto.domain.money.Money;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManualLottoMahcineTest {
    @DisplayName("티캣을 구입한만큼 금액이 줄어드는지 테스트")
    @Test
    void name() {
        Money money = Money.create(13000);
        LottoMachine manualLottoMahcine = new ManualLottoMahcine(3);

        manualLottoMahcine.buyTickets(money);

        Assertions.assertThat(money.getMoney()).isEqualTo(10000);
    }

}