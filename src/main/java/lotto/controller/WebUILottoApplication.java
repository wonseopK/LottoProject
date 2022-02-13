package lotto.controller;

import lotto.domain.lottoResult.*;
import lotto.domain.lottoTicket.LottoTicketFactory;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.domain.lottoTicket.Money;
import lotto.domain.lottoTicket.OrderTicketCount;
import lotto.view.InputView;
import lotto.view.OutputView;

public class WebUILottoApplication {
    public WebUILottoApplication() {
    }

    public static void main(String[] args) {
        // TODO: 2022/02/08 todo 진행
        Money spendMoney = InputView.inputMoney();
        OrderTicketCount ticketGenerateCount = OrderTicketCount.create(spendMoney);
        LottoTickets lottoTickets = LottoTicketFactory.giveOrderTickets(ticketGenerateCount.getCount());
        OutputView.printOrderTickets(lottoTickets);

        WinnerNumber winnerNumber = InputView.inputWinnerNumber();
        LottoResult lottoResult = LottoResultFactory.getLottoResult(winnerNumber, lottoTickets);

        OutputView.printLottoResult(lottoResult, spendMoney);
    }
}
