import java.util.Scanner; // import scanner class to use it
public class basics {
    public static void main (String[] args) {
        // printing in java:
        System.out.println("Hello World!");
        // Data Types in Java:
        /*
        *boolean: size: 1 bit, values: true or false
        * byte: size: 1 byte, values: -128 to 127
        * short: size: 2 bytes, values: -32,768 to 32,767
        * int: size: 4 bytes, values: -2 billion to 2 billion
        * long: size: 8 bytes, values: -9 quintillion to 9 quintillion
        * float: size: 4 bytes, values: decimal numbers up to 6-7 digits
        * double: size: 8 bytes, values: decimal numbers up to 15 digits
        * char: size: 2 bytes, values: a single character/letter/ASCII value. e.g: 'f'. char values must be stored
        in single quotes ('') always.
        * String: size: varies, values: a sequence of characters e.g: "Hello". string values must be stored
        in double quotes ("").

        * PRIMITIVE DATA TYPES:
        -> 8 types (boolean, byte, etc.)
        -> stores data
        -> can only hold 1 value
        -> less memory
        -> they are fast

        * REFERENCE DATA TYPES:
        -> unlimited (user defined)
        -> stores an address
        -> could hold more than 1 value
        -> more memory
        -> slower

       // DECLARATION, ASSIGNMENT, INITIALISATION OF VARIABLE:

       DECLARATION: int x;
       ASSIGNMENT: x = 123;
       INITIALISATION: int x = 123;

        */

        long x = 12132324343424254L; // write a L at the last
        System.out.println("My number is :"+x);

        byte bx = 124;
        System.out.println(bx);

        float y =  3.14f; // write a f at the last
        System.out.println(y);

        double dy = 3.1423456;
        System.out.println(dy);

        boolean z = true;
        System.out.println(z);

        char c = '^';
        System.out.println(c);

        String name = "My name is grosssocks~";
        System.out.println("Hello! "+name);

        // swapping two variables:
        String s = "cheese";
        String k = "pizza";
        String l; // creating another variable to swap two variables
        l = s;
        s = k;
        k = l;

        System.out.println("s: "+s);
        System.out.println("k: "+k);

        Scanner scanner = new Scanner(System.in); // creating the scanner for taking inputs
        System.out.println("What is your name ?");
        String name1 = scanner.nextLine(); // nextLine is a method of accepting  values from users and
        // the result is displayed on the next line
        System.out.println("How old are you? "); // creating input from the user
        int age = scanner.nextInt(); // declaring the variable of input
        scanner.nextLine(); // closing the scanner for avoiding nextLine() method collision in the output
        System.out.println("What is your favourite food? ");
        String food  = scanner.nextLine();
        System.out.println("Hello "+name1);
        System.out.println("You are "+age+ " years old");
        System.out.println("You like "+ food);

        // Expressions in Java:
        int friends = 10;

        // + operator
        friends = friends + 1;
        System.out.println(friends);

        // OR

        // ++ (increment operaor)
        friends++; // increases by one of the previous value of the variable
        System.out.println(friends);

        // -- (decrement operator)
        friends--; // decreases by one of the previous value of the variable
        System.out.println(friends);

        int num = 10;
        num =  num / 3;
        System.out.println(num);
        // output will be 3 instead of 3.33333333


    }
}
