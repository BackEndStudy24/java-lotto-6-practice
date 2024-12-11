package lotto.constants;

public enum ErrorMessageType {

    ERROR_NULL("[ERROR] 빈값은 입력할 수 없습니다. 다시 입력 해주세요."),
    ERROR_BONUS_NUMBER_FORMAT("[ERROR] 올바르지 않은 보너스번호 형식입니다. 다시 입력 해주세요.");

    private final String message;

    ErrorMessageType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    }