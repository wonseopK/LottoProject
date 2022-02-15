package lotto.domain.lottoTicket.lottoMachine;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.money.Money;
import lotto.view.InputView;
import java.util.List;

import static lotto.view.OutputView.printAskManualLottoNumbers;

public class ManualLottoMahcine implements LottoMachine {
    private final long count;

    public ManualLottoMahcine(long count) {
        this.count = count;
    }

    @Override
    public List<LottoTicket> buyTickets(Money money) {
        money.useMoneyToBuyOneTicket(count);
        printAskManualLottoNumbers();
        return InputView.makeManualLottoTicket(count);
    }

}
