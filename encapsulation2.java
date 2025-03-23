// public class encapsulation2 {
//     // encapsulation id defined as 
//     // encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
//     // encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates.
//     // Encapsulation provides data hiding, data integrity, and data security.
//     // Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.
//     // Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.
//     // The public methods provide a way to access and modify the variables.
//     // Encapsulation helps in reducing the complexity of the code and improves data integrity.
//     // Encapsulation is also known as data hiding.
//     // Example:
//     public class Encapsulation {
//         private int age;
//         private String name;
//         // getter method
//         public int getAge() {
//             return age;
//         }
//         // setter method
//         public void setAge(int age) {
//             this.age = age;
//             // here this can call this age because it is private 
//             // and it can be accessed only within this class
//             // this.age = age;
//         }
//         // getter method
//         public String getName() {
//             return name;
//         }
//         // setter method
//         public void setName(String name) {
//             this.name = name;
//         }
// }
// }


// static keyword 
// static keyword is defined as
// static keyword is used to create a static method, variable, block, and nested class.
// static keyword belongs to the class than instance of the class.
// static keyword can be used with the class level variables.
// static keyword is used to initialize the static data member.

// class encapsulation2 {
//     // Private variables (Encapsulation)
//     private int age;
//     private String name;

//     // Setter methods to modify private variables
//     public void setAge(int age) {
//         this.age = age;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     // Getter methods to retrieve private variables
//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     public static void main(String[] args) {
//         encapsulation2 eth = new encapsulation2();
//         eth.setAge(10);
//         eth.setName("Rahul");

//         // Display values using getter methods
//         System.out.println("Name: " + eth.getName());
//         System.out.println("Age: " + eth.getAge());
//     }
// }




