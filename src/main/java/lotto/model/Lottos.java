package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.constants.WinnerType;
import lotto.utils.ServiceValidation;

import java.util.ArrayList;
import java.util.List;

public class Lottos {

    private static final int THOUSAND = 1000;

    private List<Lotto> lottos = new ArrayList<>();
    private int totalWinningsMoney = 0;

    public void buyLotto(int money) {
        ServiceValidation.validateDivided1000(money);
        int tickets = money / THOUSAND;

        for (int i = 0; i < tickets; i++) {
            List<Integer> numbers = randomNumbers().stream().sorted().toList();
            Lotto lotto = new Lotto(numbers);
            lottos.add(lotto);
        }

    }

    public void checkedLottoNumbers(List<Integer> winnerNumbers) {
        for (int i = 0; i < lottos.size(); i++) {
            int correct = 0;
            for (int j = 0; j < winnerNumbers.size(); j++) {
                if (lottos.get(i).getNumbers().contains(winnerNumbers.get(j))) {
                    correct++;
                }

            }
            System.out.println(correct + "----");
            if (correct >= 3) {
                WinnerType winnerType = WinnerType.checkedWinnerType(correct);
                System.out.println(winnerType.getStrWinnings() + "당첨금 문자열");
                System.out.println(winnerType.getWinnings() + " 당첨금 숫자");
                setTotalWinningsMoney(winnerType.getWinnings());
                System.out.println();
            }

        }
    }

    private List<Integer> randomNumbers() {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }

    public void getLottoList() {
        for (int i = 0; i < lottos.size(); i++) {
            System.out.println(getLottos().get(i).getNumbers());
        }
    }

    public List<Lotto> getLottos() {
        return lottos;
    }

    public void setTotalWinningsMoney(int totalWinningsMoney) {
        this.totalWinningsMoney += totalWinningsMoney;
    }

    public double yieldCal() {

        //TODO : 수익률을 계산해야한다. 만약 1000원일때 5000원당첨금이라면 500%수익률이겠지? 5000원일때 5000원이면 100%고 ㅇㅋ ㄱㄱ 소숫점 1자리까지 해보자

        // 수익률을 어떻게 계산하는가? 투자비용 / 금액이잖아

        int tujaMoney = 3737;

        int totalWinnings = 8000;

        double yield = Math.round((tujaMoney * 10000.0) / totalWinnings);

        return yield / 100.0;




    }



    public int getTotalWinningsMoney() {
        return totalWinningsMoney;
    }
}
