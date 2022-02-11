package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.Money;

import java.util.Map;

public class LottoResult {
    private static final long DEFAULT_VALUE = 0;

    private final Map<String, Long> result;
    private final double totalPrizeMoney;

    public LottoResult(Map<String, Long> result, long totalPrizeMoney) {
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
                result.getOrDefault("FOURTH", DEFAULT_VALUE),
                result.getOrDefault("THIRD", DEFAULT_VALUE),
                result.getOrDefault("SECOND", DEFAULT_VALUE),
                result.getOrDefault("BONUS", DEFAULT_VALUE),
                result.getOrDefault("FIRST", DEFAULT_VALUE));

    }

    public String calculateProfit(Money spendMoneye) {
        double profit = (totalPrizeMoney / spendMoneye.getMoney());
        return String.format("총 수익률은 %.2f입니다.", profit);
    }

    public Map<String, Long> getResult() {
        return result;
    }
}
