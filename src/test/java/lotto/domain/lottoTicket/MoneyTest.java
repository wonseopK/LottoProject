package lotto.domain.lottoTicket;

import lotto.domain.money.Money;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class MoneyTest {
    @DisplayName("인스턴스 생성시 유효성 검사가 잘되는지 테스트")
    @Test
    void createMoney() {
        Assertions.assertThatThrownBy(() -> Money.create(-1)).isInstanceOf(IllegalArgumentException.class);
    }

}