package lotto.domain.lottoTicket.lottoMachine;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.money.Money;

import java.util.ArrayList;
import java.util.List;

public class LottoMachines {
    private final List<LottoMachine> lottoMachines;

    public LottoMachines(List<LottoMachine> lottoMachines) {
        this.lottoMachines = lottoMachines;
    }

    public List<LottoTicket> makeTickets(Money money) {
        List<LottoTicket> lottoTickets = new ArrayList<>();
        for (LottoMachine lottoMachine : lottoMachines) {
            List<LottoTicket> lottoTickets2 = lottoMachine.buyTickets(money);
            lottoTickets.addAll(lottoTickets2);
        }
        return lottoTickets;
    }

    private void validateNotEmptyMachine() {
        if (lottoMachines.size() == 0){
            throw new IllegalArgumentException("사용할 로또머신을 추가해주세요");
        }
    }
}
