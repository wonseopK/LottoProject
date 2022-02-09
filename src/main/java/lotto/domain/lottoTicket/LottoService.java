package lotto.domain.lottoTicket;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoService {

    public static LottoTicket createLottoTicket() {


        List<Integer> lottoNumbers = new Random()
                .ints(1,45)
                .distinct()
                .limit(6)
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        return new LottoTicket(lottoNumbers);
    }
}
