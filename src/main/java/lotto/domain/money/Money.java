package lotto.domain.money;

public class Money {
    public static final int TICKET_PRICE = 1000;

    private final long money;

    private Money(final long money) {
        MoneyValidator.validateMoney(money);
        this.money = money;
    }

    public static Money create(final long inputMoney) {
        return new Money(inputMoney);
    }

    public String changePrint() {
        return String.format("거스름돈은 %d원 입니다.", money % TICKET_PRICE);
    }

    public long getTicketCount() {
        return this.money / TICKET_PRICE;
    }

    public long getMoney() {
        return money;
    }


}
