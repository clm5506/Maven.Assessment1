package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {

        String answer = "";
        switch(handSign) {
            case ROCK:  answer = PAPER;
                break;
            case PAPER: answer = SCISSOR;
                break;
            case SCISSOR: answer = ROCK;
                break;
        }
        return answer;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String answer = "";

        switch (handSign) {
            case PAPER:
                answer = ROCK;
                break;
            case SCISSOR:
                answer = PAPER;
                break;
            case ROCK:
                answer = SCISSOR;
                break;



        }
        return answer;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        String player1Losing = getLosingMove(handSignOfPlayer1);

        if(player1Losing.equals(handSignOfPlayer1)) {
            return handSignOfPlayer2;
        }
        return handSignOfPlayer1;
    }
}
