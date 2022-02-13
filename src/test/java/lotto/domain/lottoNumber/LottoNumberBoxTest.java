package lotto.domain.lottoNumber;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LottoNumberBoxTest {
    @DisplayName("1~45자리의 숫자만 요청할수 있도록 검사해주는 테스트")
    @Test
    void name() {
        int input1 = 46;
        int input2 = 0;

        Assertions.assertThatThrownBy(()->LottoNumberBox.getLottoNumber(input1))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("1~45사이의 숫자만 꺼내올수있습니다.");
        Assertions.assertThatThrownBy(()->LottoNumberBox.getLottoNumber(input2))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("1~45사이의 숫자만 꺼내올수있습니다.");
    }

}