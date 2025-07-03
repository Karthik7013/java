import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("one"); // add new element in the arraylist
        l.set(0, "two"); // update the element in the collection by the index
        l.get(0); // get element by index
        l.indexOf("one"); // index of an element
        int x = l.size(); // length of the collection
        l.contains("one"); // check for a element in the collection return true if exists else return false
        l.forEach((String t) -> System.out.println(t)); // iterate over a collection
        l.remove(0); // remove element at an index -> return removed element from the collection
        l.clear(); // clear all the elements in the collection
        l.isEmpty(); // return true if collection is empty
        System.out.println(x);
    }
}
