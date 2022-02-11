package lotto.domain.lottoResult;

import java.util.List;

public class WinnerPrize {
    public enum Rank {
        FIRST(6, 2000000000),
        SECOND(5, 1500000),
        BONUS(5, 30000000),
        THIRD(4, 50000),
        FOURTH(3, 5000),
        NOMATCH(0, 0);

        private final int matchNumbers;
        private final long prize;

        Rank(int matchNumber, long prize) {
            this.matchNumbers = matchNumber;
            this.prize = prize;
        }
    }

    public static Rank valueOf(int matchNum, boolean bonus) {
        if (matchNum == WinnerPrize.Rank.SECOND.matchNumbers) {
            return validateBonusNumberMatch(bonus);
        }
        for (Rank rank : Rank.values()) {
            validateMatchRank(rank, matchNum);
        }
        return Rank.NOMATCH;
    }

    private static Rank validateMatchRank(Rank rank, int matchNum) {
        if (rank.matchNumbers == matchNum) {
            return rank;
        }
        return Rank.NOMATCH;
    }

    private static Rank validateBonusNumberMatch(boolean isMatchBonusNumber) {
        if (isMatchBonusNumber) {
            return Rank.BONUS;
        }
        return Rank.SECOND;
    }

    public static long getTotalPrize(List<Rank> lottoResult) {
        return lottoResult.stream().mapToLong(rank -> rank.prize).sum();
    }
}
