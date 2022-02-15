package lotto.controller;

import lotto.domain.lottoResult.LottoResult;
import lotto.domain.lottoResult.LottoResultFactory;
import lotto.domain.lottoResult.WinnerNumber;
import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.domain.lottoTicket.lottoMachine.LottoMachine;
import lotto.domain.lottoTicket.lottoMachine.LottoMachines;
import lotto.domain.lottoTicket.lottoMachine.ManualLottoMahcine;
import lotto.domain.lottoTicket.lottoMachine.RandomLottoMachine;
import lotto.domain.money.Money;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {
    private final Money spendMoney;


    public LottoController(Money spendMoney) {
        this.spendMoney = spendMoney;
    }

    public void run() {
        LottoTickets lottoTickets = makeTickets();

        WinnerNumber winnerNumber = InputView.inputWinnerNumber();
        LottoResult lottoResult = LottoResultFactory.getLottoResult(winnerNumber, lottoTickets);

        OutputView.printLottoResult(lottoResult, spendMoney);
    }

    private LottoTickets makeTickets() {
        LottoTickets lottoTickets = useMachinesToMakeTickets();
        OutputView.printOrderTickets(lottoTickets);
        return lottoTickets;
    }

    private LottoTickets useMachinesToMakeTickets() {
        List<LottoMachine> lottoMachinesContatiner = new ArrayList<>();
        lottoMachinesContatiner.add(new ManualLottoMahcine());
        lottoMachinesContatiner.add(new RandomLottoMachine());

        LottoMachines lottoMachines = new LottoMachines(lottoMachinesContatiner);
        List<LottoTicket> lottoTickets = lottoMachines.makeTickets(spendMoney);
        return new LottoTickets(lottoTickets);
    }

}
