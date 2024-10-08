// Demonstrate boolean values.
public class booleanDataType {
        public static void main(String args[]) {
    boolean b;
    b = false;
    System.out.println("b is " + b);
    b = true;
    System.out.println("b is " + b);
    // a boolean value can control the if statement
    if(b) System.out.println("This is executed.");
    b = false;
   
    if(b) System.out.println("This is not executed.");
    // outcome of a relational operator is a boolean value
    System.out.println("10 > 9 is " + (10 > 9));
    }
   }
   /* 
   The output generated by this program is shown here:
    b is false
    b is true
    This is executed.
    10 > 9 is true

   There are three interesting things to notice about this program. First, as you can see, 
   when a boolean value is output by println( ), "true" or "false" is displayed. Second, the value 
   of a boolean variable is sufficient, by itself, to control the if statement. There is no need to 
   write an if statement like this:

   if(b == true)
   
   Third, the outcome of a relational operator, such as <, is a boolean value. This is why the 
   expression 10>9 displays the value "true." Further, the extra set of parentheses around 10>9
   is necessary because the + operator has a higher precedence than the >.
}
   */
