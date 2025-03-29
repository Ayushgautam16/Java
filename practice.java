import java.util.*;

public class practice{
    public static void main(String[] args){
int count =0;

        Scanner sc = new Scanner(System.in)
        while(sc.hasNextLine()){
count ++;
String str = sc.nextLine();
System.out.println(count +" " +str);
        }
sc.close();
        
    }
}
