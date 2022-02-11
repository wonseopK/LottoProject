package lotto.domain.lottoTicket;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class LottoTicketFactory {

    private static LottoTicket createLottoTicket() {
//        List<Integer> lottoNumbers = new Random()
//                .ints(1, 45)
//                .distinct()
//                .limit(6)
//                .sorted()
//                .boxed()
//                .collect(Collectors.toList());
//
//        return new LottoTicket(lottoNumbers);
        List<Integer> lottoNumbers = new ArrayList<>();
        for(int i = 0; i<6; i++){
            int lottoNumber = LottoNumber.nextInt(1, 45);
            lottoNumbers.add(lottoNumber);
        }
        return new LottoTicket(lottoNumbers);
    }

    public static LottoTickets giveOrderedTicket(int ticketGenerateCount) {
        List<LottoTicket> lottoTickets = new ArrayList<>();
        for (int i = 0; i < ticketGenerateCount; i++) {
            lottoTickets.add(LottoTicketFactory.createLottoTicket());
        }
        return new LottoTickets(lottoTickets);
    }
}
