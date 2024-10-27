/*
Create a Circular List
A circular list is of finite size, but can infititely be asked for its previous and next elements. This is because it acts like it is joined at the ends and loops around.
For example, imagine a CircularList of [1, 2, 3, 4]. Five invocations of next() in a row should return 1, 2, 3, 4 and then 1 again. At this point, five invocations of prev() in a row should return 4, 3, 2, 1 and then 4 again.
Your CircularList is created by passing a vargargs parameter in, e.g. new CircularList(1, 2, 3). Your list constructor/init code should throw an Exception if nothing is passed in.
*/

public class CircularList<T> {

    private final T[] elements;
    private int currentIndex = -1;

    public CircularList(final T... elements) {
        if (elements == null || elements.length == 0) {
            throw new IllegalArgumentException("No elements provided");
        }
        this.elements = elements;
    }

    public T next() {
        currentIndex = (currentIndex + 1) % elements.length;
        return elements[currentIndex];
    }

    public T prev() {
        if (currentIndex == -1) {
            currentIndex = elements.length - 1;
        } else {
            currentIndex = (currentIndex - 1 + elements.length) % elements.length;
        }
        return elements[currentIndex];
    }
}
