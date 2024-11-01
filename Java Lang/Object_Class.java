
/*
Java Object Class
The Object class is the parent class of all classes in Java. 
Every class in Java directly or indirectly inherits from the Object class. 
This means that all classes, including those we define, have access to certain key methods defined in Object.

Key Methods and Features in Object Class

toString()

Returns a string representation of the object.
Called automatically when an object is printed (e.g., System.out.println(object)) since println calls toString() internally.
Customizable by overriding it in your class.

equals(Object obj)
Checks if two objects are "equal".
By default, it compares object references (i.e., whether both references point to the same object).
Often overridden to compare actual content or attributes of the objects.

hashCode()
Returns a unique integer hash code for the object.
The hash code is used in collections like HashMap and HashSet.
It can be overridden to generate custom hash codes based on object properties, and should be consistent with equals().
Every object in Java has a hash code, created by Java, which helps in object identification.

clone()
Creates a copy of the object.
To enable cloning, a class must implement the Cloneable interface.
This method may throw CloneNotSupportedException if cloning is not allowed.
finalize()

Called by the garbage collector before an object is removed from memory.
Used to release resources or perform cleanup tasks before object destruction.
Note: This method is not commonly used due to performance and reliability concerns. The preferred way to manage resources is through try-with-resources or implementing AutoCloseable.
Multithreading Methods: wait(), notify(), notifyAll()

These methods help in coordinating threads that are sharing resources.
wait(): Pauses the thread until another thread calls notify() or notifyAll() on the same object.
notify(): Wakes up one waiting thread on the object.
notifyAll(): Wakes up all threads waiting on the object.
Usage: These methods must be called within a synchronized context to avoid conflicts.
Additional Notes
Parent Class: Object is known as the "mother" of all classes because every class inherits it.
Automatic Method Calls:
toString(): Called automatically by System.out.println() and other string-conversion methods.
Unique Identification: Each object in Java has a unique memory location (address) which contributes to its hashCode.

*/




// Custom class that demonstrates all Object class methods
class MyObject implements Cloneable {

    private int id;
    private String name;

    public MyObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 1. Override toString(): Returns a string representation of the object
    @Override
    public String toString() {
        return "MyObject [id=" + id + ", name=" + name + "]";
    }

    // 2. Override equals(Object obj): Checks if two objects are equal based on their properties
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        MyObject other = (MyObject) obj;
        return id == other.id && name.equals(other.name);
    }

    // 3. Override hashCode(): Provides a unique hash code for the object
    @Override
    public int hashCode() {
        int result = Integer.hashCode(id);
        result = 31 * result + name.hashCode();
        return result;
    }

    // 4. Implement clone(): Creates a copy of the object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // 5. Override finalize(): Called by the garbage collector before collecting the object
    @Override
    protected void finalize() throws Throwable {
        System.out.println("MyObject with id=" + id + " is being garbage collected.");
        super.finalize();
    }
}

// Testing all methods
public class Object_Class {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        // Testing toString() method
        MyObject obj1 = new MyObject(1, "TestObject");
        System.out.println("toString(): " + obj1);

        // Testing equals() method
        MyObject obj2 = new MyObject(1, "TestObject");
        MyObject obj3 = new MyObject(2, "DifferentObject");
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // true
        System.out.println("obj1.equals(obj3): " + obj1.equals(obj3)); // false

        // Testing hashCode() method
        System.out.println("obj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
        System.out.println("obj3.hashCode(): " + obj3.hashCode());

        // Testing clone() method
        MyObject obj4 = (MyObject) obj1.clone();
        System.out.println("Cloned object (obj4): " + obj4);

        // Testing finalize() method (called by GC, may not run immediately)
        obj1 = null;
        System.gc(); // Requests garbage collection; finalize() may be called for obj1

    }
}
