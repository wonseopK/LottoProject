package lotto.domain.validator.lottoTicket;

public class MoneyValidator {
    private MoneyValidator() {
    }

    public static void checkIsValid(long money) {
        if (isUnderTicketPrice(money)) {
            throw new IllegalArgumentException("1000원 보다 큰 금액을 입력해주세요");
        }
    }

    private static boolean isUnderTicketPrice(long money) {
        return money <= 1000;
    }
}
