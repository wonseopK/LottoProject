package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.LottoTicket;

public class LottoResultGenerator {
    public static int countWinNumber(int winNumber, LottoTicket lottoTicket) {
        return (int) lottoTicket.getLottoNumbers().stream().filter(number -> number == winNumber).count();
    }
}
