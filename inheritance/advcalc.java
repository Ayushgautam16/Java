package inheritance;
public class advcalc extends calc {


    public  int multi(int n1, int n2){
        return n1*n2;

    }
    public  double div(int n1, int n2){
        if(n2==0)
            throw new IllegalArgumentException("Cannot divide by zero");
        return (double)n1/n2;
    }
}
