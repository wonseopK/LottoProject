package lotto.domain.money;

public class MoneyValidator {
    public static final int MIN_INPUT_MONEY = 1000;

    private MoneyValidator() {
    }

    public static void validateMoney(long money) {
        if (isUnderTicketPrice(money)) {
            throw new IllegalArgumentException("1000원 이상의 금액을 입력해주세요");
        }
    }

    private static boolean isUnderTicketPrice(long money) {
        return money < MIN_INPUT_MONEY;
    }
}
