// package inheritance;


// // extends krke  hum dusri class ki value inherit kr skte hai or properties bhi 
// public class car extends vehicle{
//     public static void main(String[] args) {
//         car obj = new car();
//         // obj.start();
//         // obj.stop();
//     }


//     void start(){
//         System.out.println("car is starting");
//          }
//     // yahan pe method overriding hori hai khud ki value inherit kr skte hai or properties bhi
   
// }




// super keyword is defined as 
// super keyword is used to refer to the immediate parent class object.

// diffrence between super and this 

    // super keyword is used to access the overridden method in the parent class.
    // this keyword is used to access the current class instance variables.
    // super keyword is used to call the constructor of the parent class.
    // this keyword is used to call the current class constructor.
    // super keyword is used to access the parent class constructor
    // this keyword is used to access the current class constructor
    // super keyword is used to access the parent class method
    // this keyword is used to access the current class method
    // super keyword is used to access the parent class variable
    // this keyword is used to access the current class variable
    // super keyword is used to access the parent class instance variable
    // this keyword is used to access the current class instance variable


    // final keyword is defined as
    // final keyword is used to restrict the user. final keyword can be used in many contexts.
    // final can be used to define constant value.
    // final can be used to define final method.
    // final can be used to define final class.
    // final can be used to restrict the user to access a variable from within the same class.
    // final can be used to restrict the user to access a method from within the same class.
    // final can be used to restrict the user to access a class from within the same package.

public class car{

final int gear = 5;

        public static void main(String[] args) {
            car obj = new car();

           obj.gear = 6;
        //     System.out.println(obj.gear);

        // not allowed = false;
        }
    }