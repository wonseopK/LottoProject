package lotto.domain.lottoTicket.lottoMachine;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.view.OutputView;

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
            lottoTickets.addAll(lottoTickets2);
        }
        return lottoTickets;
    }

    public List<LottoMachine> getLottoMachines() {
        return lottoMachines;
    }
}
