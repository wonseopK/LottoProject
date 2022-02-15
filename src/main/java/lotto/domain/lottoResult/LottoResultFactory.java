package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.lottoNumber.LottoNumber;
import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottoResultFactory {

    public static LottoResult getLottoResult(WinnerNumber winnerNumber, LottoTickets lottoTickets) {
        List<Rank> resultRankContainer = new ArrayList<>();

        for (LottoTicket lottoTicket : lottoTickets.getLottoTickets()) {
            boolean bonusNumber = isBonusNumber(winnerNumber.getBonusNumber(), lottoTicket);
            int matchCount = getMatchCount(winnerNumber, lottoTicket);
            Rank rank = Rank.valueOf(matchCount, bonusNumber);
            resultRankContainer.add(rank);
        }
        return createLottoResult(resultRankContainer);
    }

    private static boolean isBonusNumber(BonusNumber bonusNumber, LottoTicket lottoTicket) {
        return lottoTicket.getLottoNumbers()
                .stream()
                .anyMatch(number -> number == bonusNumber.getBonusNumber());
    }

    private static int getMatchCount(WinnerNumber winnerNumbers, LottoTicket lottoTicket) {
        int countMatchNumber = 0;
        for (LottoNumber winnerNumber : winnerNumbers.getWinnerNumbers()) {
            countMatchNumber += countMatchNumber(winnerNumber, lottoTicket);
        }
        return countMatchNumber;
    }

    private static long countMatchNumber(LottoNumber winNumber, LottoTicket lottoTicket) {
        return lottoTicket.getLottoNumbers().stream()
                .filter(lottoNumber -> lottoNumber == winNumber)
                .count();
    }

    private static LottoResult createLottoResult(List<Rank> resultRankContainer) {
        Map<Rank, Long> rankCountResult = groupByRank(resultRankContainer);
        long totalPrizeMoney = Rank.getTotalPrize(resultRankContainer);
        return new LottoResult(rankCountResult, totalPrizeMoney);
    }

    private static Map<Rank, Long> groupByRank(List<Rank> result) {
        Map<Rank, Long> rankCountResult = new HashMap<>();
        for (Rank rankValue : Rank.values()) {
            long countRank = result.stream()
                    .filter(rank -> rank == rankValue)
                    .count();
            rankCountResult.put(rankValue, countRank);
        }
        return rankCountResult;
    }


}
