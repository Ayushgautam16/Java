
// class human
// { 
//     // private int age = 11;
//     // private String name = "Ayush";

//     private int age ;
//     private String name ;


//     // constructor with parameters

// // define constructor() 
// // constructor name should be class name
// public human()
//  {
// // System.out.println("its constructor is " + name);

// // default constructor


// age = 23;               
// name = "Age";

// // by default we assign this value int he code 

// // no need to call the constructor 

// }

// // parametrized constructor 

// public human(int a, String n)
//  {
//     age = a;
//     name = n;
//  }


    

//    public int getage() { 
//     return age;

//    }
//    public void setage(int a){
//     age = a;
//    }

//    public String getname() { 
//     return name;

//    }
//    public void setname(String n){
//     name = n;
//    }
// }
    

// public class constructor{
//     public static void main(String[] args){

// // define the object of human here 
// human hume = new human();
// // hume.age =56;
// // hume.name ="ayush";


// // hume.setname("Ayush");
// // hume.setage(20);

// // System.out.println("Age of the person is :"+hume.age);

// // System.out.println(hume.getname() + " :" + hume.getage());

// System.out.println(hume.getname() + " :" + hume.getage());

//     }
// }




class a {
    public a() {
        System.out.println("In a constructor");
    }

}

class b extends a{
    public b() {
        System.out.println("In b constructor");
    }

    public b(int n){
        System.out.println("In b constructor with parameter " + n);
    }

}

public class c {


    public static void main(String[] args) {
// b obj = new b();
b obj = new b(5);

}
}

// every class in java extends  the class 

    // java.lang.Object is the parent class of every class in Java.

    // Every class in Java implicitly extends java.lang.Object class.

    // However, you can explicitly extend any other class by using the extends keyword.