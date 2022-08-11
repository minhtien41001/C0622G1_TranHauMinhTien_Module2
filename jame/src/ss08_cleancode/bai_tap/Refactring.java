package ss08_cleancode.bai_tap;

public class Refactring {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;

    public static String getScore(int firstPlayerScore, int secondPlayerScore) {
        String score = " ";
        boolean isDeuce = firstPlayerScore == secondPlayerScore;
        boolean isScoreMoreThan4 = firstPlayerScore >= 4 || secondPlayerScore >= 4;

        if (isDeuce) {
            return result(firstPlayerScore);
        }

        if (isScoreMoreThan4) {
            return win(firstPlayerScore, secondPlayerScore);
        }

        return currentScore(firstPlayerScore, secondPlayerScore, score);
    }

    /**
     *
     * @param firstPlayerScore : điểm số của người chơi 1
     * @return điểm số của người chơi thứ nhất theo cách gọi trong tennis
     */

    public static String result(int firstPlayerScore) {
        switch (firstPlayerScore) {
            case LOVE:
                return "Love-All";
            case FIFTEEN:
                return "Fifteen-All";
            case THIRTY:
                return "Thirty-All";
            case FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    /**
     *
     * @param firstPlayerScore : điểm số của người chơi 1
     * @param secondPlayerScore : điểm số của người chơi 2
     * @return kết quả là adventage hoặc win
     */

    public static String win(int firstPlayerScore, int secondPlayerScore) {
        int minusResult = firstPlayerScore - secondPlayerScore;
        if (minusResult == 1) {
            return "Advantage player1";
        } else if (minusResult == -1) {
            return "Advantage player2";
        } else if (minusResult >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    /**
     *
     * @param firstPlayerScore: điểm số của người chơi thứ nhất
     * @param secondPlayerScore: điểm số của người chơi thứ hai
     * @param score: điểm ghi được hiện tại
     * @return: điểm ghi được hiện tại
     */

    public static String currentScore(int firstPlayerScore, int secondPlayerScore, String score) {
        int tempScore = 0;
        StringBuilder scoreBuilder = new StringBuilder(score);
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = firstPlayerScore;
            } else {
                scoreBuilder.append("-");
                tempScore = secondPlayerScore;
            }
        }
        score = scoreBuilder.toString();
        switch (tempScore) {
            case LOVE:
                score += "Love";
                break;
            case FIFTEEN:
                score += "Fifteen";
                break;
            case THIRTY:
                score += "Thirty";
                break;
            case FORTY:
                score += "Forty";
                break;
        }
        return score;
    }
}
