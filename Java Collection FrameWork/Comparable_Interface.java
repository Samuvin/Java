import java.util.TreeSet;

/**
 * Represents a point in a 2D space with x and y coordinates.
 * Implements Comparable to define natural ordering based on the x-coordinate.
 */
class Point implements Comparable<Point> {
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(x=" + x + ", y=" + y + ")";
    }

    /**
     * Compares this Point with another Point for order based on the x-coordinate.
     * If x-coordinates are equal, compares based on the y-coordinate.
     *  p the Point to compare with.
     *  negative integer, zero, or positive integer as this Point
     *  is less than, equal to, or greater than the specified Point.
     */
    @Override
    public int compareTo(Point p) {
        // Compare based on x coordinate
        
        if (this.x < p.x) {
            return -1;
        } else if (this.x > p.x) {
            return 1;
        } else {
            // If x coordinates are equal, compare based on y coordinate
            return Integer.compare(this.y, p.y); // Handles y comparison
        }
    }
}

/**
 * Demonstrates the usage of the Comparable interface with a TreeSet of Point objects.
 */
public class Comparable_Interface {
    public static void main(String[] args) {
        // Create a TreeSet to hold Point objects
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1, 1));
        ts.add(new Point(2, 1));
        ts.add(new Point(3, 4));
        ts.add(new Point(2, 2)); // Point with the same x as (2, 1) but different y
        ts.add(new Point(1, 2)); // Point with the same x as (1, 1) but different y

        // Print the sorted points
        System.out.println("Sorted Points in TreeSet:");
        for (Point p : ts) {
            System.out.println(p);
        }
    }
}





// //need to override comparable to compare out own class
// //if both are equal return 0
// //if first is less than second return -1
// //if first is greater than second return 1


// //Treeset is Sorted set java does not know how to sort the points so we have to define a comparable
// //we have to define how to compare two point
// import java.util.TreeSet;

// class Point implements Comparable
// {
//     int x;
//     int y;
//     Point(int x,int y)
//     {
//         this.x=x;
//         this.y=y;
//     }
//     @Override
//     public String toString()
//     {
//         return "(x="+x+" y="+y+")";
//     }
//     @Override
//     public int compareTo(Object o)
//     {
//         //Parameter should be object this is the signature of the comparable
//         Point p=(Point)o;
//         if (this.x < p.x) {
//             return -1;
//         } else if (this.x > p.x) {
//             return 1;
//         }
//         return 0;
//     }
// }

// public class Comparable_Interface {
//     public static void main(String[] args) {
//         //We can compare objects we have to override the comparable interface
//         TreeSet<Point> ts=new TreeSet<>();
//         ts.add(new Point(1,1));
//         ts.add(new Point(2,1));
//         ts.add(new Point(3,4));
//         System.out.println(ts);
//     }
// }


// import java.util.*;

// class Student implements Comparable<Student> {
//     String name;
//     int grade;

//     public Student(String name, int grade) {
//         this.name = name;
//         this.grade = grade;
//     }

//     @Override
//     public int compareTo(Student other) {
//         if (this.grade != other.grade) {
//             return Integer.compare(this.grade, other.grade); // Sort by grade ascending
//         }
//         return this.name.compareTo(other.name); // If grades are the same, sort by name
//     }

//     @Override
//     public String toString() {
//         return name + ": " + grade;
//     }
// }

// public class StudentGradeSorting {
//     public static void main(String[] args) {
//         List<Student> students = new ArrayList<>();
//         students.add(new Student("Alice", 85));
//         students.add(new Student("Bob", 92));
//         students.add(new Student("Charlie", 85));
//         students.add(new Student("David", 78));

//         Collections.sort(students);

//         System.out.println("Sorted Students by Grades:");
//         for (Student student : students) {
//             System.out.println(student);
//         }
//     }
// }
