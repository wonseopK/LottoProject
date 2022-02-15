package lotto.domain.money;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    @DisplayName("티켓을 3번 구입하면 구입한 만큼 금액이 주는지 확인하는 테스트")
    @Test
    void name() {
        int inputMoney = 3000;

        Money money = Money.create(inputMoney);

        money.useMoneyToBuyOneTicket(inputMoney / Money.TICKET_PRICE);

        Assertions.assertThat(money.getMoney()).isEqualTo(0);

    }

}