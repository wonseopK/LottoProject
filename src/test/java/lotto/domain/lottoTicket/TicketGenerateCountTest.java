package lotto.domain.lottoTicket;

import lotto.view.OutputView;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketGenerateCountTest {
    @DisplayName("구매한 금액을 티켓 갯수로 변환해주는 테스트")
    @Test
    void name() {
        //given
        long money = 123455;
        //when
        TicketGenerateCount count = TicketGenerateCount.create(money);
        OutputView.println("횟수 : " + count.getCount());

        //then
        Assertions.assertThat(count.getCount()).isEqualTo(123);
    }
}