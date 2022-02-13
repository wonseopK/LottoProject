package lotto.domain.lottoTicket;

import java.util.List;

public class LottoTicket {
    private final List<LottoNumber> lottoNumbers;

    public LottoTicket(List<LottoNumber> lottoNumbers) {
//        LottoTicketValidator.validateSize(lottoNumbers);
//        LottoTicketValidator.validateDuplicate(lottoNumbers);
        this.lottoNumbers = lottoNumbers;
    }

    @Override
    public String toString() {
        return "" + lottoNumbers;
    }

    public List<LottoNumber> getLottoNumbers() {
        return lottoNumbers;
    }
}
