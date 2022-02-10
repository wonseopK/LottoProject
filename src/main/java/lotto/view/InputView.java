package lotto.view;

import lotto.domain.lottoResult.WinnerNumber;
import lotto.domain.lottoTicket.Money;
import lotto.domain.lottoTicket.TicketGenerateCount;
import lotto.domain.utils.WinnerNumberHandler;

import java.util.List;
import java.util.Scanner;

public class InputView {
    static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static TicketGenerateCount inputMoney() {
        OutputView.println("구입 금액을 입력해주세요");
        Money inputMoney = Money.create(scanner.nextInt());
        final long ticketMoney = inputMoney.getMoney();
        return TicketGenerateCount.create(ticketMoney);
    }

    public static String inputWinnerNumber(final Scanner scanner) {
        OutputView.println("지난주 당첨 번호를 ','로 구분하여 입력해주세요");
        return scanner.nextLine();
    }
//
//    public static int inputBonusNumber(final Scanner scanner) {
//        OutputView.println("보너스 금액을 입력해주세요");
//    }
}
