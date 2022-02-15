package lotto.domain.money;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyValidatorTest {
    @DisplayName("로또티캣 최소 금액 이상인지 검사")
    @Test
    void name() {
        long inputMoney = 999;

        Assertions.assertThatThrownBy(()->MoneyValidator.validateMoney(inputMoney))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(MoneyValidator.NOT_ENOUGH_PRICE);
    }
}