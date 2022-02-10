package lotto.domain.lottoResult;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfitCalculatorTest {
    @DisplayName("수익률 계산 테스트")
    @Test
    void name() {
        int spendMoney = 5000;
        int earnMoney = 10000;

        String result = ProfitCalculator.calculateProfit(spendMoney, earnMoney);

        Assertions.assertThat(result).isEqualTo("200");
    }
}