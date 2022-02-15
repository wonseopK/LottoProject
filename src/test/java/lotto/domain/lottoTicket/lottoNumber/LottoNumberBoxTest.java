package lotto.domain.lottoTicket.lottoNumber;

import lotto.domain.lottoTicket.lottoNumber.LottoNumber;
import lotto.domain.lottoTicket.lottoNumber.LottoNumberBox;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LottoNumberBoxTest {
    @DisplayName("로또박스에서 로또 볼을 정상적으로 가져오는지 검사")
    @Test
    void name(){
        LottoNumber lottoNumber = LottoNumberBox.getLottoNumber(3);

        Assertions.assertThat(lottoNumber.getNumber()).isEqualTo(3);
    }
    @DisplayName("1~45자리의 숫자만 요청할수 있도록 검사해주는 테스트")
    @Test
    void name2() {
        int input1 = 46;
        int input2 = 0;

        Assertions.assertThatThrownBy(()-> LottoNumberBox.getLottoNumber(input1))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("1~45사이의 숫자만 꺼내올수있습니다.");
        Assertions.assertThatThrownBy(()->LottoNumberBox.getLottoNumber(input2))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("1~45사이의 숫자만 꺼내올수있습니다.");
    }
}