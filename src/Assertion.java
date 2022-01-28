import java.util.ArrayList;

// ***  MyArrayList is limited to 100 elements.  ***
class MyArrayList<E> extends ArrayList<E> {
    public MyArrayList() {
        // assert postcondition
        assert size() == 0;
    }
    @Override
    public int size() {
        super.size();
        // assert postcondition
        assert super.size() <= 100;
        //
        // code
        return super.size();
    }
    // Insert e as a new first element to mal
    public void insertFirst(E e) {
        // assert precondition
        assert size() < 100;
        // code
        super.add(0, e);
        // assert postcondition
        assert get(0).equals(e);
    }
    // Insert e as a new last element
    public void insertLast(E e) {
        // assert precondition
        assert size() < 100;
        // code
        super.add(e);
        // assert postcondition
        assert get(size() -1 ).equals(e);
    }
    // Delete my first element
    public void deleteFirst() {
        // assert precondition
        assert size() > 0;
        // code
        super.remove(0);
        // assert postcondition
        assert size() == size() - 1;
    }
    // Delete my last element
    public void deleteLast() {
        // assert precondition
        assert size() > 0;
        // code
        super.remove(size() - 1);
        // assert postcondition
        assert size() == size() - 1;
    }
    public void show() {
        for (E e : this) {
            System.out.println(e);
        }
    }
}
class Student {
    // code
    int num;
    String name;

    public Student(int num, String name)
    {
        this.num = num;
        this.name = name;
    }
}

class MyProg {
    public static void main(String[] args) {
        MyArrayList<Student> mal = new MyArrayList<>();
        mal.insertFirst(new Student(1, "John"));
        mal.insertFirst(new Student(2, "Mary"));
        mal.insertLast(new Student(3, "Mike"));
        mal.show();
        mal.deleteLast();
        mal.show();
        mal.deleteFirst();
        mal.show();
    }
}