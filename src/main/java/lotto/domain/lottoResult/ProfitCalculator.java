package lotto.domain.lottoResult;


public class ProfitCalculator {
    public static String calculateProfit(double spendMoney, LottoResult lottoResult) {
        double earnedMoney = lottoResult.calculateTotalWinningMoney();
        double profit = (earnedMoney / spendMoney);
        return String.format("%.2f",profit);
    }
}
