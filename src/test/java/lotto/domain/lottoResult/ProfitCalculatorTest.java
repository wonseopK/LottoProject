package lotto.domain.lottoResult;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProfitCalculatorTest {
    @Test
    void name() {
        //given
        long spendMoney = 15000;
        Map<Integer, Integer> lotto = new HashMap<>();
        lotto.put(3,1);
        lotto.put(4,0);
        lotto.put(5,0);
        lotto.put(6,0);
        lotto.put(7,0);
        LottoResult lottoResult = new LottoResult(lotto);

        //when
        String calculateProfit = ProfitCalculator.calculateProfit(spendMoney, lottoResult);

        //then
        Assertions.assertThat(calculateProfit).isEqualTo("0.33");
    }
}