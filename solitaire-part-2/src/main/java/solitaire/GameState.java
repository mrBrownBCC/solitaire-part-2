package solitaire;

import java.util.Stack;

public class GameState {
    private Stack<Card> deck;                  // Full deck of cards
    private Stack<Card>[] gamePiles;          // Seven piles on the tableau
    private Stack<Card> visibleCards;         // Stack for visible cards
    private Stack<Card> discardedCards;       // Discard pile

    @SuppressWarnings("unchecked")
    public GameState() {
        // Initialize the game state
        deck = new Stack<>();
        gamePiles = new Stack[7]; // Array of 7 stacks
        visibleCards = new Stack<>();
        discardedCards = new Stack<>();

        // Initialize each game pile
        for (int i = 0; i < gamePiles.length; i++) {
            gamePiles[i] = new Stack<>();
        }

        initializeDeck();
        shuffleDeck();
        dealInitialCards();
    }

    //NEED TO IMPLEMENT
    private void initializeDeck() {
        //to create a new deck, you need to create all possible cards and push them onto the deck stack. 
        //Take a look at the Card.java file to see how cards are created
        //I recommend that you take a look at this resource, especially the 'iterate using for loop section': https://www.geeksforgeeks.org/iterating-over-enum-values-in-java/


    }

    // Shuffles the deck
    private void shuffleDeck() {
        java.util.Collections.shuffle(deck);
    }

    // Deals cards to the 7 game piles
    //NEED TO IMPLEMENT
    private void dealInitialCards() {
        //for each of the 7 slots, deal out the initial cards
        //to take a new card, you want to pop it from the deck stack
        //remember, each pile has a different ammount of cards, ranging 1-7
        //note - only top card of each pile should be faceup


    }

    // NEED TO IMPLEMENT
    public void drawFromDeck() {
        //this function should draw the top 3 cards from the deck, and add them to visibleCards
    }

    // NEED TO IMPLEMENT
    public void discardCards() {
        //takes whatever cards are remaining in the visibleCards pile and moves them to the discardPiles
    }

    //Don't change this, used for testing
    public void printState() {
        System.out.println("Deck size: " + deck.size());
    
        System.out.print("Visible cards: ");
        if (visibleCards.isEmpty()) {
            System.out.println("None");
        } else {
            for (Card card : visibleCards) {
                System.out.print(card + " ");
            }
            System.out.println();
        }
    
        System.out.println("Discarded cards: " + discardedCards.size());
    
        System.out.println("Game piles:");
        for (int i = 0; i < gamePiles.length; i++) {
            System.out.print("Pile " + (i + 1) + ": ");
            if (gamePiles[i].isEmpty()) {
                System.out.println("Empty");
            } else {
                for (Card card : gamePiles[i]) {
                    System.out.print(card + " ");
                }
                System.out.println();
            }
        }
    }
    
    //these are not the only functions that the game will need to run, we will be adding more in part 3
}
