package inheritance;


// there is inherited class form with the name of calc.java

public class inheritance {
    public static void main(String[] args) {
        advcalc obj = new advcalc();
       int r1 = obj.add(5, 6);
        int r2 = obj.sub(4, 9);
        int r3 = obj.sub(4, 9);
        int r4 = obj.sub(4, 9);

        System.out.println(r1 + " " + r2);
        System.out.println(r3 + " " + r4);
    }
    
}
