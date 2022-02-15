package lotto.domain.lottoTicket;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LottoTickets {
    private List<LottoTicket> lottoTickets;

    public LottoTickets(List<LottoTicket> lottoTickets) {
        this.lottoTickets = lottoTickets;
    }

    public List<LottoTicket> getLottoTickets() {
        return lottoTickets;
    }

    public static List<LottoTicket> lottoTicketsJoiner(List<LottoTicket> tickets1, List<LottoTicket> tickets2){
        List<LottoTicket> joineTickets = Stream.concat(tickets1.stream(), tickets2.stream()).collect(Collectors.toList());;
        return joineTickets;
    }
}
