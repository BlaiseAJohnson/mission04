package edu.isu.cs.cs3308;

import edu.isu.cs.cs3308.structures.Stack;
import edu.isu.cs.cs3308.structures.impl.LinkedDeque;

/**
 *
 * @author Isaac Griffith
 */
public class DequeStackMerge {

    /**
     * Merges the contents of the second stack (from) into the bottom of the
     * first stack (into) while preserving the order of the original stacks.
     * Note that if either stack is null, nothing happens.
     *
     * @param <E> Element type of the stacks
     * @param into Stack into which the other stack will be merged
     * @param from Stack which is merged into the bottom of the other stack.
     */
    public static <E> void dequeStackMerge(final Stack<E> into, Stack<E> from) {
        LinkedDeque<E> deque = new LinkedDeque<>();
        int intoSize = 0;
        int fromSize = 0;

        /*
         * This implementation will take advantage of the fact that a deck can be used
         * as a double stack.
         *
         * OfferFirst and Poll will be used to manipulate one end of the deque (into), while
         * Offer and PollLast will be used to manipulate the other (from), and neither will be
         * allowed to intersect each other (this is assured by the fields intoSize and
         * fromSize).
         */

        while (!into.isEmpty()) {
            deque.offerFirst(into.pop());
            intoSize++;
        }

        while (!from.isEmpty()) {
            deque.offer(from.pop());
            fromSize++;
        }

        while (fromSize > 0) {
            into.push(deque.pollLast());
            fromSize--;
        }

        while (intoSize > 0) {
            into.push(deque.poll());
            intoSize--;
        }
    }
}
