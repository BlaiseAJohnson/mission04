package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.RedBlueDoubleStack;

public class RedBlueDoubleStackImpl<E> implements RedBlueDoubleStack<E> {
    private LinkedDeque<E> deque = new LinkedDeque<>();
    private int redSize = 0;
    private int blueSize = 0;

    /**
     * Adds the element to the top of the Red Stack, unless the element is null.
     *
     * @param element Element to add.
     */
    @Override
    public void pushRed(E element) {
        if (element == null) return;

        deque.offerFirst(element);
        redSize++;
    }

    /**
     * Adds the element to the top of the Blue Stack, unless the element is
     * null.
     *
     * @param element Element to add.
     */
    @Override
    public void pushBlue(E element) {
        if (element == null) return;

        deque.offer(element);
        blueSize++;
    }

    /**
     * Removes the element at the top of the Red Stack and returns its value,
     * unless the Red Stack is empty.
     *
     * @return Element at the top of the Red Stack, or null if the Red Stack is
     * empty
     */
    @Override
    public E popRed() {
        if (redSize == 0) return null;

        redSize--;
        return deque.poll();
    }

    /**
     * Removes the element at the top of the Blue Stack and returns its value,
     * unless the Blue Stack is empty.
     *
     * @return Element at the top of the Red Stack, or null if the Blue Stack is
     * empty
     */
    @Override
    public E popBlue() {
        if (blueSize == 0) return null;

        blueSize--;
        return deque.pollLast();
    }

    /**
     * Returns the value at the top of the Red Stack.
     *
     * @return The value at the top of the Red Stack, or null if the Red Stack
     * is emtpy
     */
    @Override
    public E peekRed() {
        if (redSize == 0) return null;

        return deque.peek();
    }

    /**
     * Returns the value at the top of the Blue Stack.
     *
     * @return The value at the top of the Blue Stack, or null if the Blue Stack
     * is emtpy
     */
    @Override
    public E peekBlue() {
        if (blueSize == 0) return null;

        return deque.peekLast();
    }

    /**
     * @return Current size of the Blue Stack
     */
    @Override
    public int sizeBlue() {
        return blueSize;
    }

    /**
     * @return Current size of the Red Stack
     */
    @Override
    public int sizeRed() {
        return redSize;
    }

    /**
     * @return True if the Blue Stack is empty, false otherwise
     */
    @Override
    public boolean isBlueEmpty() {
        return blueSize == 0;
    }

    /**
     * @return True if the Red Stack is empty, false otherwise
     */
    @Override
    public boolean isRedEmpty() {
        return redSize == 0;
    }
}
