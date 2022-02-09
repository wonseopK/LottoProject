package lotto.domain.lottoTicket;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LottoService {

    private static LottoTicket createLottoTicket() {
        List<Integer> lottoNumbers = new Random()
                .ints(1, 45)
                .distinct()
                .limit(6)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        return new LottoTicket(lottoNumbers);
    }

    public static LottoTickets giveOrderedTicket(int ticketGenerateCount) {
        List<LottoTicket> lottoTickets = new ArrayList<>();

        return new LottoTickets(lottoTickets);
    }
}
