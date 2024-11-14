package solitaire;

public class App {
    public static void main(String[] args) { 
      GameState gameState = new GameState();

      int test = 0;

      if(test == 0){
        gameState.printState();//should print initital game state
      } else if(test == 1){
        gameState.drawFromDeck();
        gameState.printState(); //should have 3 visible cards in addition to initial gamestate
      } else {
        gameState.drawFromDeck();
        gameState.discardCards();
        gameState.printState(); // should have 3 cards in discard pile, no visible cards
      }
      

    }
}