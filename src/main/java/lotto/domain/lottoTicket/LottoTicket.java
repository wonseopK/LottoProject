package lotto.domain.lottoTicket;

import lotto.domain.validator.lottoTicket.LottoTicketValidator;

import java.util.List;

public class LottoTicket {
    private final List<Integer> lottoNumbers;

    public LottoTicket(List<Integer> lottoNumbers) {
        LottoTicketValidator.validateSize(lottoNumbers);
        LottoTicketValidator.validateDuplicate(lottoNumbers);
        this.lottoNumbers = lottoNumbers;
    }

    @Override
    public String toString() {
        return "" + lottoNumbers;
    }

    public List<Integer> getLottoNumbers() {
        return lottoNumbers;
    }
}
