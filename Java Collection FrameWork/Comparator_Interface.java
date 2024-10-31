import java.util.Arrays;
import java.util.Comparator;

// 1. Basic Comparators
class AscendingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2); // Natural ordering (ascending)
    }
}

class DescendingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i2.compareTo(i1); // Reverse order (descending)
    }
}

// 2. Complex Object for Sorting
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// 3. Comparators for Complex Objects
class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age); // Sort by age
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name); // Sort by name
    }
}

public class Comparator_Interface 
{
    public static void main(String[] args) {
        // 4. Basic Integer Sorting
        Integer[] arr = {4, 2, 3, 1, 5};

        // Sorting in ascending order
        Arrays.sort(arr, new AscendingComparator());
        System.out.println("Sorted in ascending order: " + Arrays.toString(arr));

        // Sorting in descending order
        Arrays.sort(arr, new DescendingComparator());
        System.out.println("Sorted in descending order: " + Arrays.toString(arr));

        // 5. Using Lambda Expressions for Sorting
        Arrays.sort(arr, (i1, i2) -> i1.compareTo(i2)); // Ascending
        System.out.println("Sorted in ascending order (lambda): " + Arrays.toString(arr));

        Arrays.sort(arr, (i1, i2) -> i2.compareTo(i1)); // Descending
        System.out.println("Sorted in descending order (lambda): " + Arrays.toString(arr));

        // 6. Sorting Complex Objects
        Person[] people = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        };

        // Sorting by age
        Arrays.sort(people, new AgeComparator());
        System.out.println("Sorted by age:");
        for (Person p : people) {
            System.out.println(p.name + " (" + p.age + ")");
        }

        // Sorting by name
        Arrays.sort(people, new NameComparator());
        System.out.println("\nSorted by name:");
        for (Person p : people) {
            System.out.println(p.name + " (" + p.age + ")");
        }

        // 7. Chaining Comparators
        Arrays.sort(people, Comparator.comparingInt((Person p) -> p.age)
                                       .thenComparing(p -> p.name));
        System.out.println("\nSorted by age, then name:");
        for (Person p : people) {
            System.out.println(p.name + " (" + p.age + ")");
        }

        // 8. Sorting Points by Distance (Custom Comparator)
        class Point {
            int x, y;

            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        Point[] points = {
            new Point(3, 4),
            new Point(1, 1),
            new Point(0, 0),
            new Point(5, 12)
        };

        // Sorting points by distance from origin
        Arrays.sort(points, (p1, p2) -> {
            double dist1 = Math.sqrt(p1.x * p1.x + p1.y * p1.y);
            double dist2 = Math.sqrt(p2.x * p2.x + p2.y * p2.y);
            return Double.compare(dist1, dist2);
        });

        System.out.println("\nSorted points by distance from origin:");
        for (Point p : points) {
            System.out.println("Point(" + p.x + ", " + p.y + ")");
        }

        // 9. Sorting Strings by Length
        String[] words = {"apple", "banana", "kiwi", "strawberry"};
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println("\nSorted words by length:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. Sorting Students by Grades and Names
        class Student {
            String name;
            int grade;

            Student(String name, int grade) {
                this.name = name;
                this.grade = grade;
            }
        }

        Student[] students = {
            new Student("Alice", 90),
            new Student("Bob", 85),
            new Student("Charlie", 90),
            new Student("David", 70)
        };

        // Sorting by grades, then names
        Arrays.sort(students, Comparator.comparingInt((Student s) -> s.grade)
                                          .thenComparing(s -> s.name));
        System.out.println("\nSorted students by grades, then names:");
        for (Student s : students) {
            System.out.println(s.name + " (" + s.grade + ")");
        }
    }
}
