package lotto.domain.validator.lottoTicket;

public class MoneyValidator {
    private MoneyValidator() {
    }

    public static void checkIsValid(long money) {
        if (isUnderZero(money)) {
            throw new IllegalArgumentException("0 보다 큰 금액을 입력해주세요");
        }
    }

    private static boolean isUnderZero(long money) {
        return money <= 0;
    }
}
