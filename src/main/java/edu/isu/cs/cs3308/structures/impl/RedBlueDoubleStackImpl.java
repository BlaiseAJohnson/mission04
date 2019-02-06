package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.RedBlueDoubleStack;

public class RedBlueDoubleStackImpl<E> implements RedBlueDoubleStack<E> {

    private LinkedStack<E> redStack = new LinkedStack<>();
    private LinkedStack<E> blueStack = new LinkedStack<>();

    /**
     * Adds the element to the top of the Red Stack, unless the element is null.
     *
     * @param element Element to add.
     */
    @Override
    public void pushRed(E element) {
        redStack.push(element);
    }

    /**
     * Adds the element to the top of the Blue Stack, unless the element is
     * null.
     *
     * @param element Element to add.
     */
    @Override
    public void pushBlue(E element) {
        blueStack.push(element);
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
        return redStack.pop();
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
        return blueStack.pop();
    }

    /**
     * Returns the value at the top of the Red Stack.
     *
     * @return The value at the top of the Red Stack, or null if the Red Stack
     * is emtpy
     */
    @Override
    public E peekRed() {
        return redStack.peek();
    }

    /**
     * Returns the value at the top of the Blue Stack.
     *
     * @return The value at the top of the Blue Stack, or null if the Blue Stack
     * is emtpy
     */
    @Override
    public E peekBlue() {
        return blueStack.peek();
    }

    /**
     * @return Current size of the Blue Stack
     */
    @Override
    public int sizeBlue() {
        return blueStack.size();
    }

    /**
     * @return Current size of the Red Stack
     */
    @Override
    public int sizeRed() {
        return redStack.size();
    }

    /**
     * @return True if the Blue Stack is empty, false otherwise
     */
    @Override
    public boolean isBlueEmpty() {
        return blueStack.isEmpty();
    }

    /**
     * @return True if the Red Stack is empty, false otherwise
     */
    @Override
    public boolean isRedEmpty() {
        return redStack.isEmpty();
    }
}
