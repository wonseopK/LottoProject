package lotto.controller;

import lotto.domain.lottoResult.LottoResult;
import lotto.domain.lottoResult.LottoResultFactory;
import lotto.domain.lottoResult.WinnerNumber;
import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.domain.lottoTicket.lottoMachine.LottoMachine;
import lotto.domain.lottoTicket.lottoMachine.ManualLottoMahcine;
import lotto.domain.lottoTicket.lottoMachine.RandomLottoMachine;
import lotto.domain.money.Money;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.List;

public class LottoController {
    private final Money spendMoney;
    private final int manualTicketCount;

    public LottoController(Money spendMoney, int manualTicketCount) {
        this.spendMoney = spendMoney;
        this.manualTicketCount = manualTicketCount;
    }

    public void run() {
        LottoTickets lottoTickets = makeTickets();

        WinnerNumber winnerNumber = InputView.inputWinnerNumber();
        LottoResult lottoResult = LottoResultFactory.getLottoResult(winnerNumber, lottoTickets);

        OutputView.printLottoResult(lottoResult, spendMoney);
    }

    private LottoTickets makeTickets() {
        LottoTickets lottoTickets = useMachinesToMakeTickets();
        OutputView.printOrderType(spendMoney, manualTicketCount);
        OutputView.printOrderTickets(lottoTickets);
        return lottoTickets;
    }

    private LottoTickets useMachinesToMakeTickets(){
        LottoMachine manualMachine = new ManualLottoMahcine(manualTicketCount);
        LottoMachine randomMahcine = new RandomLottoMachine();

        List<LottoTicket> manualLottoTickets = manualMachine.buyTickets(spendMoney);
        List<LottoTicket> autoLottoTickets = randomMahcine.buyTickets(spendMoney);

        List<LottoTicket> joinLottoTickets = LottoTickets.lottoTicketsJoiner(manualLottoTickets, autoLottoTickets);
        return new LottoTickets(joinLottoTickets);
    }



}
