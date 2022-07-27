public class Blackjack {
    char stand = 'S';
    char hit = 'H';
    char split = 'P';
    char automaticallyWin = 'W';

    public int parseCard(String card){
        if (card == "ace"){
            return 11;
        } else if (card == "two") {
            return 2;
        } else if (card == "three") {
            return 3;
        } else if (card == "four") {
            return 4;
        } else if (card == "five") {
            return 5;
        } else if (card == "six") {
            return 6;
        } else if (card == "seven") {
            return 7;
        } else if (card == "eight") {
            return 8;
        } else if (card == "nine") {
            return 9;
        } else if (card == "ten" || card == "jack" || card == "queen" || card == "king") {
            return 10;
        } else {
            return 0;
        }
    }

    public boolean isBlackjack(String card1, String card2){
        if (parseCard(card1) + parseCard(card2) == 21){
            return true;
        } else {
            return false;
        }
    }

    public String largeHand(boolean isBlackJack, int dealerScore){
        if (isBlackJack == true && dealerScore <= 9){
            return "W";
        } else if (isBlackJack == true && dealerScore > 9) {
            return "S";
        }else {
            return "P";
        }
    }

    public String smallHand(int handScore, int dealerScore){
        if (handScore >= 17){
            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else if (handScore >= 12 && handScore <=16) {
            if( dealerScore <7){
                return "S";
            }else{
                return "H";
            }
        } else {
            return "H";
        }
    }

    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);
        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
