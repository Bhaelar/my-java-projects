/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7q16;

/**
 *
 * @author Modupe Okenla
 */
public class Chapter7Q16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order

        // print all 52 Cards in the order in which they are dealt
        Card[] hand = new Card[5];
        for (int i = 0; i <= 4; i++)
        {
        // deal and display a Card
        hand[0] = myDeckOfCards.dealCard();

        }
        System.out.println(hand);
        myDeckOfCards.checkPair(hand);
    }
    
}
