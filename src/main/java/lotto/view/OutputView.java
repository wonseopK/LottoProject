package lotto.view;

import lotto.domain.lottoResult.LottoResult;
import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.domain.money.Money;

public class OutputView {
    private OutputView() {
    }

    public static void println(final String msg) {
        System.out.println(msg);
    }

    public static void printOrderType(Money money, int manualOrderCount){
        System.out.println(String.format("수동으로 %d개, 자동으로 %d개를 구매했습니다.",manualOrderCount, money.getTicketCount()));
    }

    public static void printOrderTickets(LottoTickets lottoTickets) {
        for (LottoTicket lottoTicket : lottoTickets.getLottoTickets()) {
            OutputView.println(lottoTicket.toString());
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
