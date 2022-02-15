package lotto.controller;

import lotto.domain.lottoResult.*;
import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.lottoMachine.LottoMachine;
import lotto.domain.lottoTicket.lottoMachine.ManualLottoMahcine;
import lotto.domain.lottoTicket.lottoMachine.RandomLottoMachine;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.domain.money.Money;
import lotto.domain.lottoTicket.OrderTicketCount;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.List;

public class WebUILottoApplication {


    public static void main(String[] args) {
        // TODO: 2022/02/08 todo 진행
        Money spendMoney = InputView.inputMoney();

        int manualTicketCount = InputView.getManualTicketCount(spendMoney);

        LottoMachine manualMachine = new ManualLottoMahcine(manualTicketCount);
        LottoMachine randomMahcine = new RandomLottoMachine();

        List<LottoTicket> manualLottoTickets = manualMachine.buyTickets(spendMoney);
        List<LottoTicket> autoLottoTickets = randomMahcine.buyTickets(spendMoney);

        LottoTickets lottoTickets1 = new LottoTickets(manualLottoTickets);
        LottoTickets lottoTickets2 = new LottoTickets(autoLottoTickets);

        OutputView.printOrderType(spendMoney,manualTicketCount);
        OutputView.printOrderTickets(lottoTickets1);
        OutputView.printOrderTickets(lottoTickets2);

        WinnerNumber winnerNumber = InputView.inputWinnerNumber();
        LottoResult lottoResult = LottoResultFactory.getLottoResult(winnerNumber, lottoTickets1);

        OutputView.printLottoResult(lottoResult, spendMoney);
    }
}
