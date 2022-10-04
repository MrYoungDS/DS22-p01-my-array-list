# DS22-p01-my-array-list

For this assignment you will implement an array list of integers.

We will talk more about lists, variations on lists, and implementations of lists, in some detail. But we will start with
a *reasonably* simple exercise, implementing a partial version of ArrayList<Integer>. Our array list will have little-i
<code>int</code>s (as opposed to big-I <code>Integer</code>s), and will have the core functionality (but not all the
bells and whistles from ArrayList).

A skeleton is provided for you, and you will need to adhere to the public interface given there. We will ingnore the very
real risk of an <code>OutOfBoundsException</code> and you will see preconditions stating that we expect indices to be
in-bounds. You are welcome to provide additional private fields and methods.

In particular, note that an array of <code>int</code>s initializes every entry to zero, and that is a possible value in 
the list, so you will likely want to add an additional instance field to keep track of the size of the list, depending 
on how you manage the array. You probably do not want to create a new array every time an element is added or deleted, 
right?
