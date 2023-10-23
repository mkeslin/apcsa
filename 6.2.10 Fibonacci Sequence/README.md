The Fibonacci sequence is the sequence of numbers:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, …

The next number is found by adding up the two numbers before it.

For example, the 2 is found by adding the two numbers before it (1+1). The 3 is found by adding the two numbers before it (1+2). The 5 is found by adding the two numbers before it (2+3), and so on! Each number in the sequence is called a term.

In this exercise, you will need to:

1. Create the array ```int[] sequence``` that holds the values of the first 15 terms of the Fibonacci sequence. Think carefully about what happens to the index when iterating through the loop to fill this array. Read the Fibonacci description above to help!
2. Then print out the sequence of numbers separated by a space.
3. Finally, create a method ```findNextElement``` that returns the element that comes after the parameter value. If the element doesn’t exist, return -1.

### Sample output:
```
The first 15 elements in the Fibonacci sequence are: 
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 
The element after 21 is 34
The element after 233 is 377
The element after 377 is -1
```

**Hint:** You will need to use several loops: One to fill the array, one to print the array, and one to traverse the array!