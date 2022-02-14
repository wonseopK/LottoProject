package lotto.controller;

import lotto.domain.lottoResult.*;
import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.lottoMachine.RandomLottoMachine;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.domain.money.Money;
import lotto.domain.lottoTicket.OrderTicketCount;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.List;

public class WebUILottoApplication {
    public WebUILottoApplication() {
    }

    public static void main(String[] args) {
        // TODO: 2022/02/08 todo 진행
        Money spendMoney = InputView.inputMoney();
        OrderTicketCount ticketGenerateCount = OrderTicketCount.create(spendMoney);
        List<LottoTicket> lottoTickets1 = RandomLottoMachine.buyTicket(ticketGenerateCount);
        LottoTickets lottoTickets = new LottoTickets(lottoTickets1);
        OutputView.printOrderTickets(lottoTickets);

        WinnerNumber winnerNumber = InputView.inputWinnerNumber();
        LottoResult lottoResult = LottoResultFactory.getLottoResult(winnerNumber, lottoTickets);

        OutputView.printLottoResult(lottoResult, spendMoney);
    }
}
