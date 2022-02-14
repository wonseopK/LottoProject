package lotto.domain.lottoTicket.lottoMachine;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.OrderTicketCount;
import lotto.domain.lottoTicket.lottoNumber.LottoNumberBox;
import lotto.domain.money.Money;

import java.util.*;

public class RandomLottoMachine implements LottoMachine{
    public static List<LottoTicket> buyTicket(OrderTicketCount orderTicketCount) {
        List<LottoTicket> lottoTickets = new ArrayList<>();
        for (int i = 0; i < orderTicketCount.getTotalTicketCount(); i++) {
            LottoTicket lottoTicket = new LottoTicket(LottoNumberBox.getSixRandomLottoNumbers());
            lottoTickets.add(lottoTicket);
        }
        return lottoTickets;
    }

    @Override
    public List<LottoTicket> buyTickets(Money money) {
        List<LottoTicket> lottoTickets = new ArrayList<>();
        for (int i = 0; i < money.getTicketCount(); i++) {
            LottoTicket lottoTicket = new LottoTicket(LottoNumberBox.getSixRandomLottoNumbers());
            lottoTickets.add(lottoTicket);
        }
        return lottoTickets;
    }
}
