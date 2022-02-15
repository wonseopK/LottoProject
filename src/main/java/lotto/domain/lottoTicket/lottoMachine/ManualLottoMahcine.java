package lotto.domain.lottoTicket.lottoMachine;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.money.Money;
import lotto.view.InputView;

import java.util.List;


public class ManualLottoMahcine implements LottoMachine {
    private final long count;
    private final Money spendMoney;

    public ManualLottoMahcine(long count, Money money) {
        this.count = count;
        this.spendMoney = money;
    }

    @Override
    public List<LottoTicket> buyTickets() {
        spendMoney.useMoneyToBuyOneTicket(count);
        return InputView.makeManualLottoTicket(count);
    }

}
