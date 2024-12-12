package lotto.constants;

public enum ErrorMessageType {

    ERROR_NULL("[ERROR] 빈값은 입력할 수 없습니다. 다시 입력 해주세요."),
    ERROR_NUMBER_FORMAT("[ERROR] 올바르지 않은 숫자 형식입니다. 다시 입력 해주세요."),
    ERROR_LOTTO_NUMBER_FORMAT("[ERROR] 올바르지 않은 로또번호 형식입니다. 다시 입력 해주세요."),
    ERROR_DUPLICATE_LOTTO_NUMBER("[ERROR] 로또번호는 중복될 수 없습니다. 다시 입력 해주세요."),
    ERROR_LOTTO_NUMBER_COUNT("[ERROR] 로또번호는 6개를 입력해야합니다. 다시 입력 해주세요."),
    ERROR_DUPLICATE_BONUS_NUMBER("[ERROR] 로또번호와 보너스 번호는 중복될 수 없습니다. 다시 입력 해주세요."),
    ERROR_LOTTO_NUMBER_RANGE("[ERROR] 로또 번호는 1~45만 입력 가능합니다. 다시 입력 해주세요."),
    ERROR_BONUS_NUMBER_RANGE("[ERROR] 보너스 번호는 1~45만 입력 가능합니다. 다시 입력 해주세요."),
    ERROR_END_COMMA("[ERROR] 잘못된 입력입니다. 다시 입력 해주세요."),
    ERROR_MONEY_DIVIDED("[ERROR] 금액은 1000원단위로 입력해야합니다. 다시 입력 해주세요.");

    private final String message;

    ErrorMessageType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}