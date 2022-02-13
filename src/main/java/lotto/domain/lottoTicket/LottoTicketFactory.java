package lotto.domain.lottoTicket;

import java.util.*;
import java.util.stream.Collectors;

public class LottoTicketFactory {

//    private static LottoTicket createLottoTicket() {
//        Set<Integer> lottoNumbers = new HashSet<>();
//        while(true){
//            int lottoNumber = LottoNumberBox.nextInt(1, 45);
//            lottoNumbers.add(lottoNumber);
//        }
//        List<Integer> collect = lottoNumbers.stream().sorted().collect(Collectors.toList());
//        return new LottoTicket(LottoNumberBox);
//    }
//
//    public static LottoTickets giveOrderedTicket(int ticketGenerateCount) {
//        List<LottoTicket> lottoTickets = new ArrayList<>();
//        for (int i = 0; i < ticketGenerateCount; i++) {
//            lottoTickets.add(LottoTicketFactory.createLottoTicket());
//        }
//        return new LottoTickets(lottoTickets);
//    }
      public static LottoTickets giveOrderTickets(int orderTicketCount){
          List<LottoTicket> lottoTickets = new ArrayList<>();

          return new LottoTickets(lottoTickets);
      }
}
