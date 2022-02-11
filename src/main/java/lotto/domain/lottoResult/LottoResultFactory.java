package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottoResultFactory {
    public static LottoResult createLottoResult(WinnerNumber winnerNumber, LottoTickets lottoTickets) {
        List<WinnerPrize.Rank> resultRanks = new ArrayList<>();

        for (LottoTicket lottoTicket : lottoTickets.getLottoTickets()) {
            boolean isBonusNumber = checkIsBonusNumber(winnerNumber.getBonusNumber(), lottoTicket);
            int resultCount = countWinNumber(winnerNumber, lottoTicket);
            saveLottoResult(resultRanks, WinnerPrize.valueOf(resultCount, isBonusNumber));
        }
        Map<String, Long> rankCountResult = creageLottoResult(resultRanks);
        long totalPrize = WinnerPrize.getTotalPrize(resultRanks);
        return new LottoResult(rankCountResult, totalPrize);

    }

    private static Map<String, Long> creageLottoResult(List<WinnerPrize.Rank> result){
        Map<String, Long> lottoResult = new HashMap<>();
        for (WinnerPrize.Rank value : WinnerPrize.Rank.values()) {
            long countRank = result.stream().filter(rank -> rank.name() == value.name()).count();
            lottoResult.put(value.name(), countRank);
        }
        return lottoResult;
    }

    private static void saveLottoResult(List<WinnerPrize.Rank> lottoResult, WinnerPrize.Rank rank) {
        lottoResult.add(rank);
    }

    private static int countWinNumber(WinnerNumber winnerNumbers, LottoTicket lottoTicket) {
        int countWinNumber = 0;
        for (Integer winnerNumber : winnerNumbers.getWinnerNumbers()) {
            countWinNumber += checkIsWinNumber(winnerNumber, lottoTicket);
        }
        return countWinNumber;
    }

    private static int checkIsWinNumber(int winNumber, LottoTicket lottoTicket) {
        return (int) lottoTicket.getLottoNumbers().stream().filter(number -> number == winNumber).count();
    }

    private static boolean checkIsBonusNumber(BonusNumber bonusNumber, LottoTicket lottoTicket) {
        return lottoTicket.getLottoNumbers().stream().anyMatch(number -> number == bonusNumber.getBonusNumber());
    }

}
