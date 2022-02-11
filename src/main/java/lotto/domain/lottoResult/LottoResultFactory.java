package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottoResultFactory {
    public static LottoResult createLottoResult(WinnerNumber winnerNumber, LottoTickets lottoTickets) {
        List<WinnerPrize.Rank> resultRankContainer = new ArrayList<>();
        for (LottoTicket lottoTicket : lottoTickets.getLottoTickets()) {
            boolean bonusNumber = checkIsBonusNumber(winnerNumber.getBonusNumber(), lottoTicket);
            int matchCount = countMatchNumber(winnerNumber, lottoTicket);
            WinnerPrize.Rank rank = WinnerPrize.valueOf(matchCount, bonusNumber);
            resultRankContainer.add(rank);
        }
        Map<String, Long> rankCountResult = createLottoRankCountResult(resultRankContainer);
        long totalPrizeMoney = WinnerPrize.getTotalPrize(resultRankContainer);
        return new LottoResult(rankCountResult, totalPrizeMoney);

    }

    private static Map<String, Long> createLottoRankCountResult(List<WinnerPrize.Rank> result) {
        Map<String, Long> rankCountResult = new HashMap<>();
        for (WinnerPrize.Rank rankValue : WinnerPrize.Rank.values()) {
            long countRank = result.stream().filter(rank -> rank.name().equals(rankValue.name())).count();
            rankCountResult.put(rankValue.name(), countRank);
        }
        return rankCountResult;
    }

    private static int countMatchNumber(WinnerNumber winnerNumbers, LottoTicket lottoTicket) {
        int countWinNumber = 0;
        for (Integer winnerNumber : winnerNumbers.getWinnerNumbers()) {
            countWinNumber += checkIsWinNumber(winnerNumber, lottoTicket);
        }
        return countWinNumber;
    }

    private static long checkIsWinNumber(long winNumber, LottoTicket lottoTicket) {
        return lottoTicket.getLottoNumbers().stream().filter(number -> number == winNumber).count();
    }

    private static boolean checkIsBonusNumber(BonusNumber bonusNumber, LottoTicket lottoTicket) {
        return lottoTicket.getLottoNumbers().stream().anyMatch(number -> number == bonusNumber.getBonusNumber());
    }

}
