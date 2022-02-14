package lotto.domain.lottoTicket;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketOrderTypeTest {
    @DisplayName("수동주문수가 총주문수를 초과하는 경우 예외발생")
    @Test
    void name() {
        int totalOrder = 10;
        int manualOrder = 13;

        Assertions.assertThatThrownBy(()->TicketOrderType.of(totalOrder, manualOrder))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("총구입 개수 보다 작은 값을 입력해주세요.");
    }
}