package ss9_cleancode.bai_tap;

public class TennisGame {

    public static void main(String[] args) {
        System.out.println(getScore("Sang", "Phin", 3, 2));
    }

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scoreplayer2) {
        if (scorePlayer1 == scoreplayer2) {
            return scoreEqual(player1Name,player2Name,scorePlayer1);
        } else if (scorePlayer1 >= 4 || scoreplayer2 >= 4) {
            return advantage(player1Name,player2Name,scorePlayer1, scoreplayer2);
        } else {
            return scoreNomal(player1Name,player2Name,scorePlayer1, scoreplayer2);
        }
    }

    public static String scoreEqual(String player1Name, String player2Name,int scorePlayer1) {
        switch (scorePlayer1) {
            case 0:
                return player1Name+"and"+player2Name+"Love-All";
            case 1:
                return player1Name+"and"+player2Name+"Fifteen-All";
            case 2:
                return player1Name+"and"+player2Name+"Thirty-All";
            case 3:
                return player1Name+"and"+player2Name+"Forty-All";
            default:
                return player1Name+"and"+player2Name+"Deuce";
        }
    }

    public static String advantage(String player1Name, String player2Name, int scorePlayer1, int scoreplayer2) {
        int minusResult = scorePlayer1 - scoreplayer2;
        if (minusResult == 1) {
            return "Advantage "+player1Name;
        } else if (minusResult == -1) {
            return "Advantage "+player2Name;
        } else if (minusResult >= 2) {
            return "Win for "+player1Name;
        } else {
            return "Win for "+player2Name;
        }
    }

    public static String scoreNomal(String player1Name, String player2Name, int scorePlayer1, int scoreplayer2) {
        int tempScore = 0;
        String score = player1Name+" ";
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = scorePlayer1;
            } else {
                score += "-";
                tempScore = scoreplayer2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        score+= " "+player2Name;
        return score;
    }
}

