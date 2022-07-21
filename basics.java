import java.util.Scanner; // import scanner class to use it
import javax.swing.JOptionPane; // JOptionPane class should be imported.
import java.util.Random; // importing Random class for generating random outputs
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
        
        // creating an input GUI
       String name = JOptionPane.showInputDialog("Enter your name: ");
       JOptionPane.showMessageDialog(null, "Hello " +name);

        // as JOptionPane.showInputDialog() method is only applicable for string, we have to convert
        // int to string using Integer.parseInt() method and copy the entire JOptionPane.showInputDialog() into it.
       int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: ")); // this converted the int to string.
       JOptionPane.showMessageDialog(null, "Your age is : " +age);
        // double to string using Double.parseDouble() method and copy the entire JOptionPane.showInputDialog() into it.
       double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: ")); // this converted the double into string
       JOptionPane.showMessageDialog(null, "Your height is: " +height+ " cms tall");


        // Some maths in java:

       double x = 3.14;
       double y = -10;

        // Max method to find the larger between two numbers:

       double z = Math.max(x,y); // assigning the value to a new variable z
       System.out.println(z);

        // Min Method to find the smaller between two numbers:

       double z_min = Math.min(x, y);
       System.out.println(z_min);

        // Absolute function method (Abs) returns the positive value of a negative value by removing the minus sign

       double z_abs = Math.abs(y);
       System.out.println(z_abs);

        // Square root method to find the square root of a number:

       double z_sqrt = Math.sqrt(x);
       System.out.println(z_sqrt);

        // round method to get round value of the output:

       double z_round = Math.round(x);
       System.out.println(z_round);

        // ceil method to get higher round value

       double z_ceil = Math.ceil(x);
       System.out.println(z_ceil);

        // floor method to get lower round value

       double z_floor = Math.floor(x);
       System.out.println(z_floor);

        // Finding hypotenuse of a triangle:

        // FORMULA: z = √ side1^2 + side2^2

       double x_hype;
       double y_hype;
       double z_hype;

       Scanner scanner = new Scanner (System.in);

       System.out.println("Enter side of x: ");
       x_hype = scanner.nextDouble();

       System.out.println("Enter side of y: ");
       y_hype = scanner.nextDouble();

       Math.sqrt( (x_hype * x_hype) + (y_hype * y_hype)); // √ side1^2 + side2^2

       z_hype = Math.sqrt( (x_hype * x_hype) + (y_hype * y_hype)); // z =  √ side1^2 + side2^2
       System.out.println("The hypotenuse is: "+z_hype);

       scanner.close(); // close the scanner

        // Using Random Class to generate random values
       Random random = new Random ();

       int x = random.nextInt(); // by default the random output displayed is somewhere around -2 billion to 2 billion

       System.out.println(x);

        // we can create limits as per our desire

       int z_10 = random.nextInt(10); // this will give any random output from 0-10
       System.out.println(z_10);

       int z_0 = random.nextInt(10)+1; // this will remove 0 from the outcomes
       System.out.println(z_0);

        // random double values:

       double z = random.nextDouble(200)+1;
       System.out.println(z);

        // random boolean values:

       boolean y = random.nextBoolean();
       System.out.println(y);


        // If statements in java

       int age;
       Scanner scanner = new Scanner (System.in);
       System.out.println("Enter your age: ");
       age = scanner.nextInt();
       if(age>=75){
           System.out.println("Ok Boomer!");
           }
       else if(age==15) {
           System.out.println("Wait for three years to vote!");
       }
       else if(age>=18){
           System.out.println("Yay! You can vote now.");
       }
       else{
           System.out.println("Sorry you're not eligible to vote");
       }
       scanner.close();
        // Switch statements in Java:
        //Switch is basically a statement that allows a variable to be tested for equality against a list of values.
        // a great alternative for too many if-else statements
               
        String day = "Monday";

        switch (day) {
            case "Sunday": System.out.println("It is Sunday!");
            break;
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Thursday": System.out.println("It is Thursday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
            break;
        }
        // Taking input in switch cases:

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your favourite day: ");
        int Day = scanner.nextInt();

        switch (Day) {
            case 1: System.out.println("It is Monday!");
            break;
            case 2: System.out.println("It is Tuesday!");
            break;
            case 3: System.out.println("It is Wednesday!");
            break;
            case 4: System.out.println("It is Thursday!");
            break;
            case 5: System.out.println("It is Friday!");
            break;
            case 6: System.out.println("It is Saturday!");
            break;
            case 7: System.out.println("It is Sunday finally!");
            break;
        }


        // Logical Operators in Java:
        // && = (AND) both conditions must be true
        // || = (OR) either condition must be true
        // ! = (NOT) reverses boolean value of condition

       int temp = 25;
       if (temp>30) {
           System.out.println("It is hot outside");
       }
       else if (temp>=20 && temp<=30) {
           System.out.println("It is warm outside");
       }
       else {
           System.out.println("It is cold outside");
       }

       Scanner scanner = new Scanner (System.in);

       System.out.println("You are playing a game! Press q or Q to quit");
       String response = scanner.next();

       if (response.equals("q") || response.equals("Q")) {  //.equals method to see if two strings are equal
        System.out.println("You have successfully left the game!");
       }
       else {
       System.out.println("You have pressed the wrong key");
       }

       scanner.close();
        
       System.out.println("There are 7 days in a week! Write the correct day for today: ");
       Scanner scanner = new Scanner (System.in);
       String today = scanner.next();

       if (!today.equals("thursday") && !today.equals("Thursday")) { // using ! and && operator to get the same results
       System.out.println("You are incorrect!");
       }
       else {
        System.out.println("You are correct");
       }

        // while loop in java: executes a block of code as long as it's condition remains true

       Scanner scanner = new Scanner (System.in);
       String name = "";

       while(name.isBlank()) {  // isBlank method is used to check if a string is empty or not
           System.out.print("Enter your name: ");
           name = scanner.nextLine();

       } // rememeber to exit while loop
       System.out.println("Hello "+name);

        // do loop (another variation of while loop
        // difference b/w do and while loop: with do loop we will always perform our block of code atleast once
        // and then we check the condition

       Scanner scanner = new Scanner(System.in);

       String word = "";

        do{
           System.out.println("Enter a day: ");
           word = scanner.nextLine();
       }while(word.isBlank());

       System.out.println("You said "+word);

        // For loop in java: executes a block of code a limited amount of times

       for (int i = 0; i <= 10; i++) {  // we need to write the condition with other two statements
           // the starting value (i=0 that is 0), condition of continuing the for loop (until i<=10), and it increments by 1

           System.out.println(i);
       }

       for (int i = 10; i >= 0; i--) {
           System.out.println(i);
       }
       System.out.println("Happy New Year!");

        // if we want to decrement or increment any other value except one:
        for (int i = 1; i<=10; i+=2) {
            System.out.println(i);
        }



    }
}
