package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottoResultFactory {


    public static LottoResult getLottoResult(WinnerNumber winnerNumber, LottoTickets lottoTickets) {
        List<WinnerPrize.Rank> resultRankContainer = new ArrayList<>();

        for (LottoTicket lottoTicket : lottoTickets.getLottoTickets()) {
            boolean bonusNumber = isBonusNumber(winnerNumber.getBonusNumber(), lottoTicket);
            int matchCount = countMatchNumber(winnerNumber, lottoTicket);
            WinnerPrize.Rank rank = WinnerPrize.valueOf(matchCount, bonusNumber);
            resultRankContainer.add(rank);
        }
        return createLottoResult(resultRankContainer);
    }

    private static boolean isBonusNumber(BonusNumber bonusNumber, LottoTicket lottoTicket) {
        return lottoTicket.getLottoNumbers().stream().anyMatch(number -> number == bonusNumber.getBonusNumber());
    }

    private static int countMatchNumber(WinnerNumber winnerNumbers, LottoTicket lottoTicket) {
        int countMatchNumber = 0;
        for (Integer winnerNumber : winnerNumbers.getWinnerNumbers()) {
            countMatchNumber += countMatchNumber(winnerNumber, lottoTicket);
        }
        return countMatchNumber;
    }

    private static LottoResult createLottoResult(List<WinnerPrize.Rank> resultRankContainer){
        Map<String, Long> rankCountResult = groupByRank(resultRankContainer);
        long totalPrizeMoney = WinnerPrize.getTotalPrize(resultRankContainer);
        return new LottoResult(rankCountResult, totalPrizeMoney);
    }

    private static Map<String, Long> groupByRank(List<WinnerPrize.Rank> result) {
        Map<String, Long> rankCountResult = new HashMap<>();
        for (WinnerPrize.Rank rankValue : WinnerPrize.Rank.values()) {
            long countRank = result.stream()
                    .filter(rank -> rank == rankValue)
                    .count();
            rankCountResult.put(rankValue.name(), countRank);
        }
        return rankCountResult;
    }

    private static long countMatchNumber(long winNumber, LottoTicket lottoTicket) {
        return lottoTicket.getLottoNumbers().stream()
                .filter(number -> number == winNumber)
                .count();
    }

}
