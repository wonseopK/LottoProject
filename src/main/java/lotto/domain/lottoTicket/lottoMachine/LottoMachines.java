package lotto.domain.lottoTicket.lottoMachine;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;

import java.util.ArrayList;
import java.util.List;

public class LottoMachines {
    private final List<LottoMachine> lottoMachines = new ArrayList<>();

    public void addLottoMachine(LottoMachine lottoMachine){
        this.lottoMachines.add(lottoMachine);
    }

    public List<LottoTicket> makeTickets() {
        List<LottoTicket> lottoTickets = new ArrayList<>();
        for (LottoMachine lottoMachine : lottoMachines) {
            List<LottoTicket> lottoTickets2 = lottoMachine.buyTickets();
            LottoTickets.lottoTicketsJoiner(lottoTickets, lottoTickets2);
        }
        return null;
    }
}
