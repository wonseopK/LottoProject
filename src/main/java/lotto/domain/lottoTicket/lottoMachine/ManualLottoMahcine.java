package lotto.domain.lottoTicket.lottoMachine;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.money.Money;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;


public class ManualLottoMahcine implements LottoMachine {
    private long count;

    public void getManualCount(int inputManualCount) {
        this.count = inputManualCount;
    }

    @Override
    public List<LottoTicket> buyTickets(Money money) {
        List<LottoTicket> lottoTickets = new ArrayList<>();
        getManualCount(InputView.getManualTicketCount(money));
        if (count > 0) {
            money.useMoneyToBuyOneTicket(count);
            lottoTickets = InputView.inputManualLottoTicket(count);
        }
        OutputView.printManulAndAutoOrderCount(money, count);
        return lottoTickets;
    }

}
