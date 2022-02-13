package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTicketFactory;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.domain.utils.WinnerNumberHandler;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LottoResultFactoryTest {
//    @DisplayName("등수가 조건에 맞게 출력되는기능 테스트")
//    @Test
//    void name() {
//        //given
//        List<Integer> lottoNumbers = Arrays.asList(1,2,3,4,5,6);
//        LottoTicket lottoTicket = new LottoTicket(lottoNumbers);
//        List<LottoTicket> lottoTickets = new ArrayList<>();
//        lottoTickets.add(lottoTicket);
//        LottoTickets lottoTickets2 = new LottoTickets(lottoTickets);
//
//        String winnerNumbers = "1,2,3,4,5,6";
//        BonusNumber bonusNumber = new BonusNumber(14);
//
//        WinnerNumber winnerNumber = WinnerNumberHandler.winnerNumberSaver(winnerNumbers, bonusNumber);
//
//        //when
//        LottoResult lottoResult = LottoResultFactory.getLottoResult(winnerNumber, lottoTickets2);
//
//        //tehn
//        Assertions.assertThat(lottoResult.getResult().get(Rank.FIRST)).isEqualTo(1);
//    }

}