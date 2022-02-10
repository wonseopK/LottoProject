package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.LottoService;
import lotto.domain.lottoTicket.LottoTicket;
import lotto.view.OutputView;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class LottoResultGeneratorTest {
//    @DisplayName("당첨번호와 구입한 티켓을 비교해서 맞춘 갯수를 바환하는 기능 테스트")
//    @Test
//    void name() {
//        //given
//        int winNumber = 2;
//        List<Integer> lottoNumbers = new ArrayList<>();
//        lottoNumbers.add(1);
//        lottoNumbers.add(2);
//        lottoNumbers.add(3);
//        lottoNumbers.add(4);
//        lottoNumbers.add(5);
//        lottoNumbers.add(6);
//        LottoTicket lottoTicket = new LottoTicket(lottoNumbers);
//
//        //when
//        int resultCount = LottoResultGenerator.countWinNumber(winNumber, lottoTicket);//when
//        OutputView.println("맞춘갯수" + LottoResultGenerator.countWinNumber(winNumber, lottoTicket));
//
//
//        //then
//        Assertions.assertThat(resultCount).isEqualTo(1);
//    }
    @DisplayName("보너스번호와 구입한 티켓을 비교해서 맞춘 갯수를 바환하는 기능 테스트")
    @Test
    void name() {
        //given
        BonusNumber bonusNumber = new BonusNumber(3);
        List<Integer> lottoNumbers = new ArrayList<>();
        lottoNumbers.add(1);
        lottoNumbers.add(2);
        lottoNumbers.add(3);
        lottoNumbers.add(4);
        lottoNumbers.add(5);
        lottoNumbers.add(6);
        LottoTicket lottoTicket = new LottoTicket(lottoNumbers);

        //when
        int resultCount = LottoResultGenerator.countBonusNumber(bonusNumber, lottoTicket);//when
        OutputView.println("맞춘갯수" + LottoResultGenerator.countBonusNumber(bonusNumber, lottoTicket));


        //then
        Assertions.assertThat(resultCount).isEqualTo(1);
    }
}