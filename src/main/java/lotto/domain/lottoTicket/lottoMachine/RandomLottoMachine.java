package lotto.domain.lottoTicket.lottoMachine;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.lottoNumber.LottoNumberBox;
import lotto.domain.money.Money;

import java.util.*;

public class RandomLottoMachine implements LottoMachine {
    private Money spendMoney;

    public RandomLottoMachine(Money money) {
        this.spendMoney = money;
    }

    @Override
    public List<LottoTicket> buyTickets() {
        List<LottoTicket> lottoTickets = new ArrayList<>();
        for (int i = 0; i < spendMoney.getTicketCount(); i++) {
            LottoTicket lottoTicket = new LottoTicket(LottoNumberBox.getSixRandomLottoNumbers());
            lottoTickets.add(lottoTicket);
        }
        return lottoTickets;
    }
}
