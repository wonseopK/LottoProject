package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.LottoTicket;

public class LottoResultGenerator {
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
