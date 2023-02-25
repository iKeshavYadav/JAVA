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

// # Relational Operators
/*
class Hello
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 20;
        
        // boolean result = a == b; //false
        // boolean result = a != b; //false
        // boolean result = a > b; //false
        // boolean result = a < b; //true
        // boolean result = a >= b; //false
        // boolean result = a <= b; //true

        System.out.println(result);
    }
}
*/

// # Logical Operators
/*
class Main {
  public static void main(String[] args) {

    // && AND-operator (TRUE - only if BOTH the condition are True)
    // System.out.println((5 > 3) && (8 > 5));  // true
    // System.out.println((5 > 3) && (8 < 5));  // false

    // || OR-operator (TRUE - if ANY-ONE condition is True)
    // System.out.println((5 < 3) || (8 > 5));  // true
    // System.out.println((5 > 3) || (8 < 5));  // true
    // System.out.println((5 < 3) || (8 < 5));  // false

    // ! NOT-operator (T -> F | F -> T)
    // System.out.println(!(5 == 3));  // true
    // System.out.println(!(5 > 3));  // false
  }
}
*/

// # If-Else in JAVA
/*
class Hello
{
    public static void main(String[] args)
    {
        int x = 8;
        
        if(x < 10)
        {
            System.out.println("Hello");
            System.out.println("Welcome!");
        }
        else
            System.out.println("Bye");
    }
}
*/

// # If-Else-If in JAVA
/*
class Hello
{
    public static void main(String[] args)
    {
        int a = 8;
        int b = 2;
        
        if(a == b){
            System.out.println("Equal");
        } else if(a > b){
            System.out.println("A is Greater");
        }
        else{
            System.out.println("A is Lesser");
        }
    }
}
*/

// Ternary operators in JAVA
/*
class Hello
{
    public static void main(String[] args)
    {
        int n = 4;
        int result = 0;

        // if(n%2==0){
        //     result = 10;
        // }else{
        //     result = 20;
        // }
        // System.out.println(result);


        // ?: Ternary Operator
        result = n%2==0 ? 10 : 20;
        System.out.println(result);
    }
}
*/

// Switch Statement in JAVA
/* 
class Hello {
    public static void main(String[] args) {
        
        int days =2;
        
        switch(days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a Valid Weekday Number :)");
        }
    }
}
*/


// Loops - while, do while, for


// While Loops in JAVA
/*
class Hello {
    public static void main(String[] args) {
        
        // int i = 1;
        // while(i <= 4){
        //     System.out.println("Hi " + i);
        //     i++;
        // }
        // System.out.println("Bye! " + i);
        
        
        // # Nested while loop
        int i = 1;
        while(i <= 4){
            System.out.println("Hi " + i);
            
            int j = 1;
            while(j <= 3){
                System.out.println("Hello" + j);
                j++;
            }
            
            i++;
        }
        System.out.println("Bye! " + i);
    }
}
*/

// Do While Loops in JAVA

// Do while give output at least once even if the condiotion is false
/*
class Hello {
    public static void main(String[] args) {
    
        int i = 5;
        
        do{
            System.out.println("Hi " + i);
            i++;
        }while(i <= 4);
    }
}
*/

// For Loops in JAVA
/*
class Hello {
    public static void main(String[] args) {
    
        for(int i=1; i<=4; i++){
            System.out.println("Hi " + i);
        }
    }
}
*/


// Class and Object in JAVA
/* 
class Calculator {
    
    // int a;
    
    public int add(int n1, int n2){
        int r = n1+n2;
        return r;
    }
}

class Hello {
    public static void main(String[] args) {
    
        int num1 = 4;
        int num2 = 5;
        
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        
        System.out.println(result);
    }
}
*/