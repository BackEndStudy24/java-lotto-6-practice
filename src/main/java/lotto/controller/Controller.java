package lotto.controller;

import lotto.view.InputView;

public class Controller {

    public void start(){
        clientInput_LottoNumber();
    }


    private void clientInput_LottoNumber() {
        String rawMoney = InputView.inputBuyMoneyMessage();
    }
}
