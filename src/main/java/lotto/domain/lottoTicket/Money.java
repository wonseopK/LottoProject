package lotto.domain.lottoTicket;

import lotto.domain.validator.lottoTicket.MoneyValidator;

public class Money {
    private long money;

    private Money(final long money) {
        MoneyValidator.checkIsValid(money);
        this.money = money;
    }

    public static Money create(final long inputMoney) {
        return new Money(inputMoney);
    }

    public long getMoney() {
        return money;
    }

}
