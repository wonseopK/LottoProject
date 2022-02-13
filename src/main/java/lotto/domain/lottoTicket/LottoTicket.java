package lotto.domain.lottoTicket;

import lotto.domain.validator.lottoTicket.LottoTicketValidator;

import java.util.List;
import java.util.stream.Collectors;

public class LottoTicket {
    private final List<LottoNumber> lottoNumbers;


    public LottoTicket(List<LottoNumber> lottoNumbers) {
        LottoTicketValidator.validateSize(lottoNumbers);
        LottoTicketValidator.validateDuplicate(lottoNumbers);
        this.lottoNumbers = lottoNumbers;
    }

    @Override
    public String toString() {
        String printLottoTicket = lottoNumbers.stream().map(LottoNumber::toString).collect(Collectors.joining(","));
        return "[" + printLottoTicket + "]";
    }

    public List<LottoNumber> getLottoNumbers() {
        return lottoNumbers;
    }
}
