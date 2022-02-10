package lotto.domain.lottoResult;

import java.util.Map;

public class LottoResult {
    private static final int DEFAULT_VALUE = 0;

    private final Map<Integer, Integer> result;

    public LottoResult(Map<Integer, Integer> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return String.format("3개 일치 (5000원)- %d개\n" +
                        "4개 일치 (50000원)- %d개\n" +
                        "5개 일치 (1500000원)- %d개\n" +
                        "5개 일치, 보너스 볼 일치(30000000원) - %d개\n" +
                        "6개 일치 (2000000000원)- %d개",
                result.getOrDefault(3, DEFAULT_VALUE),
                result.getOrDefault(4, DEFAULT_VALUE),
                result.getOrDefault(5, DEFAULT_VALUE),
                result.getOrDefault(7, DEFAULT_VALUE),
                result.getOrDefault(6, DEFAULT_VALUE));

    }

    public Map<Integer, Integer> getResult() {
        return result;
    }
}
