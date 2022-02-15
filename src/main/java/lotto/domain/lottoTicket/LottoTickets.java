package lotto.domain.lottoTicket;

import java.util.List;

public class LottoTickets {
    private List<LottoTicket> lottoTickets;

    public LottoTickets(List<LottoTicket> lottoTickets) {
        this.lottoTickets = lottoTickets;
    }

    public List<LottoTicket> getLottoTickets() {
        return lottoTickets;
    }

    public static List<LottoTicket> lottoTicketsJoiner(List<LottoTicket> tickets1, List<LottoTicket> tickets2){
        return null;
    }
}
