package lotto.view;

import lotto.domain.lottoResult.BonusNumber;
import lotto.domain.lottoResult.WinnerNumber;
import lotto.domain.lottoTicket.Money;
import lotto.domain.lottoTicket.TicketGenerateCount;
import lotto.domain.utils.WinnerNumberHandler;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static Money inputMoney() {
        OutputView.println("구입 금액을 입력해주세요");
        return Money.create(validateIntReader(scanner));
    }

    public static WinnerNumber inputWinnerNumber() {
        OutputView.println("지난주 당첨 번호를 ','로 구분하여 입력해주세요");
        String winnerNumbers = scanner.nextLine();
        BonusNumber bonusNumber = inputBonusNumber();

        return WinnerNumberHandler.winnerNumberSaver(winnerNumbers, bonusNumber);
    }

    private static BonusNumber inputBonusNumber() {
        OutputView.println("보너스 숫자를 입력해주세요");
        int bonusNumber = InputView.validateIntReader(scanner);
        return new BonusNumber(bonusNumber);
    }

    public static int validateIntReader(Scanner scanner) {
        try {
            String validateNumber = scanner.nextLine();
            return Integer.parseInt(validateNumber);
        } catch (Exception e) {
            throw new IllegalArgumentException("숫자를 입력해주세요");
        }
    }
}
