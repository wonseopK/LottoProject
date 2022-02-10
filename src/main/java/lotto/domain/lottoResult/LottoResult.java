package lotto.domain.lottoResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LottoResult {
    private static final int DEFAULT_VALUE = 0;

    private final Map<Integer, Integer> result;

    public LottoResult(Map<Integer, Integer> result) {
        this.result = result;
    }

    public long calculateTotalWinningMoney() {
        List<Long> winMoneyLevel = winMoneyLevel();
        long totalWinningMoney = 0;
        for (int i = 3; i < 8; i++) {
            totalWinningMoney += result.get(i) * winMoneyLevel.get(i-3);
        }
        return totalWinningMoney;
    }

    private static List<Long> winMoneyLevel() {
        List<Long> winMoneyLevel = new ArrayList<>();
        winMoneyLevel.add(5000L);
        winMoneyLevel.add(50000L);
        winMoneyLevel.add(1500000L);
        winMoneyLevel.add(2000000000L);
        winMoneyLevel.add(30000000L);
        return winMoneyLevel;
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
