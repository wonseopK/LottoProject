package lotto.domain.lottoTicket;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoService {

    public static LottoTicket createLottoTicket() {
        List<Integer> lottoNumbers = new ArrayList<>();
        return new LottoTicket(lottoNumbers);
    }
}
