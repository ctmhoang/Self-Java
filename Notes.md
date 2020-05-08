# Some notes non FX :))
## UML Graph
* `+` public
* `-` private
* `#` protected
* *italicized* abtract method, interface's name
* `:` return or type
* Superclass methods are generally omitted in the UML diagram for subclasses.
* The dashed line and hollow triangle are used to point to the interface.
* Small black triangle that indicates the direction of the association relationship.
* A filled diamond is attached to an aggregating class -- white : aggregation ; black : composition
* The getter and setter methods for weight are provided, but omitted in the UML
## Variable-Length Argument Lists
`typeName... parameterName`
## Arrays Class
* parallelSort is more efficient if computer has multiple processors.
*  binarySearch method to search for a key in an array. The array must be pre-
sorted in increasing order. If the key is not in the array, the method returns −(insertionIndex + 1). 
* You can use the equals method to check whether two arrays are strictly equal. Two arrays
are strictly equal if their corresponding elements are the same.
## Command-Line Arguments
* Compile `javac ` **ClassName.java**
* Run `java` + `FileNameWithClassSuffix`
## Aggregation and Composition Relation
*  Aggregation models has-a relationships
*  Aggregation between two objects as composition if the existence of the aggregated
object is dependent on the aggregating object. In other words, if a relationship is composition,
the aggregated object cannot exist on its own.
* Aggregation relationship == dependent
* Composition relationship == independent
* An aggregation relationship is usually represented as a data field in the aggregating
class. 
* Aggregation may exist between objects of the same class.
## Primitive Wrappers
* Numeric wrapper classes are very similar to each other. Each contains the methods
doubleValue(), floatValue() , intValue(), longValue() , shortValue(), and
byteValue(). These methods “convert” objects into primitive-type values. 
	* Each numeric wrapper class has the constants MAX_VALUE and MIN_VALUE. MAX_VALUE
represents the maximum value of the corresponding primitive data type and method valueOf(String s), parseType(String s), parseType(String s, int radix{2,8,10,16} ).
	* String class contains the compareTo method for comparing two strings.
	* autoboxing and autounboxing between Object and primatives
* The BigInteger and BigDecimal classes can be used to represent integers or decimal numbers of any size and precision.
	*  An instance of BigInteger can represent an integer of any size. You can use new
BigInteger(String) and new BigDecimal(String) to create an instance of BigInteger
and BigDecimal, use the add, subtract, multiply, divide, and remainder methods to perform arithmatic operations, and use the compareTo method to compare two big numbers.
	*  The divide method may throw
an ArithmeticException if the result cannot be terminated. However, you can use the over-
loaded divide(BigDecimal d, int scale, int roundingMode) method to specify
a scale and a rounding mode to avoid this exception, where scale is the maximum number
of digits after the decimal point
</br>`BigDecimal c = a.divide(b, 20, BigDecimal.ROUND_UP);`
* Because strings are immutable and are ubiquitous in programming, the JVM uses a unique
instance for string literals with the same character sequence in order to improve efficiency and save
memory. Such an instance is called an interned string
``` java
String s1 = "Welcome to Java";
String s2 = new String("Welcome to Java");
String s3 = "Welcome to Java";
System.out.println("s1 == s2 is " + (s1 == s2));
System.out.println("s1 == s3 is " + (s1 == s3));
```
Display
```
s1 == s2 is false
s1 == s3 is true
```
* Some method in String class
	* Method `getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)` copy a substring of the string from index srcBegin to index srcEnd–1
into a character array dst starting from index dstBegin.
	* String.format() use regexes to replace,  MessageFormat.format() use like format in python

## Handling Exceptions

* System.exit(1);
* Should not let the method terminate the program—the caller should decide whether to termi-
nate the program
* input.nextLine(); // Discard input
* Rethrowing Exceptions
* Checked Exception (Recovered - declare throws in method - UI) vs Unchecked Exception (Cannot recovered - Do not need to declare in method - Sever - Runtime Exception Subclass)
## Files
* The File class contains the methods for obtaining file and directory properties, and for renaming and
deleting files and directories, but it does not contain the methods for reading and writing file contents.
## File IO
* Use the Scanner class for reading text data from a file, and the PrintWriter class
for writing text data to a file.
* Do not need to close `writer` manually from java 7 we can use try block like `with open` in python
* It is not necessary to close the input file (line 22), but it is a good practice to do so to release
the resources occupied by the file
* The token-based input method does not read the delimiter after the token. If the nextLine() method
is invoked after a token-based input method, this method reads characters that start from this delimiter
and end with the line separator.
## Reading Data from Web
* First need to create a URL object using the java.net.URL class
</br>  `URL url = new URL("http://www.google.com/index.html");`
* After a URL object is created, Use the openStream() method defined in the URL class
to open an input stream and use this stream to create a Scanner object as follows:</br>
`Scanner input = new Scanner(url.openStream());`</br>
Now you can read the data from the input stream just like from a local file.
## Abstract Class
* The constructor in the abstract class is defined as protected because it is used only by
subclasses. When you create an instance of a concrete subclass, its superclass’s constructor is
invoked to initialize data fields defined in the superclass.
* Abstract methods are nonstatic.
## Interface
* The modifiers public static final on data fields and the modifiers public
abstract on methods can be omitted in an interface. 
* Although the public modifier may be omitted for a method defined in the interface,
the method must be defined public when it is implemented in a subclass.
* Java 8 also permits public static methods in an interface.
* [default](https://chaseyourjava.blogspot.com/2017/12/default-methods-in-java-8.html)
method provides a default implementation for the method in the interface. A class that
implements the interface may simply use the default implementation for the method or
override the method with a new implementation. This feature enables you to add a new
method to an existing interface with a default implementation without having to rewrite
the code for the existing classes that implement this interface.
* compareTo method should be consistent with equals one.
* An interface with an empty body is referred to as a marker interface (Cloneable inteface)
* Cloneable is shallow copy 
* An interface can inherit other interfaces using the extends keyword. Such an interface is
called a subinterface.
*
## General Notes
* When a string is concatenated with an object using the plus sign (+), the object’s string
representation from the toString() method is used to concatenate with the string 
## Class Design
* Cohension
	* separate responsibilities

* Consistency
	* naming conventions
	* naming consistency
	* no-arg constructor

* Encapsulation
	* encapsulate data fields

* Clarity
	* easy to explain
	* independent methods
	* intuitive meaning
	* independent properties

* Completeness

* Instance vs. Static
	* use a setter method to change the static data field
* Inheritance vs. Aggregation

* Interfaces vs. Abstract Classes

## Regex
* http://regexone.com/ </br>
`abc…`    Letters</br>
`123…`    Digits</br>
`\d`      Any Digit</br>
`\D`      Any Non-digit character</br>
`.`       Any Character</br>
`\.`      Period</br>
`[abc]`   Only a, b, or c</br>
`[^abc]`  Not a, b, nor c</br>
`[a-z]`   Characters a to z</br>
`[0-9]`   Numbers 0 to 9</br>
`\w`      Any Alphanumeric character</br>
`\W`      Any Non-alphanumeric character</br>
`{m}`     m Repetitions</br>
`{m,n}`   m to n Repetitions</br>
`*`       Zero or more repetitions</br>
`+`       One or more repetitions</br>
`?`       Optional character</br>
`\s`      Any Whitespace</br>
`\S`      Any Non-whitespace character</br>
`^…$`     Starts and ends</br>
`(…)`     Capture Group</br>
`(a(bc))` Capture Sub-group</br>
`(.*)`    Capture all</br>
`(ab|cd)` Matches ab or cd
