package lotto.domain.validator.lottoTicket;

public class MoneyValidator {
    private MoneyValidator() {
    }

    public static void checkIsValid(long money) {
        if (!checkIsPositive(money)) {
            throw new IllegalArgumentException("0 보다 큰 금액을 입력해주세요");
        }
    }

    public static boolean checkIsPositive(long money) {
        return money > 0;
    }
}
