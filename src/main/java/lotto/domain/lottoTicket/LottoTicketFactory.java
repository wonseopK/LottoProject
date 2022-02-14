package lotto.domain.lottoTicket;

import lotto.domain.lottoTicket.lottoNumber.LottoNumberBox;

import java.util.*;

public class LottoTicketFactory {
    public static LottoTickets giveOrderTickets(OrderTicketCount orderTicketCount) {
        List<LottoTicket> lottoTickets = new ArrayList<>();
        for (int i = 0; i < orderTicketCount.getTotalTicketCount(); i++) {
            LottoTicket lottoTicket = new LottoTicket(LottoNumberBox.getSixRandomLottoNumbers());
            lottoTickets.add(lottoTicket);
        }
        return new LottoTickets(lottoTickets);
    }
}
