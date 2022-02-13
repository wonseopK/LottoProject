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
        validateLottoNumber(number);
        return box.get(number);
    }

    private static void validateLottoNumber(int inputNumber){
        boolean isNotLottoRange = inputNumber > 45 || inputNumber < 1;
        if(isNotLottoRange){
            throw new IllegalArgumentException("1~45사이의 숫자만 꺼내올수있습니다.");
        }
    }

    public static List<LottoNumber> getSixRandomLottoNumbers() {
        List<LottoNumber> lottoNumbers = new ArrayList<>(box.values());
        Collections.shuffle(lottoNumbers);
        return lottoNumbers.subList(0, 6);
    }
}
