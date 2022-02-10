package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;

import java.util.HashMap;
import java.util.Map;

public class LottoResultGenerator {



    public static LottoResult createLottoResult(WinnerNumber winnerNumber, LottoTickets lottoTickets){
        Map<Integer, Integer> lottoResult = new HashMap<>();
        for(int i = 1; i <8; i++){
            lottoResult.put(i,0);
        }

        return new LottoResult(lottoResult);

    }

    public static int countWinNumber(WinnerNumber winnerNumbers, LottoTicket lottoTicket) {
        int countWinNumber = 0;
        for (Integer winnerNumber : winnerNumbers.getWinnerNumbers()) {
            countWinNumber += checkIsWinNumber(winnerNumber, lottoTicket);
        }
        return countWinNumber;
    }

    public static int checkIsWinNumber(int winNumber, LottoTicket lottoTicket) {
        return (int) lottoTicket.getLottoNumbers().stream().filter(number -> number == winNumber).count();
    }

    public static int checkIsBonusNumber(BonusNumber bonusNumber, LottoTicket lottoTicket) {
        return (int) lottoTicket.getLottoNumbers().stream().filter(number -> number == bonusNumber.getBonusNumber()).count();
    }

}
