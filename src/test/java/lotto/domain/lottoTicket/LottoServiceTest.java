package lotto.domain.lottoTicket;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class LottoServiceTest {
    @DisplayName("6자리 로또 번호 생성 기능")
    @Test
    void name() {
        LottoTicket lottoTicket = LottoService.createLottoTicket();
        long numberSize = lottoTicket.getLottoNumbers().size();
        long distinctedNumberSize = lottoTicket.getLottoNumbers().stream().distinct().count();
        boolean isDuplicated = distinctedNumberSize != numberSize;

        Assertions.assertThat(isDuplicated).isEqualTo(false);
        Assertions.assertThat(numberSize).isEqualTo(6);
        System.out.println(lottoTicket.toString());

    }

    @DisplayName("로또번호 1~45 범위 검사 기능")
    @RepeatedTest(30)
    void name2() {
        LottoTicket lottoTicket = LottoService.createLottoTicket();
        System.out.println(lottoTicket.getLottoNumbers().toString());
        for (Integer number : lottoTicket.getLottoNumbers()) {
            Assertions.assertThat(number).isBetween(1, 45);
        }
    }
}