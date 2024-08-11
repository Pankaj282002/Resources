/* One last point: Although blocks can be nested, you cannot declare a variable to have 
the same name as one in an outer scope. For example, the following program is illegal: */

// This program will not compile
public class scopeError {
 public static void main(String args[]) {
 int bar = 1;
 {              // creates a new scope
 int bar = 2; // Compile-time error – bar already defined!
 }
 }
}

