package lotto.view;

import lotto.domain.lottoResult.LottoResult;
import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.domain.money.Money;

public class OutputView {

    private OutputView() {
    }

    public static void printAutoOrderCount(Money money) {
        System.out.println(String.format("%d개를 구매했습니다.", money.getTicketCount()));
    }

    public static void printManulAndAutoOrderCount(Money money, long manualTicketCount) {
        System.out.println(String.format("수동%d개 자동%d개를 구매했습니다.", manualTicketCount, money.getTicketCount()));
    }

    public static void printOrderTickets(LottoTickets lottoTickets) {
        for (LottoTicket lottoTicket : lottoTickets.getLottoTickets()) {
            System.out.println(lottoTicket.toString());
        }
    }

    public static void printLottoResult(LottoResult lottoResult, Money spendMoney) {
        System.out.println("당첨 통계\n" +
                "---------\n" +
                lottoResult.toString() + "\n" +
                lottoResult.calculateProfit(spendMoney));

    }

    public static void printAskManualLottoNumbers() {
        System.out.println("수동으로 구매할 로또의 번호들을 입력해주세요.");
    }
}
