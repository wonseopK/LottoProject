package lotto.domain.lottoResult;

public class TicketResult {
    private static int countWinNumber = 0;

    public TicketResult() {
    }

    public static void plusCount(){
        countWinNumber++;
    }
}
