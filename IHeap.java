
/** Interface for priority queue implementations
 *  <p>A priority queue, also known as a heap, always returns the highest priority item
 *  currently stored in the queue.
 */
public interface IHeap<E> {
    /** Puts an element onto the queue
     *@param e element to put on the queue
     *@param p priority of the element to be added
     *@throws OverflowException if the heap is full
     */
    public void put(E e, int p);
    
    /** Gets the next element from the queue
     *@return the first element from the queue
     *@throws UnderflowException if getting from an empty queue
     */
    //returns the thing we placed in
    public E get();

    /** First element of the queue without removing it
     *@return the first element from the queue
     *@throws UnderflowException if peeking an empty queue
     */
    public E peek();
    
    /** Number of elements currently in the queue
     *@return the number of elements in the queue
     */
    public int size();
    
    /** Changes the maximum size of the heap
     *  <p>Increasing the heap size is always safe. Decreasing the heap size may
     *  have the potential to cause data loss. If resize is called with a new size
     *  that is less than the current size, the resize request should be ignored
     *  and an OverflowException should be thrown.
     *@param s new maximum size
     *@throws OverflowException if the new size is less than the current size
     */
     public void resize(int s);
     
}

