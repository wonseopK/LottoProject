package lotto.domain.lottoTicket;

import lotto.domain.lottoTicket.lottoNumber.LottoNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LottoNumberTest {
    @DisplayName("1~45 사이 숫자를 검증하는 기능 테스트")
    @Test
    void name() {
        int inputNumber = 46;
        int inputNumber2 = 0;

        new LottoNumber(1);
        new LottoNumber(45);
        Assertions.assertThatThrownBy(()->new LottoNumber(inputNumber))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("로또번호는 1~45자리 숫자여야합니다.");
        Assertions.assertThatThrownBy(()->new LottoNumber(inputNumber2))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("로또번호는 1~45자리 숫자여야합니다.");
    }

}