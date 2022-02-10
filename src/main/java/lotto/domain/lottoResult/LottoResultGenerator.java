package lotto.domain.lottoResult;

import lotto.domain.lottoTicket.LottoTicket;
import lotto.domain.lottoTicket.LottoTickets;

import java.util.HashMap;
import java.util.Map;

public class LottoResultGenerator {
    public static int count3 = 0;
    public static int count4 = 0;
    public static int count5 = 0;
    public static int count6 = 0;
    public static int countBonus = 0;


    private static Map<Integer, Integer> createBaseLottoResult() {
        Map<Integer, Integer> lottoResultBase = new HashMap<>();
        for (int i = 3; i < 8; i++) {
            lottoResultBase.put(i, 0);
        }
        return lottoResultBase;
    }

    public static LottoResult createLottoResult(WinnerNumber winnerNumber, LottoTickets lottoTickets) {
        LottoResult lottoResult = new LottoResult(createBaseLottoResult());
        for (LottoTicket lottoTicket : lottoTickets.getLottoTickets()) {
            boolean isBonusNumber = checkIsBonusNumber(winnerNumber.getBonusNumber(), lottoTicket);
            System.out.println("보너스" + isBonusNumber);
            int resultCount = countWinNumber(winnerNumber, lottoTicket);
            System.out.println(resultCount);
            if (resultCount == 3) {
                count3++;
            }
            if (resultCount == 4) {
                count4++;
            }
            if (resultCount == 5 && isBonusNumber) {
                countBonus++;

            }
            if (resultCount == 5 && !isBonusNumber) {
                count5++;
            }

            if (resultCount == 6) {
                count6++;
            }
        }

        lottoResult.getResult().put(3, count3);
        lottoResult.getResult().put(4, count4);
        lottoResult.getResult().put(5, count5);
        lottoResult.getResult().put(6, count6);
        lottoResult.getResult().put(7, countBonus);


        return lottoResult;

    }


    public static int countWinNumber(WinnerNumber winnerNumbers, LottoTicket lottoTicket) {
        int countWinNumber = 0;
        for (Integer winnerNumber : winnerNumbers.getWinnerNumbers()) {
            countWinNumber += checkIsWinNumber(winnerNumber, lottoTicket);
        }
        return countWinNumber;
    }

    public static int checkIsWinNumber(int winNumber, LottoTicket lottoTicket) {
        return (int) lottoTicket.getLottoNumbers().stream().filter(number -> number == winNumber).count();
    }

    public static boolean checkIsBonusNumber(BonusNumber bonusNumber, LottoTicket lottoTicket) {
        return lottoTicket.getLottoNumbers().stream().anyMatch(number -> number == bonusNumber.getBonusNumber());
    }

}
