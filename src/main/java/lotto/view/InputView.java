package lotto.view;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.lottoNumber.LottoNumber;
import lotto.domain.lottoTicket.lottoNumber.LottoNumberBox;
import lotto.domain.lottoResult.BonusNumber;
import lotto.domain.lottoResult.WinnerNumber;
import lotto.domain.money.Money;
import utils.NumberSpliter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    public static final String INPUT_MONEY = "구입 금액을 입력해주세요";
    public static final String INPUT_MANUAL_COUNT = "수동으로 구매할 로또의 개수를 입력해주세요";
    public static final String INPUT_MANUAL_LOTTO_NUMBER = "수동으로 구매할 로또의 개수를 입력해주세요";
    public static final String INPUT_WINNER_NUMBER = "지난주 당첨 번호를 ','로 구분하여 입력해주세요";
    public static final String INPUT_BONUS_NUMBER = "보너스 숫자를 입력해주세요";

    public static final String OVER_LIMIT_NUMBER = "구입한 개수 이하의 숫자를 입력해주세요";
    public static final String NOT_NUMBER = "숫자를 입력해주세요";
    public static final String UNDER_NUMBER_ONE = "0보다 큰 정수를 입력해주세요";


    private InputView() {
    }

    public static Money inputMoney() {
        System.out.println(INPUT_MONEY);
        return Money.create(validateIntReader(scanner));
    }

    public static int getManualTicketCount(Money money) {
        System.out.println(INPUT_MANUAL_COUNT);
        int inputNumber = validateIntReader(scanner);
        boolean isOverCount = inputNumber > money.getTicketCount();
        if (isOverCount) {
            throw new IllegalArgumentException(OVER_LIMIT_NUMBER);
        }
        validatePositiveNumber(inputNumber);
        return inputNumber;
    }

    public static List<LottoTicket> inputManualLottoTicket(long count) {
        System.out.println(INPUT_MANUAL_LOTTO_NUMBER);
        List<LottoTicket> lottoTickets = new ArrayList<>();
        for (long i = 0; i < count; i++) {
            String intputNumber = scanner.nextLine();
            LottoTicket lottoTicket = new LottoTicket(NumberSpliter.splitNumbers(intputNumber));
            lottoTickets.add(lottoTicket);
        }
        return lottoTickets;
    }

    public static WinnerNumber inputWinnerNumber() {
        System.out.println(INPUT_WINNER_NUMBER);
        String winnerNumbers = scanner.nextLine();
        BonusNumber bonusNumber = inputBonusNumber();

        return NumberSpliter.winnerNumberSaver(winnerNumbers, bonusNumber);
    }

    private static BonusNumber inputBonusNumber() {
        System.out.println(INPUT_BONUS_NUMBER);
        int inputNumber = InputView.validateIntReader(scanner);
        LottoNumber bonusNumber = LottoNumberBox.getLottoNumber(inputNumber);
        return new BonusNumber(bonusNumber);
    }

    public static int validateIntReader(Scanner scanner) {
        try {
            String validateNumber = scanner.nextLine();
            return Integer.parseInt(validateNumber);
        } catch (Exception e) {
            throw new IllegalArgumentException(NOT_NUMBER);
        }
    }

    public static void validatePositiveNumber(int inputNumber) {
        if (inputNumber < 0) {
            throw new IllegalArgumentException(UNDER_NUMBER_ONE);
        }
    }


}
