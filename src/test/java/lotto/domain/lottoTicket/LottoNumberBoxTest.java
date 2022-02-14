package lotto.domain.lottoTicket;

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
}