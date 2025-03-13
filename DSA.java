public class DSA {

    // ADT Abstract data type 
    // ADT is a collection of data and operations that manipulate those data
    public interface Stack<T> {
        // push an item onto the stack
        void push(T item);
        // remove and return the top item from the stack
        T pop();
        // check if the stack is empty
        boolean isEmpty();
        // get the number of items in the stack
        int size();
        // return the top item from the stack without removing it
        T peek();
        // clear all items from the stack
        void clear();
        // check if the stack contains a specific item
        boolean contains(T item);
        // convert the stack to an array
        T[] toArray();
        // get the minimum item in the stack
        T getMin();
        // get the maximum item in the stack
        
    
}
