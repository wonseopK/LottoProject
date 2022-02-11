package lotto.domain.lottoTicket;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class LottoNumberTest {
    @DisplayName("1~45사이의 숫자가 발생하는지 검사")
    @RepeatedTest(1000)
    void name() {
        Assertions.assertThat(LottoNumber.nextInt(1,45)).isBetween(1,45);
    }

}