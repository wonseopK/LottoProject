package lotto;

import lotto.controller.LottoController;
import lotto.domain.lottoTicket.LottoTickets;
import lotto.domain.money.Money;
import lotto.view.InputView;

public class WebUILottoApplication {


    public static void main(String[] args) {
        // TODO: 2022/02/08 todo 진행
        Money spendMoney = InputView.inputMoney();
        LottoController lottoController = new LottoController(spendMoney);
        lottoController.run();
    }
}
