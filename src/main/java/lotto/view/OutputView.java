package lotto.view;

import lotto.domain.lottoResult.LottoResult;
import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.domain.money.Money;

public class OutputView {
    private OutputView() {
    }

    public static void println(final String msg) {
        System.out.println(msg);
    }

    public static void printOrderTickets(LottoTickets lottoTickets) {
        for (LottoTicket lottoTicket : lottoTickets.getLottoTickets()) {
            OutputView.println(lottoTicket.toString());
        }
    }

    public static void printLottoResult(LottoResult lottoResult, Money spendMoney) {
        System.out.println("당첨 통계\n" +
                "---------\n" +
                lottoResult.toString() + "\n" +
                lottoResult.calculateProfit(spendMoney));

    }
}
