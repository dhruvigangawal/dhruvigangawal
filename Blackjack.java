public class Blackjack {
    public int parseCard(String card) {
        //throw new UnsupportedOperationException("Please implement the Blackjack.parseCard method");
        //Map<String,Integer> cards = new HashMap<String,Integer>();
        if(card.equals("ace")){
            return 11;
        }
        else if(card.equals("two")){
            return 2;
        }
        else if(card.equals("three")){
            return 3;
        }
        else if(card.equals("four")){
            return 4;
        }
        else if(card.equals("five")){
            return 5;
        }
        else if(card.equals("six")){
            return 6;
        }
        else if(card.equals("seven")){
            return 7;
        }
        else if(card.equals("eight")){
            return 8;
        }
        else if(card.equals("nine")){
            return 9;
        }
        else if(card.equals("ten")){
            return 10;
        }
        else if(card.equals("jack") || card.equals("queen") || card.equals("king")){
            return 10;
        }
        return 0;
    }
    public boolean isBlackjack(String card1, String card2) {
        //throw new UnsupportedOperationException("Please implement the Blackjack.isBlackjack method");
        int c1 = parseCard(card1);
        int c2 = parseCard(card2);
        if(c1+c2==21){
            return true;
        }
        return false;
    }
    public String largeHand(boolean isBlackjack, int dealerScore) {
        //throw new UnsupportedOperationException("Please implement the Blackjack.largeHand method");
        if(isBlackjack){
            if(dealerScore<10){
                return "W";
            }
            else{
                return "S";
            }
        }
        return "P";
    }
    public String smallHand(int handScore, int dealerScore) {
        //throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
        if(handScore>=17){
            return "S";
        }
        else if(handScore<=11){
            return "H";
        }
        else if((handScore>=12 && handScore<=16) && dealerScore<=6){
            return "S";
        }
        else if((handScore>=12 && handScore<=16) && dealerScore>=7){
            return "H";
        }

        return "W";

    }
    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
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