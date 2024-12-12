package lotto.controller;

import lotto.model.Lottos;
import lotto.utils.ServiceValidation;
import lotto.view.InputView;

import java.util.List;

public class Controller {

    final Lottos lottos = new Lottos();

    public void start(){
        clientInput_Money();
        clientInput_LottoNumbers();
        clientInput_BonusNumber();
    }

    private void clientInput_Money() {
        String rawMoney = InputView.getBuyMoneyMessage();
        ServiceValidation.validateNull(rawMoney);
        ServiceValidation.validateIsNumeric(rawMoney);
        int money = Integer.parseInt(rawMoney);
        lottos.buyLotto(money);
    }

    private void clientInput_LottoNumbers() {
        List<String> rawLottoNumbers = InputView.getStringsUsingDelimiter();
        System.out.println(rawLottoNumbers);
    }

    private void clientInput_BonusNumber() {
        String rawBonusNumber = InputView.getBonusNumber();
    }


}
