package creationOfArrayList;

public interface MyList {
    void add(String adding);

    void remove(int index);

    void remove(String element);

    void clear();

    boolean contains(String element);

    String get(int index);

    String get(String element);

    int capacity();

    boolean isEmpty();
}
