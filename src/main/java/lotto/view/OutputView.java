package lotto.view;

import lotto.domain.lottoResult.LottoResult;
import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.domain.lottoTicket.Money;

public class OutputView {
    private OutputView() {
    }

    public static void println(final String msg) {
        System.out.println(msg);
    }

    public static void printOrderedTickets(LottoTickets lottoTickets) {
        for (LottoTicket lottoTicket : lottoTickets.getLottoTickets()) {
            OutputView.println(lottoTicket.toString());
        }
    }

    public static void printLottoResult(LottoResult lottoResult, Money spendMoney) {
        System.out.println("당첨 통계\n" +
                "---------\n" +
                lottoResult.toString());
        lottoResult.calculateProfit(spendMoney);
    }
}
