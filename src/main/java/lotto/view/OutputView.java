package lotto.view;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;

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

}
