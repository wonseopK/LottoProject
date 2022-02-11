package lotto.domain.lottoResult;

public class EnumPractice {

    public enum Rank {
        FIRST(6, 2000000000),
        SECOND(5, 1500000),
        BONUS(5, 30000000),
        THIRD(4, 50000),
        FOURTH(5, 5000);

        private final int matchNumbers;
        private final long prize;

        Rank(int matchNumber, long prize) {
            this.matchNumbers = matchNumber;
            this.prize = prize;
        }
    }



    public static Rank valueOf(int matchNum, boolean bonus){
        return null;
    }

    private static Rank createMatchRank (Rank rank, int matchNum){
        if(rank.matchNumbers == matchNum){
            return rank;
        }
        return null;
    }

    private static Rank validateBonusNumberMatch(boolean isMatchBonusNumber){
        if(isMatchBonusNumber){
            return Rank.BONUS;
        }
        return Rank.SECOND;
    }


    public static void main(String[] args) {
        Rank rank = EnumPractice.valueOf(5, true);
        System.out.println(rank);
    }

}
