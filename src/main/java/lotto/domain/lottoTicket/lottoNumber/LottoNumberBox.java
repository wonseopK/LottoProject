package lotto.domain.lottoTicket.lottoNumber;

import java.util.*;

public class LottoNumberBox {
    public static final int LOTTO_MIN_NUMBER = 1;
    public static final int LOTTO_MAX_NUMBER = 45;
    public static final int LOTTO_NUMBER_SIZE = 6;
    public static final String LOTTO_NUMBER_RANGE = String.format("%d~%d사이의 숫자만 꺼내올수있습니다.", LOTTO_MIN_NUMBER, LOTTO_MAX_NUMBER);

    private static final Map<Integer, LottoNumber> box;

    static {
        box = new HashMap<>();
        for (int i = LOTTO_MIN_NUMBER; i <= LOTTO_MAX_NUMBER; i++) {
            box.put(i, new LottoNumber(i));
        }
    }

    public static LottoNumber getLottoNumber(int number) {
        validateLottoNumber(number);
        return box.get(number);
    }

    private static void validateLottoNumber(int inputNumber) {
        boolean isNotLottoRange = inputNumber > LOTTO_MAX_NUMBER || inputNumber < LOTTO_MIN_NUMBER;
        if (isNotLottoRange) {
            throw new IllegalArgumentException(LOTTO_NUMBER_RANGE);
        }
    }

    public static List<LottoNumber> getSixRandomLottoNumbers() {
        List<LottoNumber> lottoNumbers = new ArrayList<>(box.values());
        Collections.shuffle(lottoNumbers);
        return lottoNumbers.subList(0, LOTTO_NUMBER_SIZE);
    }
}
