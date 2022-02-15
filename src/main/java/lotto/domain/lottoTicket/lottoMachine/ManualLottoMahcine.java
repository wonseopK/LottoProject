package lotto.domain.lottoTicket.lottoMachine;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.money.Money;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;


public class ManualLottoMahcine implements LottoMachine {
    public static final int MIN_COUNT = 1;

    private long count;

    public void getManualCount(int inputManualCount) {
        this.count = inputManualCount;
    }

    @Override
    public List<LottoTicket> buyTickets(Money money) {
        List<LottoTicket> lottoTickets = new ArrayList<>();
        getManualCount(InputView.getManualTicketCount(money));
        if (count >= MIN_COUNT) {
            money.useMoneyToBuyOneTicket(count);
            lottoTickets = InputView.inputManualLottoTicket(count);
        }
        OutputView.printManulAndAutoOrderCount(money, count);
        return lottoTickets;
    }

}
