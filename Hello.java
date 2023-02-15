// # Variables in JAVA

/*
class Hello
{
    public static void main(String a[])
    {
        int num1 = 3;
        int num2 = 4;
        int result = num1 + num2;
        // System.out.println(result);
    }
}
*/


// # Data Types in JAVA (https://www.javatpoint.com/java-data-types)

// 1. Primitive data types: boolean, char, byte, short, int, long, float and double.
// 2. Non-primitive data types: String, Classes, Object, Interfaces, and Arrays.

/*
class Hello
{
    public static void main(String a[])
    {
        int num1 = 9; //4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647
        byte by = 127; // 1 byte | Stores whole numbers from -128 to 127
        short sh = 558; // 2 bytes | Stores whole numbers from -32,768 to 32,767
        long lo = 5854l; // 8 bytes | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        float f = 5.8f; // 4 bytes | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double d = 5.8; // 8 bytes | Stores fractional numbers. Sufficient for storing 15 decimal digits
        
        char c = 'K'; // 2 bytes | Stores a single character/letter or ASCII values | excepts only single quote
        boolean b = true; // 1 bit | Stores true or false values
    }
}
*/

// # Type conversion and casting
// Implicit Conversion or Casting : a data type is converted into another data type by a compiler
// Explicit Conversion or Casting : a data type is converted into another data type by a programmer using casting operator

/*
class Hello
{
    public static void main(String args[])
    {
        // byte b = 127;
        int a = 12;
        byte k = (byte) a; //type casting
        // System.out.println(a);

        float f = 5.6f;
        int t = (int) f; ////type casting
        // System.out.println(t);

        // type promotion
        byte num1 = 10;
        byte num2 = 30;
        int result = num1 * num2;
        System.out.println(result);


    }
}
*/

// # Assignment Operators

/*
class Hello
{
    public static void main(String args[])
    {
        int num1 = 7;
        int num2 = 5;

        // int result = num1 + num2; //Addition
        // int result = num1 - num2; //Subtraction
        // int result = num1 * num2; //Multiplication
        // int result = num1 / num2; // Division -> Gives quotients
        // int result = num1 % num2; //Modular -> Gives Reminders
        // System.out.println(result);
        
        // Increments
        // num1 = num1 + 1; //8
        // num1 +=1; //8
        // num1++; //8 : post-increment
        // ++num1; //8 : pre-increment
        // System.out.println(num1);

        // Difference b/w post & pre increment
        // int result = ++num1; //8 : increments and then fetch the value
        int result = num1++; //7 : fetch the value and then increments
        System.out.println(result);
    }
}
*/
