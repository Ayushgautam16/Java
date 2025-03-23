public class abstract2 {
    public static void main(String[] args) {
        System.out.println("abstract");

        tar c1 = new tar();
        c1.start();
        c1.stop();
        c1.accelerate();
// abstract difined as 
// abstract is a non-access modifier in java applicable for classes, methods but not variables.
// abstract keyword is used to provide some abstraction.
// abstract class: A class that is declared as abstract is known as an abstract class.
// abstract method: A method that is declared as abstract and does not have implementation is known as an abstract method.
// abstract class can have abstract and non-abstract (concrete) methods.
// abstract class can have constructors and static methods also.


    }
    abstract class vehicle{
        abstract void start();
        abstract void stop();
        abstract void accelerate();
    }
    class tar extends vehicle{
        void start(){
            System.out.println("Car is starting");
        }
        void stop(){
            System.out.println("Car is stopping");
        }
        void accelerate(){
            System.out.println("Car is accelerating");
        }
    }
}
