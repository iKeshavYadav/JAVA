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

// Methods in JAVA

/*
class Computer{
    
    public void playMusic(){
        System.out.println("Music Playing...");
    }
    
    public String getMeAPen(int cost){
        if(cost >= 10){
            return "Pen";
        }else{
            return "Nothing";
        }
    }
}

class Hello{
    public static void main(String[] args){
        
        Computer obj = new Computer();
        obj.playMusic(); // Music Playing...
        
        String str = obj.getMeAPen(12);
        System.out.println(str); // Pen
        
    }
}
*/

// Array in JAVA
/* 
public class Hello{
    public static void main(String[] args){
        
        // # Simple Array
        // int nums[] = {3,7,2,4};
        // nums[1] = 10;
        // System.out.println(nums[0]);
        
        // # Dynamic Array (Blank values array)
        int nums[] = new int[4]; //boxes are 4 but values are 0 initially
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;
        // System.out.println(nums[1]); //8
        
        // Fetch all the values
        
        for(int i=0;i<4;i++){
            System.out.println(nums[i]);
        }
    }
}
*/

// Multi Dimensional Array in JAVA
/*
class Hello {
    public static void main(String[] args) {
        
        //Two Dimensional empty array with having 3 rows & 4 col
        int nums[][] = new int[3][4];
        
        // Assigning random value into the array
        for(int i=0; i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }
        
        // printing all array values
        for(int i=0; i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        
        // printing all array values using enhanced for loop
        // for(int n[] : nums){
        //     for(int m: n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }
    }
}
*/

// Jagged Array in JAVA
/*
class Hello {
    public static void main(String a[]) {
        
        // Jagged array : number of col are not specified
        int nums[][] = new int[3][];
        
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];
        
        for(int i=0; i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }
        
        // printing all array values using enhanced for loop
        for(int n[] : nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
*/


// Array of objects
/*
class Student{
    int rollno;
    String name;
    int marks;
}

class Hello {
    public static void main(String a[]) {
        
        Student s1 =  new Student();
        s1.rollno = 17;
        s1.name = "Keshav";
        s1.marks = 70;
        
        Student s2 =  new Student();
        s2.rollno = 16;
        s2.name = "Aradhna";
        s2.marks = 90;
        
        Student s3 =  new Student();
        s3.rollno = 99;
        s3.name = "Satyam";
        s3.marks = 69;
        
        // System.out.println(s1.name + " : " + s1.marks); //Keshav : 70
        
        // Array of objects
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }
        
    }
}
*/

// Enhanced for loop (for-each-loop)
/*
class Hello {
    public static void main(String[] args) {
        
        int nums[] = new int[4];
        
        nums[0] = 3;
        nums[1] = 8;
        nums[2] = 6;
        nums[3] = 2;
        
        // Normal for loop
        // for(int i=0; i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }
        
        // Enhanced for loop (for-each-loop)
        
        for(int n : nums){
            System.out.println(n);
        }
    }
}
*/

// Enhanced for loop (for-each-loop) working with obj
/*
class Student{
    int rollno;
    String name;
    int marks;
}

class Hello {
    public static void main(String a[]) {
        
        Student s1 =  new Student();
        s1.rollno = 17;
        s1.name = "Keshav";
        s1.marks = 70;
        
        Student s2 =  new Student();
        s2.rollno = 16;
        s2.name = "Aradhna";
        s2.marks = 90;
        
        Student s3 =  new Student();
        s3.rollno = 99;
        s3.name = "Satyam";
        s3.marks = 69;
        
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        // Enhanced for loop
        for(Student stud : students){
            System.out.println(stud.name + " " + stud.marks);
        }
        
    }
}
*/

// String in JAVA

/*
class Hello {
    public static void main(String a[]) {
        
        String name = "Keshav";
        
        // System.out.println(name); //Keshav
        // System.out.println(name + " Yadav"); //Keshav Yadav
        // System.out.println(name.concat(" Yadav")); //Keshav Yadav
        // System.out.println(name.charAt(0)); //K
        System.out.println(name.length()); //6
        
    }
}
*/

// Mutable vs Immutable String in JAVA

// Mutable String: strings which can be modified once they are created
// Immutable String: cannot be changed after they have been created


/*
// StringBuffer and StringBuilder in JAVA
// StringBuffer and StringBuilder class in java used to create mutable string 

class Hello {
    public static void main(String[] args) {
        
        // StringBuffer: String which is mutable
        StringBuffer sb = new StringBuffer("Keshav");
        
        System.out.println(sb.capacity()); //Buffer size by default: 16
        System.out.println(sb.length()); //6
        System.out.println(sb.append(" Yadav")); //Keshav Yadav
        // String str = sb; //error: type mismatched
        String str = sb.toString(); //Convert StringBuffer to String type
        System.out.println(sb.deleteCharAt(2)); //Kehav Yadav
        System.out.println(sb.insert(0, "Mr. ")) //Mr. Keshav Yadav
        // sb.setLength(30); //Set extra length to add data
        sb.ensureCapacity(100) //Set minimum capacity to buffer size
        
        // In StringBuilder Methods are almost same as StringBuffer
        // The only diffrence is, StringBuffer is thread-safe but StringBuilder is not
    }
}
*/