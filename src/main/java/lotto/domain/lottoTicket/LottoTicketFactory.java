package lotto.domain.lottoTicket;

import java.util.*;

public class LottoTicketFactory {
    public static LottoTickets giveOrderTickets(int orderTicketCount) {
        List<LottoTicket> lottoTickets = new ArrayList<>();
        for (int i = 0; i < orderTicketCount; i++) {
            LottoTicket lottoTicket = new LottoTicket(LottoNumberBox.getSixRandomLottoNumbers());
            lottoTickets.add(lottoTicket);
        }
        return new LottoTickets(lottoTickets);
    }
}
