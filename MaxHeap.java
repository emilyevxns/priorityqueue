
public class MaxHeap<E> implements IHeap<E> {
   
	private E[] data;
	private Integer[] pri;
	private int size;
	private int tail;
	int max;
	
	/**
	 * Constructs the instance variables 
	 * @param i index to set the size of the heap
	 */
	
	public MaxHeap(int i) {
		// TODO Auto-generated constructor stub
		data = (E[]) new Object[i];
		pri = new Integer[i];
		size = 0;
		tail = 0;
		max = i;
	}
	
	/**
	 * Gets the index of parent node
	 * @param idx of node
	 * @return index of parent node
	 */
	public int parent(int idx) {
		if (idx % 2 == 0) {
			int pidx = (idx - 2) / 2;
			return pidx;
		}
		else {
			int pidx = (idx - 1) / 2;
			return pidx;
		}
	}
	
	/**
	 * Gets index of left child
	 * @param idx of node
	 * @return index of left child
	 */
	public int left(int idx) {
		int lidx = (idx * 2) + 1;
		return lidx;
	}
	
	/**
	 * Gets index of right child
	 * @param idx of node
	 * @return index of right child
	 */
	public int right(int idx) {
		int ridx = (idx * 2) + 2;
		return ridx;
	}
	
	
	/**
	 * Swaps the elements to satisfy invariants
	 * @param a first element 
	 * @param b second element 
	 */
	public void swap(int a, int b) {
		E temp = data[a];
		data[a] = data[b];
		data[b] = (E) temp;
		
		int temp2 = pri[a];
		pri[a] = pri[b];
		pri[b] = temp2;
	}

	/** Puts an element onto the queue
     *@param e element to put on the queue
     *@param p priority of the element to be added
     *@throws OverflowException if the heap is full
     */
	@Override
	public void put(E e, int p) {
		// TODO Auto-generated method stub
		if (size >= max) {
			throw new OverflowException();
		}
		else {
			if (size == 0) {
				size++;
				// Put elements at idx 0
				data[tail] = e;
				pri[tail] = p; 
				tail++;
				
			}
			else {
				// Put them at the end
				size++;
				data[tail] = e;
				pri[tail] = p;
				this.up(tail);
				tail++;
			}
		}
	}
	
	/** Gets the next element from the queue
     *@return the first element from the queue
     *@throws UnderflowException if getting from an empty queue
     */
	@Override
	public E get() {
		// TODO Auto-generated method stub
		if (size == 0) {
			throw new UnderflowException();
		}
		else {
			size--;
			tail--;
			E root = data[0];
			int priority = pri[0];
			data[0] = data[tail];
			pri[0] = pri[tail];
			down(0);
			return root;
		}
	}
	
	/**
	 * Reorders the heap after insert
	 * @param idx index to begin reordering
	 */
	public void up(int idx) {
		int parent = parent(idx);
		int current = idx;
		while (current > 0 && pri[parent] < pri[current]) {
			swap(current, parent);
			current = parent;
			parent = parent/2;
		}
	}
	/**
	 * Reorders the heap after delete 
	 * @param idx index to begin reordering
	 */
	public void down(int idx) {
		int biggest = idx;
		int left = left(idx);
		int right = right(idx);
		
		if (left < size && pri[biggest] < pri[left]) {
			biggest = left;
		}
		if (right < size && pri[biggest] < pri[right]) {
			biggest = right;
		}
		if (biggest != idx) {
			swap(idx, biggest);
			down(biggest);
		}
	}
	 /** First element of the queue without removing it
     *@return the first element from the queue
     *@throws UnderflowException if peeking an empty queue
     */
	@Override
	public E peek() {
		// TODO Auto-generated method stub
		if (size == 0) {
			throw new UnderflowException();
		}
		else {
			return data[0];
		}
	}

	 /** Number of elements currently in the queue
     *@return the number of elements in the queue
     */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	/** Changes the maximum size of the heap
     *  <p>Increasing the heap size is always safe. Decreasing the heap size may
     *  has the potential to cause data loss. If resize is called with a new size
     *  that is less than the current size, the resize request should be ignored
     *  and an OverflowException should be thrown.
     *@param s new maximum size
     *@throws OverflowException if the new size is less than the current size
     */
	@Override
	public void resize(int s) {
		// TODO Auto-generated method stub
		if (s < data.length) {
			throw new OverflowException();
		}
		else {
			E[] newData = (E[]) new Object[s];
			Integer[] newPri = new Integer[s];
			for (int i = 0; i < data.length; i++) {
				newData[i] = data[i];
				
			}
			for (int i = 0; i < pri.length; i++) {
				newPri[i] = pri[i];
			}
			max = s;
			data = newData;
			pri = newPri;
			up(0);
		}
	}

}
