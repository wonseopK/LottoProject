package lotto.domain.lottoResult;

import java.util.List;

public enum Rank {
    FIRST(6, 2000000000),
    SECOND(5, 1500000),
    BONUS(5, 30000000),
    THIRD(4, 50000),
    FOURTH(3, 5000),
    SIXTH(2, 0),
    SEVENTH(1, 0),
    EIGHTH(0, 0);

    private final int matchNumbers;
    private final long prize;

    Rank(int matchNumber, long prize) {
        this.matchNumbers = matchNumber;
        this.prize = prize;
    }

    public static Rank valueOf(int matchNum, boolean bonus) {
        if (matchNum == Rank.SECOND.matchNumbers) {
            return findBonusNumber(bonus);
        }
        for (Rank rank : Rank.values()) {
            if (rank.matchNumbers == matchNum) {
                return rank;
            }
        }
        return null;
    }

    private static Rank findBonusNumber(boolean isMatchBonusNumber) {
        if (isMatchBonusNumber) {
            return Rank.BONUS;
        }
        return Rank.SECOND;
    }

    //lottoResult에 당첨된것들이 하나도 없을 경우 0반환하도록 테스트하기
    public static long getTotalPrize(List<Rank> lottoResult) {
        return lottoResult.stream()
                .mapToLong(rank -> rank.prize).sum();
    }
}
