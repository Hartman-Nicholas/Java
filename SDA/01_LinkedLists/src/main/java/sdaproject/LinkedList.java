package sdaproject;

// a "box" in our previous picture
class Node {
    // field 1: the data
    // in our case just an integer
    int elem;
    // field 2: the reference to the next node
    Node next;
    Node(int num) {
        this.elem = num;
        this.next = null;
    }
}

class IndexOutOfBounds extends Exception {

}

public class LinkedList {


    private Node first = null;

    public void add(int num) {
        // int num is available!

        // step 1: is the linked list still empty?
        if (first == null) {
            // in this case, the linked list is empty
            first = new Node(num);
        } else {
            // in this case, the linked list is *not* empty
            // this means, first != null

            // step 2: find the last node

            // Key: introduce a temporary variable!
            // we can then update this temporary variable,
            // without changing "first"!
            // important, since "first" should not be changed!
            Node current = first;
            while (current.next != null) { // current is not the last node!
                current = current.next;
            }
            // what do we know about "current"?
            // current.next == null
            // AWESOME!
            // it means, "current" is the last node!

            // step 3: create a new node with the given int "num"

            // step 4: change the reference of the last node to
            // point to the new node
            current.next = new Node(num);
        }

    }

    // useful for testing!
    public String toString() {
        // goal is to return a string like this:
        // "LinkedList(5,2,10)"

        StringBuilder builder = new StringBuilder();

        // call methods on "builder" to add strings

        builder.append("LinkedList(");
        // append strings for each integer in the list

        try {
            Node current = first;
            // treat first element specially:
            builder.append(current.elem);

            while (current.next != null) {
                current = current.next;
                builder.append(",").append(current.elem);
            }
            // current.next == null
            // we have already appended the last num!

        } catch (NullPointerException ignored) {
        }


        builder.append(")");
        return builder.toString();
    }

    public int search(int num) {
        if (first == null) {
            return -1;
        } else {
            Node current = first;
            int count = 0;
            try {
                while (num != current.elem) {
                    current = current.next;
                    count++;
                }
                return count;
            } catch (NullPointerException e) {
                return -1;
            }
        }
    }

    // This needs to throw an exception as it returns an interger and -1 could be confusing as it could be the
    // element or a negative value.

    public int getElem(int index) {
        if (first == null) {
            return -1;
        }
        try {
            Node current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.elem;
        } catch (NullPointerException e) {
            return -1;
        }
    }

    public Node getNode (int index) {
        if (first == null) {
            return null;
        }
        try {
            Node current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public int size() {

        try {
            Node current = first;
            int count = 1;
            while (current.next != null) {
                current = current.next;
                count++;
            }
            return count;
        } catch (NullPointerException ignored) {
            return 0;
        }
    }


    public boolean removeItem(int elem) {
        if (first == null) return false;
        if (first.elem == elem) {
            first = first.next;
            return true;
        }
        Node current = first;
        while (current.next != null) {
            if (current.next.elem == elem) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }



    public boolean remove (int num) {
        int index = search(num);

            if (index < 0) {
                return false;
            } else if (index == 0 && size() >1) {
               first = getNode(search(num)+1);
               return true;
            } else if (index == 0 && size() == 1){
                first = null;
                return true;
            }
            else {
                Node previousNode = getNode(index - 1);
                if (getNode(index + 1) == null) {
                    previousNode.next = null;
                } else {
                    previousNode.next = getNode(index + 1);
                }
                return true;
            }
    }
}

