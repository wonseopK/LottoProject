package lotto.domain.validator.lottoResult;

public class WinnerNumberValidator {
    private WinnerNumberValidator() {
    }

    public static void checkIsValid(long bumber) {

    }

    public static boolean checkIsLottoNumberRange(int winnerNuber) {
        return winnerNuber >= 1 && winnerNuber <= 45;
    }
}
