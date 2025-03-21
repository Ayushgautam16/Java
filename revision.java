public class revision {
    public static void main(String[] args){
        
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
int num = 5;
String binary = Integer.toBinaryString(num);
System.out.println(binary);

int num1 = 26 ;
String binary1 = Integer.toBinaryString(num1);
System.out.println(binary1);
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





    }


}

