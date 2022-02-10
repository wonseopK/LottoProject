package lotto.domain.lottoResult;

import java.util.List;

public class WinnerNumber {
    private List<Integer> winnerNumbers;

    public WinnerNumber(List<Integer> winnerNumbers) {
        this.winnerNumbers = winnerNumbers;
    }

    public List<Integer> getWinnerNumbers() {
        return winnerNumbers;
    }
}
