package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.utils.ServiceValidation;

import java.util.ArrayList;
import java.util.List;

public class Lottos {

    private List<Lotto> lottos = new ArrayList<>();

    public void buyLotto(int money) {
//        int tickets = ServiceValidation.
//        for(int i = 0 ; i < )
    }

    private List<Integer> randomNumbers() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1,45,6);
        return numbers;
    }
}
