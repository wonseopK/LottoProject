package lotto.domain.lottoResult;

import lotto.domain.money.Money;

import java.util.Map;

public class LottoResult {
    private static final long DEFAULT_VALUE = 0;

    private final Map<Rank, Long> result;
    private final double totalPrizeMoney;

    public LottoResult(Map<Rank, Long> result, long totalPrizeMoney) {
        this.result = result;
        this.totalPrizeMoney = totalPrizeMoney;
    }

    @Override
    public String toString() {
        return String.format("3개 일치 (5000원)- %d개\n" +
                        "4개 일치 (50000원)- %d개\n" +
                        "5개 일치 (1500000원)- %d개\n" +
                        "5개 일치, 보너스 볼 일치(30000000원) - %d개\n" +
                        "6개 일치 (2000000000원)- %d개",
                result.getOrDefault(Rank.FOURTH, DEFAULT_VALUE),
                result.getOrDefault(Rank.THIRD, DEFAULT_VALUE),
                result.getOrDefault(Rank.SECOND, DEFAULT_VALUE),
                result.getOrDefault(Rank.BONUS, DEFAULT_VALUE),
                result.getOrDefault(Rank.FIRST, DEFAULT_VALUE));
    }

    public String calculateProfit(Money money) {
        double profit = (totalPrizeMoney / money.getTotalSpendmoney());
        return String.format("총 수익률은 %.2f입니다.", profit);
    }

    public Map<Rank, Long> getResult() {
        return result;
    }
}
