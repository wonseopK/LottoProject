package lotto.domain.lottoTicket;

import java.util.*;
import java.util.stream.Collectors;

public class LottoNumberBox {
    private static final Map<Integer, LottoNumber> box;

    static {
        box = new HashMap<>();
        for (int i = 1; i < 46; i++) {
            box.put(i, new LottoNumber(i));
        }
    }

    public static LottoNumber getLottoNumber(int number) {
        return box.get(number);
    }

    public static List<LottoNumber> getSixRandomLottoNumber() {
        List<LottoNumber> collect = new ArrayList<>(box.values());
        Collections.shuffle(collect);
        return collect.subList(0, 6);
    }
}
