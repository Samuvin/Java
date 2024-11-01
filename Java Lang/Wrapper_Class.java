public class Wrapper_Class 
{

/*
Primitive Data Types
In Java, certain data types are considered primitive, 
meaning they are basic, built-in types directly handled by the compiler 
for performance efficiency:

Examples: int, float, double, char, byte, short, long, boolean
These data types are not objects and don't have methods or properties 
like classes do. They are considered simpler, more efficient 
representations.

Object-Oriented Nature of Java
Java is an object-oriented programming (OOP) language where everything 
should ideally be an object to fit into the OOP paradigm. 
However, primitives are not objects. To address this gap, 
Java introduces Wrapper Classes.

Wrapper Classes
Wrapper classes in java.lang provide an "object wrapper" around each 
primitive data type, allowing them to be used as objects. 
These classes "wrap" the primitive types so they can be treated as 
objects when needed, adding functionality, such as methods to convert or 
manipulate these values.

                            Object   <- parent class of all classes
                                |
                -------------------------------------
                |               |                  |
            Number          Character           Boolean
                |
        ----------------------------------------
        |       |       |      |      |        |
      Byte   Short   Integer  Long   Float   Double


*/
    public static void main(String[] args) {
        // Integer Wrapper Class
        Integer integerObject = Integer.valueOf(19);
        Integer integerValue1 = Integer.valueOf(10);
        Integer integerValue2 = 10; // Auto-boxing
        int primitiveInt = integerValue1.intValue(); // Unboxing
        int intComparison = integerValue1.compareTo(integerValue2); // Comparing Integer values
        boolean intEquals = integerValue1.equals(integerValue2); // Checking equality
        int intHash = integerValue1.hashCode(); // Hash code of Integer
        String intAsString = integerValue1.toString(); // Converting Integer to String
        int parsedInt = Integer.parseInt("123"); // Parsing String to int

        // Byte Wrapper Class
        Byte byteValue1 = 12; // Auto-boxing
        Byte byteValue2 = Byte.valueOf("12");
        byte primitiveByte = 12; // Primitive byte
        Byte byteFromPrimitive = Byte.valueOf(primitiveByte);
        byte unboxedByte = byteValue1.byteValue(); // Unboxing to byte
        int byteComparison = byteValue1.compareTo(byteValue2); // Comparing Byte values
        boolean byteEquals = byteValue1.equals(byteValue2); // Checking equality
        int byteHash = byteValue1.hashCode(); // Hash code of Byte
        String byteAsString = byteValue1.toString(); // Converting Byte to String
        byte parsedByte = Byte.parseByte("12"); // Parsing String to byte

        // Short Wrapper Class
        Short shortValue1 = 21; // Auto-boxing
        Short shortValue2 = Short.valueOf("43");
        short primitiveShort = 34; // Primitive short
        Short shortFromPrimitive = Short.valueOf(primitiveShort);
        short unboxedShort = shortValue1.shortValue(); // Unboxing to short
        int shortComparison = shortValue1.compareTo(shortValue2); // Comparing Short values
        boolean shortEquals = shortValue1.equals(shortValue2); // Checking equality
        int shortHash = shortValue1.hashCode(); // Hash code of Short
        String shortAsString = shortValue1.toString(); // Converting Short to String
        short parsedShort = Short.parseShort("123"); // Parsing String to short

        // Float Wrapper Class
        Float floatObject1 = 12.3f;
        Float floatObject2 = Float.valueOf("23.4");
        Float floatFromPrimitive = Float.valueOf(floatObject1);
        float unboxedFloat = floatObject1.floatValue(); // Unboxing to float
        int floatComparison = floatObject1.compareTo(floatObject2); // Comparing Float values
        boolean floatEquals = floatObject1.equals(floatObject2); // Checking equality
        int floatHash = floatObject1.hashCode(); // Hash code of Float
        String floatAsString = floatObject1.toString(); // Converting Float to String
        float parsedFloat = Float.parseFloat("12.34"); // Parsing String to float

        // Double Wrapper Class
        Double doubleObject1 = Double.valueOf(23);
        Double doubleObject2 = Double.valueOf(432.4);
        double unboxedDouble = doubleObject1.doubleValue(); // Unboxing to double
        int doubleComparison = doubleObject1.compareTo(doubleObject2); // Comparing Double values
        boolean doubleEquals = doubleObject1.equals(doubleObject2); // Checking equality
        int doubleHash = doubleObject1.hashCode(); // Hash code of Double
        String doubleAsString = doubleObject1.toString(); // Converting Double to String
        double parsedDouble = Double.parseDouble("56.78"); // Parsing String to double

        // Character Wrapper Class
        Character charObject = Character.valueOf('a');
        char unboxedChar = charObject.charValue(); // Unboxing to char
        boolean isLetter = Character.isLetter(charObject); // Checking if character is a letter
        boolean isDigit = Character.isDigit(charObject); // Checking if character is a digit
        boolean isUpperCase = Character.isUpperCase(charObject); // Checking if character is uppercase
        boolean isLowerCase = Character.isLowerCase(charObject); // Checking if character is lowercase
        char toUpperCaseChar = Character.toUpperCase(charObject); // Convert to uppercase
        char toLowerCaseChar = Character.toLowerCase(charObject); // Convert to lowercase

        // Boolean Wrapper Class
        Boolean booleanObject = Boolean.valueOf(false);
        boolean unboxedBoolean = booleanObject.booleanValue(); // Unboxing to boolean
        int booleanComparison = booleanObject.compareTo(Boolean.TRUE); // Comparing Boolean values
        boolean booleanEquals = booleanObject.equals(Boolean.TRUE); // Checking equality
        int booleanHash = booleanObject.hashCode(); // Hash code of Boolean
        String booleanAsString = booleanObject.toString(); // Converting Boolean to String
        boolean parsedBoolean = Boolean.parseBoolean("true"); // Parsing String to boolean

        // Displaying the usage of all wrapper class methods
        System.out.println("Integer Example:");
        System.out.println("Value: " + integerObject);
        System.out.println("intValue: " + primitiveInt);
        System.out.println("compareTo: " + intComparison);
        System.out.println("equals: " + intEquals);
        System.out.println("hashCode: " + intHash);
        System.out.println("toString: " + intAsString);
        System.out.println("parseInt: " + parsedInt);

        System.out.println("\nByte Example:");
        System.out.println("Value: " + byteValue1);
        System.out.println("byteValue: " + unboxedByte);
        System.out.println("compareTo: " + byteComparison);
        System.out.println("equals: " + byteEquals);
        System.out.println("hashCode: " + byteHash);
        System.out.println("toString: " + byteAsString);
        System.out.println("parseByte: " + parsedByte);

        System.out.println("\nShort Example:");
        System.out.println("Value: " + shortValue1);
        System.out.println("shortValue: " + unboxedShort);
        System.out.println("compareTo: " + shortComparison);
        System.out.println("equals: " + shortEquals);
        System.out.println("hashCode: " + shortHash);
        System.out.println("toString: " + shortAsString);
        System.out.println("parseShort: " + parsedShort);

        System.out.println("\nFloat Example:");
        System.out.println("Value: " + floatObject1);
        System.out.println("floatValue: " + unboxedFloat);
        System.out.println("compareTo: " + floatComparison);
        System.out.println("equals: " + floatEquals);
        System.out.println("hashCode: " + floatHash);
        System.out.println("toString: " + floatAsString);
        System.out.println("parseFloat: " + parsedFloat);

        System.out.println("\nDouble Example:");
        System.out.println("Value: " + doubleObject1);
        System.out.println("doubleValue: " + unboxedDouble);
        System.out.println("compareTo: " + doubleComparison);
        System.out.println("equals: " + doubleEquals);
        System.out.println("hashCode: " + doubleHash);
        System.out.println("toString: " + doubleAsString);
        System.out.println("parseDouble: " + parsedDouble);

        System.out.println("\nCharacter Example:");
        System.out.println("Value: " + charObject);
        System.out.println("charValue: " + unboxedChar);
        System.out.println("isLetter: " + isLetter);
        System.out.println("isDigit: " + isDigit);
        System.out.println("isUpperCase: " + isUpperCase);
        System.out.println("isLowerCase: " + isLowerCase);
        System.out.println("toUpperCase: " + toUpperCaseChar);
        System.out.println("toLowerCase: " + toLowerCaseChar);

        System.out.println("\nBoolean Example:");
        System.out.println("Value: " + booleanObject);
        System.out.println("booleanValue: " + unboxedBoolean);
        System.out.println("compareTo: " + booleanComparison);
        System.out.println("equals: " + booleanEquals);
        System.out.println("hashCode: " + booleanHash);
        System.out.println("toString: " + booleanAsString);
        System.out.println("parseBoolean: " + parsedBoolean);
    }
}
