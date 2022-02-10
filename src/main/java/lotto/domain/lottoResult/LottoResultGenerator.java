package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.LottoTicket;

public class LottoResultGenerator {
    public static int countWinNumber(WinnerNumber winNumber, LottoTicket lottoTicket) {
        return (int) lottoTicket.getLottoNumbers().stream().filter(number -> number == winNumber.getWinnerNumbers().get(0)).count();
    }

    public static int countBonusNumber(BonusNumber bonusNumber, LottoTicket lottoTicket) {
        return (int) lottoTicket.getLottoNumbers().stream().filter(number -> number == bonusNumber.getBonusNumber()).count();
    }
}
