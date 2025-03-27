// class calculator {
//     public int add(int n1, int n2){
//          return  n1 + n2;
//     }
// }

// public class demo{
//     public static void main(String[] args){
//         calculator cal = new calculator();
//         int sum = cal.add(5, 10);
//         System.out.println("Sum: " + sum);
//     }
// }


// ********method overloading is the process in which we have diffrent parameter but same 
// import java.util.Scanner;
// import java.util.List;
// class demo{
   

// public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the value you wanted to enter: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n < 18) {
            System.out.println("You are not allowed to drive");
        }
        else if(n >= 18 && n <= 45) {
            System.out.println("You are fit and fine to drive");
        }
        else if(n >= 46 && n < 60) {
            System.out.println("You are aged now");
        }
        else {
            System.out.println("Jao araam karo ab");
        }
    }
}
}