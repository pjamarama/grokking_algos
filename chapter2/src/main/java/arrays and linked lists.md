When we use arrays we can face memory problems like:
- no free memory cells in a row available for an array of a given type, we have to move some occupied cells to free space for the array.
- a certain amount of memory reserved, but the array uses a small portion of that (the rest is wasted).

**Reading and Insertion**
Arrays:
Reading performed as O(1)
Insertion performed as O(n)

Linked lists:
Reading performed as O(n)
Insertion performed as O(1)

Frequent inserts and rare reads is a use case for a LL. If you read all elements one by one, it is also a legitimate case for a LL.

**Insertion in the middle**
LL are also better if you want to insert an element in the middle of a list. You just point the links to and from the new element. With the array you have to move the rest of the array after the insertion. And it may occur there's no room in the array left, and you have to create a new one bigger size. 

**Deletions**
Insertions and deletions of the last or first element in LL are of constant time O(1). For an array they are O(n) because you have to move elements to get free space when inserting and move elements back when deleting to avoid wasting memory space.

Arrays user more frequently because they allow random access to elements. LLs provide sequential access.