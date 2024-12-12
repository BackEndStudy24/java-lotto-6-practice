package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.utils.ServiceValidation;

import java.util.ArrayList;
import java.util.List;

public class Lottos {

    private static final int THOUSAND = 1000;

    private List<Integer> lottos = new ArrayList<>();


    public void buyLotto(int money) {
        ServiceValidation.validateDivided1000(money);
        int tickets = money / THOUSAND;

        for (int i = 0; i < tickets; i++) {
            Lotto lotto = new Lotto(randomNumbers());
            System.out.println(lotto.getNumbers());
        }

    }

    private List<Integer> randomNumbers() {
        return Randoms.pickUniqueNumbersInRange(1, 45, 6);
    }

}
