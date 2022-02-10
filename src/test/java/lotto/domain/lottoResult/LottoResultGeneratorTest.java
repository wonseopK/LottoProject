package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.domain.utils.WinnerNumberHandler;
import lotto.view.OutputView;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class LottoResultGeneratorTest {
    @DisplayName("당첨번호와 구입한 티켓을 비교해서 맞춘 갯수를 바환하는 기능 테스트")
    @Test
    void name() {
        //given
        int winNumber = 2;
        List<Integer> lottoNumbers = new ArrayList<>();
        lottoNumbers.add(1);
        lottoNumbers.add(2);
        lottoNumbers.add(3);
        lottoNumbers.add(4);
        lottoNumbers.add(5);
        lottoNumbers.add(6);
        LottoTicket lottoTicket = new LottoTicket(lottoNumbers);

        //when
        int result = LottoResultGenerator.checkIsWinNumber(winNumber, lottoTicket);//when
        OutputView.println("결과" + LottoResultGenerator.checkIsWinNumber(winNumber, lottoTicket));


        //then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @DisplayName("보너스번호와 구입한 티켓을 비교해서 맞춘 갯수를 바환하는 기능 테스트")
    @Test
    void name2() {
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
        boolean resultCount = LottoResultGenerator.checkIsBonusNumber(bonusNumber, lottoTicket);//when
        OutputView.println("맞추었는지" + LottoResultGenerator.checkIsBonusNumber(bonusNumber, lottoTicket));


        //then
        Assertions.assertThat(resultCount).isEqualTo(1);
    }

    @DisplayName("로또번호가 몇개 일치하는지 갯수를 반환해주는 기능 테스트")
    @Test
    void name3() {
        //given
        String winnerNumbers = "1,2,3,4,5,6";
        BonusNumber bonusNumber = new BonusNumber(8);
        WinnerNumber winnerNumber = WinnerNumberHandler.winnerNumberSaver(winnerNumbers,bonusNumber);
        List<Integer> lottoNumbers = Arrays.asList(1, 3, 6, 7, 9, 10);
        LottoTicket lottoTicket = new LottoTicket(lottoNumbers);

        //when
        int result = LottoResultGenerator.countWinNumber(winnerNumber, lottoTicket);
        OutputView.println("일치갯수" + LottoResultGenerator.countWinNumber(winnerNumber, lottoTicket));
        //then
        Assertions.assertThat(result).isEqualTo(3);

    }

    @DisplayName("로또번호 맞춘 갯수별로 정리해주는 기능 테스트")
    @Test
    void name4() {
        //given
        List<Integer> lottoNumbers = Arrays.asList(1,2,3,4,5,6);
        LottoTicket lottoTicket = new LottoTicket(lottoNumbers);
        BonusNumber bonusNumber = new BonusNumber(5);

        String winnerNumbers = "1,2,3,4,6,7";
        WinnerNumber winnerNumber = WinnerNumberHandler.winnerNumberSaver(winnerNumbers,bonusNumber);


        List<LottoTicket> lottoTicketsList = new ArrayList<>();
        lottoTicketsList.add(lottoTicket);
        LottoTickets lottoTickets = new LottoTickets(lottoTicketsList);

        //when
        LottoResult lottoResult = LottoResultGenerator.createLottoResult(winnerNumber,lottoTickets);

        //then
        Assertions.assertThat(lottoResult.getResult().get(7)).isEqualTo(1);

    }
}