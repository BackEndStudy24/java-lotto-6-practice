package lotto.constants;

public enum WinnerType {

    THREE(3,"5,000",5000),
    FOUR(4,"50,000",50000),
    FIVE(5,"1,500,000",1500000),
    FIVE_BONUS(5,"30,000,000",30000000),
    SIX(6,"2,000,000,000",2000000000);

    private final int correct;
    private final String strWinnings;
    private final int winnings;


    WinnerType(int correct, String strWinnings, int winnings) {
        this.correct = correct;
        this.strWinnings = strWinnings;
        this.winnings = winnings;
    }

    public static WinnerType checkedWinnerType(int correct) {
        WinnerType[] winnerTypes = WinnerType.values();
        for(int i = 0; i< winnerTypes.length; i++) {
            if(winnerTypes[i].correct == correct) {
                return winnerTypes[i];
            }
        }
        return null;
    }

    public int getCorrect() {
        return correct;
    }

    public String getStrWinnings() {
        return strWinnings;
    }

    public int getWinnings() {
        return winnings;
    }
}
