PREAMBLE:
This exercise is about creating your own generic iterable and collection 
using the Iterator<E> and Collection<E> interfaces.
You are implementing your own collection called DoublingArray, a collection
which stores data in an array which doubles in size as it becomes too small. 
A template has been created called DoublingArray.java initially implementing 
the Iterable interface. In this class you can also find the private Iterator
class MyIterator and empty methods which all should be implemented. The
fields and structure should not need alteration.
After each task you should try your implemented methods in a main method to
make sure they work as expected. Make sure exceptions are thrown as they should.
Adding javadoc to methods using the "/**" notation is recommended.

TODO:
1: Locate the Iterator class in the end of the DoublingArray.java file.
Implement the hasNext() and next() methods as well as the iterator() method so
it returns an instance of your iterator. Casting will be required.
DoublingArray should now be a functional Iterable! (remove optional,dependent)
---OBS--- Implementation requirements for each method can be found here:
Iterable: https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html
Iterator: https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

2: Now it is time to turn this into a collection and implementing the required
methods. Step by step do the following:
-Change DoublingArray so that it implements the Collection<E> interface.
-Implement the add, clear, contains, isEmpty, remove, size, toArray methods.
-Implement the addAll, containsAll, removeAll, retainAll methods.
DoublingArray should now be a functional Collection!
---OBS--- Implementation requirements for each method can be found here:
https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html

(EXTRA)
3: Create a new class called DoublingArrayList.java which extends
DoublingArray and implements the List<E> interface instead. Add and implement 
the necessary methods required by the interface.
Well done, you have implemented your own list!
---OBS--- Implementation requirements for each method can be found here:
https://docs.oracle.com/javase/8/docs/api/java/util/List.html

(EXTRA)
4: Now when you have your DoublingArrayList it is time to implement your own
DoublingSet! In the same manner as with the DoublingArrayList, create a new 
class called DoublingArraySet extending your DoublingArray collection as well
as implementing the Set<E> interface. Add and implement the necessary methods 
required by the interface.
---OBS--- Implementation requirements for each method can be found here:
https://docs.oracle.com/javase/8/docs/api/java/util/Set.html

FEEDBACK:
If you want feedback on your implementation gather all source files (.java files)
in one repository and zip (compress) it. Send it in the #code-dump channel on Slack
and request feedback, where Johan and coursemates can review the code. If you feel
uncomfortable showing your code to others, send it in a PM to Johan over Slack.
(Time constraints limit the extent of my feedback.) ​When requesting feedback,
please consider providing feedback to at least one other coursemate; reviewing code
increases your own understanding.