/**
 * The MyArrayList class is the implementation of an array list of integers.
 *
 * The data in the list will be stored in an array, and the basic ArrayList methods
 * add, remove, set, get, and size will be implemented, as well as the additional
 * methods indexOf, clear, and contains.
 *
 * Students should not, obviously, use the ArrayList Java library class. The choices
 * that you make regarding the management of the <code>list</code> array will influence
 * how the methods are implements - you may add any additional instance fields as desired.
 * The choice that has been made for you is that the default constructor should give an
 * initial capacity of ten elements. Be sure to avoid the IndexOutOfBoundsException.
 */

public class MyArrayList
{
    private int[] list;

    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public MyArrayList()
    {
        list = new int[10];
        // your code here
    }

    /**
     * Appends the specified integer to the end of the list.
     * @param value int to be appended to this list
     */
    public void add(int value)
    {
        // your code here
    }

    /**
     * Inserts the specified integer at the specified position in this list.
     * Shifts the element currently in that position (if any) and any subsequent
     * elements to the right (adding one to their indices).
     * @pre index is within bounds, that is 0 <= index <= list.size()
     * @param index index at which the specified element is to be inserted
     * @param value int to be inserted
     */
    public void add(int index, int value)
    {
        // your code here
    }

    /**
     * Removes the integer at the specified position in this list. Shifts any
     * subsequent integers to the left (subtracts one from their indices).
     * @pre index is within bounds, that is 0 <= index < list.size()
     * @param index the index of the element to remove
     */
    public void remove(int index)
    {
        // your code here
    }

    /**
     * Returns the integer at the specified position in this list.
     * @pre index is within bounds, that is 0 <= index < list.size()
     * @param index index of the element to return
     * @return the integer at the specified position in this list
     */
    public int get(int index)
    {
        // REPLACE the code here
        return 0;
    }

    /**
     * Replaces the integer at the specified position in this list with the
     * specified integer.
     * @pre index is within bounds, that is 0 <= index < list.size()
     * @param index index of the integer to replace
     * @param value integer to be stored at the specified position
     */
    public void set(int index, int value)
    {
        // your code here
    }

    /**
     * Returns the number of integers in this list.
     * @return the number of integers in this list
     */
    public int size()
    {
        // REPLACE the code here
        return 0;
    }

    /**
     * Returns the index of the first occurrence of the specified integer in this list,
     * or -1 if this list does not contain the integer.
     * @param value integer to search for
     * @return the index of the first occurrence of the specified integer in this list,
     * or -1 if this list does not contain the integer
     */
    public int indexOf(int value)
    {
        // REPLACE the code here
        return 0;
    }

    /**
     * Removes all of the elements from this list. The list will be empty after this
     * call returns.
     */
    public void clear()
    {
        // your code here
    }

    /**
     * Returns <code>true</code> if this list contains the specified integer.
     * @param value integer whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    public boolean contains(int value)
    {
        // your code here
        return false;
    }
}
