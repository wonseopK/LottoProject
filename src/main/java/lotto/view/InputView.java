package lotto.view;

import lotto.domain.lottoTicket.OrderTicketCount;
import lotto.domain.lottoTicket.lottoNumber.LottoNumber;
import lotto.domain.lottoTicket.lottoNumber.LottoNumberBox;
import lotto.domain.lottoResult.BonusNumber;
import lotto.domain.lottoResult.WinnerNumber;
import lotto.domain.money.Money;
import utils.WinnerNumberHandler;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static Money inputMoney() {
        OutputView.println("구입 금액을 입력해주세요");
        return Money.create(validateIntReader(scanner));
    }

    public static int getManualTicketCount(){
        System.out.println("수동으로 구매할 로또의 개수를 입력해주세요.");
        int inputNumber = validateIntReader(scanner);
        validatePositiveNumber(inputNumber);
        return inputNumber;
    }

    public static WinnerNumber inputWinnerNumber() {
        OutputView.println("지난주 당첨 번호를 ','로 구분하여 입력해주세요");
        String winnerNumbers = scanner.nextLine();
        BonusNumber bonusNumber = inputBonusNumber();

        return WinnerNumberHandler.winnerNumberSaver(winnerNumbers, bonusNumber);
    }

    private static BonusNumber inputBonusNumber() {
        OutputView.println("보너스 숫자를 입력해주세요");
        int inputNumber = InputView.validateIntReader(scanner);
        LottoNumber bonusNumber = LottoNumberBox.getLottoNumber(inputNumber);
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
    public static void validatePositiveNumber(int inputNumber){
        if(inputNumber < 0){
            throw new IllegalArgumentException("0보다 큰 정수를 입력해주세요");
        }
    }


}
