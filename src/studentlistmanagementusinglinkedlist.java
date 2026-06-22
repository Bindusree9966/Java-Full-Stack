import java.util.*;

class Student {
    String name;
    int age, grade;

    Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class studentlistmanagementusinglinkedlist {

    static LinkedList<Student> list = new LinkedList<>();

    static void addStudent(Student s) { list.add(s); }

    static void removeStudent(String name) {
        list.removeIf(s -> s.name.equals(name));
    }

    static void removeByAge(int age) {
        list.removeIf(s -> s.age == age);
    }

    static boolean containsStudent(String name) {
        for (Student s : list)
            if (s.name.equals(name))
                return true;
        return false;
    }

    static boolean isEmpty() {
        return list.isEmpty();
    }

    static void printNames() {
        System.out.println("Student Names:");
        for (Student s : list)
            System.out.println(s.name);
    }

    static int getSize() {
        return list.size();
    }

    static void increaseCapacity(int n) {
        System.out.println("Capacity increased by " + n);
    }

    static void iterateStudents() {
        for (Student s : list)
            System.out.println(s.name + " (" + s.age + ")");
    }

    static String[] toArrayNames() {
        String arr[] = new String[list.size()];
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i).name;
        return arr;
    }

    static Iterator<Student> getIterator() {
        return list.iterator();
    }

    static Iterator<Student> getDescendingIterator() {
        return list.descendingIterator();
    }

    static void sortByName() {
        list.sort((a, b) -> a.name.compareTo(b.name));
    }

    static void sortByAge() {
        list.sort((a, b) -> a.age - b.age);
    }

    static void updateAge(String name, int age) {
        for (Student s : list)
            if (s.name.equals(name))
                s.age = age;
    }

    static void updateGrade(String name, int grade) {
        for (Student s : list)
            if (s.name.equals(name))
                s.grade = grade;
    }

    static void clearList() {
        list.clear();
    }

    static void printStudents() {
        for (Student s : list)
            System.out.println("Name: " + s.name +
                    ", Age: " + s.age +
                    ", Grade: " + s.grade);
    }

    public static void main(String[] args) {

        addStudent(new Student("Alice", 20, 85));
        addStudent(new Student("Bob", 22, 90));
        addStudent(new Student("Charlie", 20, 70));
        addStudent(new Student("Diana", 23, 88));

        printNames();

        System.out.println("\nContains Bob? " + containsStudent("Bob"));
        System.out.println("Contains Eve? " + containsStudent("Eve"));

        System.out.println("\nAll Students:");
        printStudents();

        System.out.println("\nSorting by Name:");
        sortByName();
        printStudents();

        System.out.println("\nSorting by Age:");
        sortByAge();
        printStudents();

        System.out.println("\nUpdating Alice's age to 21 and grade to 92...");
        updateAge("Alice", 21);
        updateGrade("Alice", 92);
        printStudents();

        System.out.println("\nRemoving Bob...");
        removeStudent("Bob");

        System.out.println("Removing students with age 20...");
        removeByAge(20);

        System.out.println("\nStudents after removals:");
        printStudents();

        System.out.println("\nTotal students: " + getSize());

        System.out.println("\nStudents as Array:");
        for (String s : toArrayNames())
            System.out.println(s);

        System.out.println("\nDescending Order Traversal:");
        Iterator<Student> it = getDescendingIterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.name + " (" + s.age + ")");
        }

        System.out.println("\nClearing the list...");
        clearList();

        System.out.println("Is list empty? " + isEmpty());
    }
}