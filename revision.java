import java.util.Scanner;
import java.sql.Array;
import java.util.Arrays;
// public class revision {
// public static void main(String[] args){
        
// long ts = 134;
// long tsInt =(int)ts; 
// //  here tsInt isliye likha hai taaki error na aaye var ka hi naam hai 
// System.out.println(tsInt);

// int age = 150;

// // type casting type conversion

// byte newage = (byte)age;
// System.out.println(newage);
// // -106
         
//     }

//     public static void str (String[] args){
//         System.out.println("Hello World");
//     }

    // boolean = true and false
    // byte = 1 byte stores in btw -128 to 127
    // short = 2 byte stores in btw -32768 to 32767
    // int = 4 byte stores in btw -2147483648 to 2147483647
    // long = 8 byte stores in btw -9223372036854775808 to 9223372036854775807
    // float = 4 byte (1.2f) stores in btw 1.4e-045 to 3.4e+038 6 to 7 decimal digits
    // double = 8 byte (1.2d) stores in btw 4.9e-324 to 1.8e+308 15 decimal digits
    // char = 2 byte stores in btw 0 to 65535 single char 
    // String = stores in btw 0 to 65535

  
// binary num system java operator

// Convert decimal to binary
// int num = 5;
// String binary = Integer.toBinaryString(num);
// System.out.println(binary);

// int num1 = 26 ;
// String binary1 = Integer.toBinaryString(num1);
// System.out.println(binary1);
// 101
// 11010

// isme basically lcm lena hota hai and niche ke remainder se lekar ke upar tak ke 0 quotient ko divide karte hai 
//    2 | 49 | 1
//    2 | 24 | 0
//    2 | 12 | 0
//    2 |  6 | 0
//    2 |  3 | 1
//    2 |  1 | 1

// 110001 so this is the binary of 49




// Convert binary to decimal

// String binary2 = "11010";
// int decimal = Integer.parseInt(binary2, 2);
// System.out.println(decimal);
// 26 is the binary to decimal  conversion


// if we wanted to convert 11010 to decimal then we have to do this
// 1*2^4 + 1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 = 26

// another example 10101
// 1*2^4 + 0*2^3 + 1*2^2 + 0*2^1 + 1*2^0 = 21

// isme kuch ni krna jis place me number hai jaise in 4th positio to 4*2^4 and so on jaha thak bhi number hoga
// to simple trick ye hai ki jaha bhi zero likha hai usey ignore krdo or jaha jaha number hai wahan wahan uski palce se related multiply krdo 

// 1010111
// 1*2^6 + 1*2^5 + 0*2^4 + 1*2^3 + 1*2^2 + 0*2^1 + 1*2^0 = 87

// 1010100
// 64+16+4 = 84






//********** */ jabaran ka gyan bhi hai  yaha se *******//////
// decimal to octal \
// 49

// 49/8 = 6 1
// 6/8 = 0 6
// 0/8 = 0 0    
// 61 is the octal of 49

// decimal to hexa
// 49   
// 49/16 = 3 1
// 3/16 = 0 3
// 31 is the hexa of 49

// octal to decimal
// 61
// 1*8^1 + 6*8^0 = 49   


// int age = 128;
// byte newage = (byte)age;
// System.out.println(newage);
// -128 why? 
// 128/128 = 1 0
// 1*128^1 + 0*128^0 = 128
// 128-128 = 0
// 0-128 = -128
// in byte you can store number upto 127 so if you try to store 128 then it will store -128
// -128 to 127
// 10000101
// here in the 7th place is the most significant digit  if it is 1 = -ve num or 0 = +ve`num
// 76543210 places



// addition in the binary 
//  101
// +110
//  011
// 5+6 = 11


// if we add 0101 + 1001 
//  0101
// +1001
//  1110
// 5+9 = 14 binary to decimal
// 14 to binary = 1110

//  101
// +110
//  011
// 5+6 = 11
// 11 to binary = 1011

// binary subtraction to find the 2's compliment 


// 2's compliment here 
// swap the bits 
// add 1


// like we have to sub 00100
// swap = 11011
// add 1 = 11011+1 = 11100
// 11100 is the 2's compliment of 00100


// subtract 13- 6 in binary subt
// 13 = 1101


// 128 to binary equals to 
// 10000000
// // how this 1 came ?
// 2 | 128 | 0
// 2 |  64 | 0
// 2 |  32 | 0
// 2 |  16 | 0
// 2 |   8 | 0
// 2 |   4 | 0
// 2 |   2 | 0
// 2 |   1 | 1
// // 10000000
// 128 to binary equals to 10000000
 
// package is a collection of classes and interfaces
// package is a namespace that organizes a set of related classes and interfaces    
// package is used to prevent naming conflicts
// package is used to control access
// package provides easier access control
// package can be considered as data encapsulation


// operators

// int a = 12;
// int b = 13;
// int c = a+b;
// System.out.println(c);
// // 25

// int d = a-b;
// System.out.println(d);
// // -1

// int e = a*b;
// System.out.println(e);
// // 156

// int f = a/b;
// System.out.println(f);  
// // 0
// // here gives the quotient of the division

// int g = a%b;
// System.out.println(g);

// float h = a%b;
// System.out.println(h);
// // 12.0

// // it gives the remainder of the division
// // 12

// int i = a++;

// System.out.println(i);

// relational operator 

// int a = 12;
// int b = 13;
// System.out.println(a>b);
// // false
// System.out.println(a<b);
// // true
// System.out.println(a>=b);
// // false
// System.out.println(a<=b);
// // true
// System.out.println(a==b);
// // false
// System.out.println(a!=b);
// // true

// logical operator

// int a = 12;
// int b = 13;
// int c = 14;
// System.out.println(a>b && a>c);
// // false
// System.out.println(a>b || a>c);
// // false
// System.out.println(!(a>b && a>c));
// // true

// ! operator example
// int a = 12;
// int b = 13;
// System.out.println(!(a>b));
// // true



// bitwise operator

// int a = 12;
// int b = 13;
// System.out.println(a&b);
// // 12
// System.out.println(a|b);
// // 13
// System.out.println(a^b);
// How?
// int a = 12;
// int b = 13;
// a^=b;
// 12^13
// 1100
// 1101
// 0001 in the binary form 


// 1
// System.out.println(~a);
// // -13
// how?
// 12 = 00001100
// ~12 = 11110011
// 11110011 = -13

// System.out.println(a<<2);
// // 48

// System.out.println(a>>2);
// // 3

// ye aagey padhenge abhi thoda tough padega

// ternary operator

// int a = 12;
// int b = 13;
// int c = 0;
// c = a>b ? a : b;
// System.out.println(c);
// // 13

// c = a<b ? a : b;

// System.out.println(c);
// // 12

// c = a>b ? a : b;
// System.out.println(c);

// c = a<b ? a : b;
// System.out.println(c);

// user input 
// System.out.println("Enter the value you wanted to enter: ");
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// System.out.println("here is the number : "+a);


// System.out.println("Enter the line  you wanted to enter: ");
// Scanner line = new Scanner(System.in);
// String b = line.nextLine();
// System.out.println("here is the line: "+b);

// you can store any  thing like long aswell typecast aswell 


// System.out.println("enter the long value you wanted to enter: ");
// Scanner sc = new Scanner(System.in);
// long num = sc.nextLong();
// System.out.println("here is the long value: "+ num);

// System.out.println("Enter the float value you wanted to enter: ");
// Scanner sc = new Scanner(System.in);
// float num = sc.nextFloat();

// System.out.println("here is the float value: "+ num);




// now suppose we need to typecast the num  during the time of the input taking 





// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the value you wanted to enter: ");
// int a = (int)sc.nextFloat();
// // here the num typecasted to the int
// System.out.println("here is the value: "+a);

// Enter the value you wanted to enter: 
// 1.4
// here is the value: 1


// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the value you wanted to enter: ");
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = a+b;
// System.out.println("here is the value: "+c);


// garbage collector
// it is a program that runs on the JVM that gets rid of objects that are no longer being used by a program
// it is a part of the JVM that is responsible for reclaiming memory by destroying unused objects
// it is a daemon thread that is low priority and runs in the background
// it is called by the JVM when it is low on memory
// it is called by the JVM when System.gc() is called


// exaample
// Scanner sc = new Scanner(System.in);
// sc.close();

// if else condition 


// System.out.println("enter the you wanted to enter:");
// Scanner sc = new Scanner(System.in);
// int age = sc.nextInt();
// if(age<=19){
//     System.out.println("you are the teenager go and hustle ");
// }
// else{
//     System.out.println("you are not the teeager no longer ");
// }

// nested if 

// you are given three number and you have to tell the maximum number 

// int a = 3;
// int b = 344;
// int c = 6;
// if(a>b){
//     System.out.println("a is bigger than b");
//     if(a>c){
//         System.out.println("a is bigger than c");
//         System.out.println("yes a is the largest");
//     }
//     else{
//         System.out.println("c is bigger than a");
//         System.out.println("yes c is the largest");
//     }

// }
// else{
//     System.out.println("b is the bigger tha a");

// }
// if(b>c){
//     System.out.println("b is the largest");
// }
// else{
//     System.out.println("c is the bigger tha b");
//     System.out.println("c is the largest");
// }

// }
    
// ternary operator 

// condition ? expression1 : expression2
// it is the subsitutes the condition ef else 

// int a = 122;
// int b = 23;
// int max = 0;

// if(a>b){
//     max = a;
// }else{
//     max = b;
// }

// max = a>b ? a: b;
// agar condition true hai to vo return karo jo condition 1 dera hai otherwise vo retuurn karo jo condition 2 dera hai 


// nesting in the ternary operators 

// int a = 122;
// int b = 23;
// int c = 69;
// int max =0;

// max = a>b? a>c ? a:c:b >c ? b:c;


// System.out.println("the maximum number is: "+max);

// agar a b se chota hai to a return karo else b return karo else agar a b se chota hai to a return karo else b return karo




// System.out.println("the maximum number is: "+max);


// switch case /

// Scanner sc = new Scanner(System.in);
// System.out.println("enter the day you want to enter: ");
// int day = sc.nextInt();

// switch(day){
//     case 1:
//         System.out.println("Sunday");
//         break;
//     case 2:
//         System.out.println("monday");
//         break;
//     case 3:
//         System.out.println("tuesday");
//         break;
//     case 4:
//         System.out.println("wednesday");
//         break;
//     case 5:
//         System.out.println("thursday");
//         break;
//     case 6:
//         System.out.println("friday");
//         break;
//     case 7:
//         System.out.println("saturday");
//         break;

//     default:
//     System.out.println("enter the valid day");
//     break;
    
    

// }


//     }

// int time = 11;

// if(time>= 10){
//     if(time<= 20){
//         System.out.println("office is open ");
// }
//     else{
//         System.out.println("office is closed");
//     }
// }
// else{
//     System.out.println("office is closed");
// };

// if(time >=10 && time<=20){
//     System.out.println("office is open");

// }
// else{
//     System.out.println("office closed");
// }
// }


// loops in java 

// for loop 

// Scanner sc = new Scanner(System.in);
// // System.out.println("enter the number you wanted to enter: ");
// int n = sc.nextInt();
// // // int fact = 1;

// for(int i = 1; i<=12; i++){
//     System.out.println(n+"+"+ i+ "="+i*n);
//     }

// sum of n natural num 
// int sum =0;
// // sum = n(n+1)/2;

// for(int i = 0 ; i<=n; i++){
//     sum = sum+i;
// }
// System.out.println("the sum of the n natural number is: "+sum);
// the sum of the n natural number is: 6




// While loop 

// int i = 1;
// while(i<=10){    
//     System.out.println(i);
//     i++;
// }


// boolean hasLearnt = false;

// while(!hasLearnt){
// System.out.println("went to school, tried to learn ");
// hasLearnt = sc.nextBoolean();



// int n = sc.nextInt();






// do while loop

// int i = 65;
// do{
//     System.out.println(i);
//     i++;
// }while(i<=10);

// break and continue   


// for (int i = 0; i < 10; i++){
//     System.out.println(i);
//     if(i == 5){
//         break;
//     }
// }




// for (int i = 0; i < 10; i++){
   
//     if(i == 5 || i ==3|| i ==4|| i ==9){
//         continue;
        
//     }
// skip krne ke liye kuch bhi continue ka use krte hai 
// ********when u wanted to skip the current iteration ******** 
    // System.out.println(i);
    // System.out.println("continue");

// for(int i = 0; i < 10; i++){
//     if(i == 5) continue;
    
//     System.out.println(i);
// }


// for(int i = 0; i < 10; i++){
//     if(i == 5) break;
//     System.out.println(i);
// }
     


// nested loops 

// @@@@@@@@ 
// bahar wala loop ddekhta hia ki andar wala loop kitni baar chalega
// or andar wala loop  dekhta hai ki uske andar wala loop kitni baar chalega
// andar wala loop 
// jaise 1 se 5 tak ke number ko 10 baar likhna hai har number ko to 
// ############# /

// for(int i = 0; i <=10; i++){
//     for(int j = 0; j <=5; j++){
//         System.out.println(j);
//     }
//     System.out.println("");
// }

 

// for(int i = 0; i < 5; i++){
//     for(int j = 0; j < 5; j++){
//         System.out.println("i: "+i+" j: "+j);
//     }

// }
// i: 0 j: 1
// i: 0 j: 2
// i: 0 j: 3
// i: 0 j: 4
// i: 0 j: 5
// i: 0 j: 6
// i: 0 j: 7
// i: 0 j: 8
// i: 0 j: 9
// i: 1 j: 0
// i: 1 j: 1
// i: 1 j: 2
// i: 1 j: 3
// i: 1 j: 4
// i: 1 j: 5
// i: 1 j: 6
// i: 1 j: 7
// i: 1 j: 8
// i: 1 j: 9
// i: 2 j: 0
// i: 2 j: 1
// i: 2 j: 2
// i: 2 j: 3
// i: 2 j: 4
// i: 2 j: 5
// i: 2 j: 6
// i: 2 j: 7
// i: 2 j: 8
// i: 2 j: 9
// i: 3 j: 0
// i: 3 j: 1
// i: 3 j: 2
// i: 3 j: 3
// i: 3 j: 4
// i: 3 j: 5
// i: 3 j: 6
// i: 3 j: 7
// i: 3 j: 8
// i: 3 j: 9
// i: 4 j: 0
// i: 4 j: 1
// i: 4 j: 2
// i: 4 j: 3
// i: 4 j: 4
// i: 4 j: 5
// i: 4 j: 6
// i: 4 j: 7
// i: 4 j: 8
// i: 4 j: 9

// int n = 5;
// for(int i = 0; i <n ; i++){
// // for(int i = 0; i <=n ; i++){
//     for(int j = 0; j <= i; j++){
//         // System.out.print(j+"* ");
//         System.out.print(i+"* ");
//     }
//     System.out.println();
// }
// * 
// * *
// * * *
// * * * *
// * * * * *

// 0* 
// 0* 1*
// 0* 1* 2*
// 0* 1* 2* 3*
// 0* 1* 2* 3* 4*

// 0* 
// 1* 1*
// 2* 2* 2*
// 3* 3* 3* 3*
// 4* 4* 4* 4* 4*
// 5* 5* 5* 5* 5* 5*


// labeled break & continue Statements
// naam ddena hota hai simply for loop while loops me 

// outer: for(int i = 0; i < 5; i++){
//     if(i ==3){
//         break outer;
//     }
//     inner: for(int j = 0; j < 2; j++){
//         System.out.println("i: "+i+" j: "+j);
//   if(j ==1){
//       continue inner;
//     }


// Arrays 

// int age[ ] = new  int[30];

// for(int i = 0; i < age.length; i++){
//     age[i] = i+1;
//     System.out.println("Age: "+age[i]);

// int arr[] = new int[5];
// arr[0] = 12;
// arr[1] = 13;
// arr[2] = 14;
// arr[3] = 15;
// arr[4] = 16;

// for(int i = 0; i < arr.length; i++){
//     System.out.println("Age: "+arr[i]);
// }

// int arr[] = {12, 13, 14, 15, 16, 17, 18, 19, 20};
// for(int i = 0; i < arr.length; i++){
//     System.out.println("Age: "+arr[i]);
// }






// for each loop 

// int age[] = {12, 13, 14, 15, 16, 17, 18, 19, 20};

// for(int i : age){
//     System.out.println(i);
// }

// for(int i=0;i<  age.length;i++){
//     System.out.println(age[i]);


// int age[] = {12, 13, 14, 15, 16, 17, 18, 19, 20};

// int max = Integer.MIN_VALUE;
// for(int i : age){
//     if(i>max){
//         max = i;
        
//     }

// }
// System.out.println("the maximum number is: "+max);


// multidimensional array

// int marks[][] = new int[4][3];

// int s[][]  ={
//     {1, 2, 3},
//     {4, 5, 6},
//     {7, 8, 9},
//     {10, 11, 12}
// };
// System.out.println(Arrays.deepToString(s));


// }

// Methods in java = Functions 
// java methods ko hi function bolte hai 

// methods is a block of code 
// methods are used to perform certain actions
// methods are also known as functions
// why use methods? to reuse code: define the code once, and use it many times
// you can pass data, known as parameters, into a method    
// methods can return data
// methods are independent of each other    
// methods are called by their name, but they can also be called by their name and their parameters
// methods are the part of the class
// methods are the part of the object
// methods are the part of the interface
// methods are the part of the package
// methods are the part of the java file

//  access specifier 
//  return type
//  method name
//  parameters
//  method body

// public class revision {
//     public static void main(String[] args){



// string ka array pass kiya hai or args jo hai vo ek variable ka name hai kuch bi likh skte ho us jagah pe
// for the return type of the args 


// for(String arg: args){
//     System.out.println(arg);
// }



// why these deefault parameters of String[] args were pass?
// because the main method is the entry point of the java program
// and the main method is the starting point of the java program
// and the main method is the first method that is called by the JVM
// and the main method is the first method that is executed by the JVM
// and the main method is the first method that is executed by the JVM when the program is run



// *********for the function call for display()*********
        // for the function call for greet()
// System.out.println("Hello World");
// greet(2, 02);
// System.out.println("hogaya greet wala print ");

// *********output*********** 
// Hello World
// a:  b:
// a + b = 4
// hogaya greet wala print


// function call for display()

// display(3, 4);
// System.out.println(display(3, 4));
// System.out.println("the sum of the two number is: "+display(3, 4));




        // int a = 12;

    //     }
    //     public static int display(int a, int b){
    //         return a+b;
    //     }

    //     public static void display1(){
            
    //         // nothing because it is void 
    // }

// access specifier = public
// return type = void
// method name = main
// parameters = String[] args
// method body = {int a = 12;}

// static laga dene par obj bananey ki jarurat ni hai greet();
// call kr skte hai 


    // public static void greet(int a, int b){
    //         System.out.println("Hello World");
    //         System.out.println("a: "+" b: ");
    //         System.out.println("a + b = "+(a+b));

    //     }

    //     public void crest(String[] args){
    //         int a = 12;
    //         System.out.println(a);
    //     }

// math function 

// // Float a = 4.2313f;
// int a =4;
// int b = 2;

// System.out.println(Math.min(a, b));

// System.out.println(Math.max(a, b));

// System.out.println(Math.pow(a, b));

// System.out.println(Math.sqrt(a));

// System.out.println(Math.random());

// System.out.println(Math.abs(-4.7));
// // negative ko +ve value dega

// System.out.println(Math.ceil(4.7));

// System.out.println(Math.floor(4.7));

// System.out.println(Math.round(4.7));

// System.out.println(randomnum());
// return (int) Math.random()*6;



// System.out.println(Math.random()*6);

// System.out.println(Math.round(a));




//     }
//     public static int randomnum(){
// return (int) Math.random()*6;
//     }


// java String 

// non primitive data set
// sequence of char is string 
// string is a class in java
// string is a collection of characters
// string is a collection of characters enclosed in double quotes
// string is a collection of characters enclosed in single quotes

// String name = new Scanner(System.in).nextLine();
// System.out.println("diffrence "+name);
// String name = "Hello World";
// System.out.println(name);

// diffrence in new keyword and without new keyword by the memory allocation 

//  string constant pool  = String yahan par banti hai 
//  heap memory = new String yahan par banti hai

// String name = "Hello World"; string pool me bana hoga
// System.out.println("hello world");  ye bhi same hai str literal pool me bana hoga
// String name1 = "Hello World";  ye dekhega ye to already ban rakha hua hai to isey same jagah point krwa dete hai
// String name2 = new String("Hello World");  heap area me ban jaati hai new position me
// String name3 = new String("Hello World");


// garbage collector 
// it is a program that runs on the JVM that gets rid of objects that are no longer being used by a program
// it is a part of the JVM that is responsible for reclaiming memory by destroying unused objects

// it is called by the JVM when it is low on memory
// it is called by the JVM when System.gc() is called
// declare it 
// System.gc();

 
// stack memory me refrence store hotey hai and 
// heap memory me object store hota hai

// Scanner sc = new Scanner(System.in);
// System.out.println("enter your first name you wanted to enter: ");
// String name = sc.nextLine();
// System.out.println("enter your second name you wanted to enter: ");
// String name1 = sc.nextLine();

// String fullname = name.concat(name1);

// System.out.println("your full name is: "+fullname);

// if(name==name1){
//     System.out.println("Both names are same");
// }
// else{
//     System.out.println("you are good to go " + fullname);
// }

// if(name.equals(name1)){

// java string method 

// String name = "Hello World";
// System.out.println(name.length());

// System.out.println(name.charAt(5));

// System.out.println(name.substring(0, 5));

// System.out.println(name.contains("Hello"));

// System.out.println(name.equals("Hello World"));

// System.out.println(name.isEmpty());

// System.out.println(name.concat(" World"));

// System.out.println(name.replace("Hello", "Hi"));

// System.out.println(name.toUpperCase());

// System.out.println(name.toLowerCase());

// System.out.println(name.trim());

// System.out.println(name.indexOf("World"));

// System.out.println(name.lastIndexOf("World"));

// 11
// H
// Hello
// true
// true
// false
// Hello World World
// Hi World
// HELLO WORLD
// hello world
// Hello World
// 6
// 6

// String color = "Brown";
// String color1 = "Brown";
// String color2 = new String("Brown");


// object orientd programming in java 


// classes and objects 

// class is a blueprint for the object which defines some of the properties and behaviours of the object
// class is a template for the object   

// object is an instance of a class
// object is a physical entity
public class revision{

// punlic can be only one class at the time
public static void main(String[] args){

    // dog is the class and dog1 is the object of the class dog

    dog dog1 = new dog();
    dog1.breed = "labrador";
    dog1.age = 5;
    dog1.color = "black";
    dog1.walk();
    dog1.eat();
    dog1.bark();
    
    
   
}



}
class dog{


    // ek class ke andar kuch behaviour or kuch function hotey hai 

    String breed;
    int age;
    String color;

    void walk(){
        System.out.println("dog is walking");
    }
    void eat(){
        System.out.println("dog is eating");
    }
    void bark(){
        System.out.println("dog is barking");
    }
}


