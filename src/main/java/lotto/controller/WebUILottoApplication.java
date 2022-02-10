package lotto.controller;

import lotto.domain.lottoResult.BonusNumber;
import lotto.domain.lottoResult.LottoResult;
import lotto.domain.lottoResult.LottoResultGenerator;
import lotto.domain.lottoResult.WinnerNumber;
import lotto.domain.lottoTicket.LottoTicketFactory;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.domain.lottoTicket.TicketGenerateCount;
import lotto.view.InputView;
import lotto.view.OutputView;

public class WebUILottoApplication {
    public static void main(String[] args) {
        // TODO: 2022/02/08 todo 진행
        TicketGenerateCount ticketGenerateCount = InputView.inputMoney();
        LottoTickets lottoTickets = LottoTicketFactory.giveOrderedTicket(ticketGenerateCount.getCount());
        OutputView.printOrderedTickets(lottoTickets);

        WinnerNumber winnerNumber = InputView.inputWinnerNumber();
        BonusNumber inputBonusNumber = InputView.inputBonusNumber();
        winnerNumber.setBonusNumber(inputBonusNumber);

        LottoResult lottoResult = LottoResultGenerator.createLottoResult(winnerNumber, lottoTickets);
        OutputView.printLottoResult(lottoResult);
    }
}
