package assignment17;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Question6 {

	public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        Deque<Integer> result = new LinkedList<>();
      
        for (int i = n - 1; i >= 0; i--) {
            if (!result.isEmpty()) {
                result.addFirst(result.removeLast());
            }
            // Add the current element to the front of result
            result.addFirst(deck[i]);
        }

        // Convert the deque to an array
        int[] orderedDeck = new int[n];
        int i = 0;
        for (int card : result) {
            orderedDeck[i++] = card;
        }

        return orderedDeck;
    }

    public static void main(String[] args) {
        Question6 cardOrder = new Question6();

        int[] deck1 = {17, 13, 11, 2, 3, 5, 7};
        int[] result1 = cardOrder.deckRevealedIncreasing(deck1);
        System.out.println(Arrays.toString(result1));  

    }
}
