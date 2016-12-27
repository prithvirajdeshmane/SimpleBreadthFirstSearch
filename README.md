# SimpleBreadthFirstSearch

This is a code for running a simple Breadth First Search algorithm.

The input is provided in a very simple manner in App.java where a vertices are first created and then references to vertices are added to the adjacency list of each vertex. 

Pseudo algorithm
================
1. Start traversing from the root of the graph/tree
2. Set root visited=true
3. Add root to the queue (FIFO implementation)
4. While queue is not empty
  4a. Remove a vertex 'v' from the queue
  4b. Print data in v 
  4c. For each vertex 'va' in adjacency list of 'v'
    4c.i. Set va visited=true
    4c.ii. Add vertex va to queue
