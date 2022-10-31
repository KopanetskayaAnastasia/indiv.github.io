import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date:");
        int d= sc.nextInt();
        int m=sc.nextInt();
        int y=sc.nextInt();
        try{
            Date date=new Date(d,m,y);
            date.printDate();
            date.number();
            System.out.println("Enter days for sum:");
            int q= sc.nextInt();
            Date date1=date.sum(q);
        }
        catch(MyException e){
            System.out.println(e.getMessage()+" "+e.getDate());
        }
    }
}
