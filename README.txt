This directory contains the java source files for a project to implement priority queues, also known as heaps. Heaps use a clever encoding of a binary tree inside an array, guaranteeing put and get operations complete in O(log n) time as long as the backing array does not need to be extended.

You must complete 2 implementations...
MinHeap - A priority queue where the lowest priority value is returned first
MaxHeap - A priority queue where the highest priority value is returned first

These implementations will be almost identical. One strategy would be to implement one of the heaps, then copy and modify the source to get the other heap. Another, more architecturally complex, strategy would be into introduce a third class that contains most of the heap logic and then have the MinHeap and MaxHeap extend or delegate to the third class.

To generate the javadoc for this project:
javadoc -d doc

Files:
README.txt  - This text file
IHeap.java  - An interface for classes that implement heaps
UnderflowException.java - thrown if get/peek are used on an empty heap
OverflowException.java  - thrown if the operation would exceed the size
Test.java   - A program showing how the priority queue constructors will be called
MinHeap.java - implementation of min heap
MaxHeap.java - implementation of max heap
