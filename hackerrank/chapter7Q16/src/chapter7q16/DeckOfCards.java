/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7q16;
import java.security.SecureRandom;
/**
 *
 * @author Modupe Okenla
 */
public class DeckOfCards {
    private Card[] deck; // array of Card objects
    private int currentCard; // index of next Card to be dealt (0-51)
    private static final int NUMBER_OF_CARDS = 52; // constant # of Cards
    // random number generator
    private static final SecureRandom randomNumbers = new SecureRandom();
    // constructor fills deck of Cards
    public DeckOfCards() {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        
        deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
        currentCard = 0; // first Card dealt will be deck[0]
        
        //populate deck with card objects
        for(int count = 0; count < deck.length ; count++) {
            deck[count] = new Card(faces[count % 13], suits[count/13]);
        }
    }
    
    // shuffle deck of cards with one-pass algorithm
    public void shuffle()
    {
        // next call to method dealCard should start at deck[0] again
        currentCard = 0;

        // for each Card, pick another random Card (0-51) and swap them
        for (int first = 0; first < deck.length; first++)
        {
        // select a random number between 0 and 51
        int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
        
        // swap current Card with randomly selected Card
        Card temp = deck[first];
        deck[first] = deck[second];
        deck[second] = temp;
        }
    }
    
    //deal one card
    public Card dealCard() {
        //determine whether Cards remain to be dealt
        if(currentCard < deck.length) {
            return deck[currentCard++]; // return current Card in array
        } else
            return null; // return null to indicate that all Cards were dealt
    }
    public Card[] array;
    public void checkPair(String Card[]) {
        int check = 0;
        for(int i = 0; i < array.length ; i++) {
            for(int j = i; j < array.length ; j++) {
                if(array[i].getFace().equals(array[j].getFace())) {
                    check++;
                }
            }
            if(check > 0)
                break;
        }
        if(check > 0) {
            System.out.println("Hand contains a pair");
        } else {
            System.out.println("Hand doesn't contain a pair");
        }
    }
}
