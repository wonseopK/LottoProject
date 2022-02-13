package lotto.domain.lottoNumber;

import java.util.*;

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

    public static List<LottoNumber> getSixRandomLottoNumbers() {
        List<LottoNumber> lottoNumbers = new ArrayList<>(box.values());
        Collections.shuffle(lottoNumbers);
        return lottoNumbers.subList(0, 6);
    }
}
