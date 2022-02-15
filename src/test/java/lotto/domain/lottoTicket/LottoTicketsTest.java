package lotto.domain.lottoTicket;

import lotto.domain.lottoTicket.lottoNumber.LottoNumber;
import lotto.domain.lottoTicket.lottoNumber.LottoNumberBox;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LottoTicketsTest {
    @DisplayName("로토 티켓들을 합쳐주는기능 테스트")
    @Test
    void name () {
        List<LottoNumber> lottoNumbers1 = Arrays.asList(
                LottoNumberBox.getLottoNumber(1),
                LottoNumberBox.getLottoNumber(2),
                LottoNumberBox.getLottoNumber(3),
                LottoNumberBox.getLottoNumber(4),
                LottoNumberBox.getLottoNumber(5),
                LottoNumberBox.getLottoNumber(6)
        );

        List<LottoNumber> lottoNumbers2 = Arrays.asList(
                LottoNumberBox.getLottoNumber(11),
                LottoNumberBox.getLottoNumber(12),
                LottoNumberBox.getLottoNumber(13),
                LottoNumberBox.getLottoNumber(14),
                LottoNumberBox.getLottoNumber(15),
                LottoNumberBox.getLottoNumber(16)
        );

        LottoTicket lottoTicket1 = new LottoTicket(lottoNumbers1);
        LottoTicket lottoTicket2 = new LottoTicket(lottoNumbers2);

        List<LottoTicket> lottoTickets1 = new ArrayList<>();
        lottoTickets1.add(lottoTicket1);
        List<LottoTicket> lottoTickets2 = new ArrayList<>();
        lottoTickets2.add(lottoTicket2);

        List<LottoTicket> joinedLottoTickets = LottoTickets.lottoTicketsJoiner(lottoTickets1, lottoTickets2);

        Assertions.assertThat(joinedLottoTickets.size()).isEqualTo(12);
    }



}