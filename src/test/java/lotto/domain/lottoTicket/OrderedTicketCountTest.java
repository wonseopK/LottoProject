package lotto.domain.lottoTicket;

import lotto.domain.money.Money;
import lotto.view.OutputView;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class OrderedTicketCountTest {
    @DisplayName("구매한 금액을 티켓 갯수로 변환해주는 테스트")
    @Test
    void name() {
        //given
        Money money = Money.create(123456);
        //when
        OrderTicketCount count = OrderTicketCount.create(money);
        OutputView.println("횟수 : " + count.getCount());

        //then
        Assertions.assertThat(count.getCount()).isEqualTo(123);
    }
}