package lotto.domain.lottoTicket.lottoMachine;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.money.Money;

import java.util.List;

public interface LottoMachine {
    List<LottoTicket> buyTickets();
}
