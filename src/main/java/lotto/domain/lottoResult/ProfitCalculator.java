package lotto.domain.lottoResult;

import java.util.ArrayList;
import java.util.List;

public class ProfitCalculator {
    private static List<Long> winMoneyLevel() {
        List<Long> winMoneyLevel = new ArrayList<>();
        winMoneyLevel.add(5000L);
        winMoneyLevel.add(50000L);
        winMoneyLevel.add(1500000L);
        winMoneyLevel.add(1500000L);
        winMoneyLevel.add(30000000L);
        winMoneyLevel.add(2000000000L);
        return winMoneyLevel;
    }


    public static String calculateProfit(long spendMoney, long earnedMoney) {
        double profit = earnedMoney / spendMoney % 100;
        return "";
    }


    private static long CalculateTotalWinningMoney(LottoResult lottoResult) {
        List<Long> winMoneyLevel = winMoneyLevel();
        long totalWinningMoney = 0;
        for (int i = 3; i < 8; i++) {
            totalWinningMoney += lottoResult.getResult().get(i) * winMoneyLevel.get(i);
        }
        return totalWinningMoney;
    }
}
