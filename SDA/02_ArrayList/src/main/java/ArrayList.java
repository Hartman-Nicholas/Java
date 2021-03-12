
public class ArrayList {

    private int [] array = new int[0];

    public void add (int num) {

        int [] updatedArray = new int[array.length+1];
        System.arraycopy(array,0,updatedArray,0, array.length);
        updatedArray [array.length] = num;

        this.array = updatedArray;
    }

    public int get (int index) throws ArrayIndexOutOfBoundsException {
        return array [index];
    }

    public int getSize () {
        return array.length;
    }

    public void remove (int index) throws ArrayIndexOutOfBoundsException {
        if (array.length == 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        int[] updatedArray = new int[array.length-1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                updatedArray[j++] = array[i];
            }
        }
        this.array = updatedArray;
    }

    public int find (int num) {
        if (array.length == 0){
            return -1;
        }
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == num) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public ArrayList subList (int fromIndex, int toIndex) throws ArrayIndexOutOfBoundsException {
        ArrayList subListArray = new ArrayList();
        for (;fromIndex <= toIndex; fromIndex++) {
            subListArray.add(array[fromIndex]);
        }
        return subListArray;
    }

    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("ArrayList(");
        try {

            builder.append(array[0]);

            for (int i = 1; i < array.length; i++) {
                builder.append(",").append(array[i]);
            }
        }catch (ArrayIndexOutOfBoundsException ignored) {

        }

        builder.append(")");
        return builder.toString();
    }

}
