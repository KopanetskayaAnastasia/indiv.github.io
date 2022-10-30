import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r,k;
      /* System.out.println("Enter count of money:");
        r=sc.nextInt();
        k=sc.nextInt();
        Money m=new Money(r,k);
        System.out.println("Enter count of other money:");
        r= sc.nextInt();
        k= sc.nextInt();
        Money m1 =new Money(r,k);
        System.out.println("Enter course of some currency:");
        r= sc.nextInt();
        k= sc.nextInt();
        Money course=new Money(r,k);
        System.out.println("If the exchange rate is in rubles - 1, No - 2");
        int c= sc.nextInt();
        if (c==1)
            m.division(course.rub, course.kop);
        else m.multiplication(course.rub, course.kop);
        m.difference(m1.rub, m1.kop);
        m.sum(m1.rub, m1.kop);*/

        System.out.println("Enter Fraction:");
        r= sc.nextInt();
        k= sc.nextInt();
        Fraction f=new Fraction(r,k);
        System.out.println("Enter other Fraction:");
        r= sc.nextInt();
        k= sc.nextInt();
        Fraction f1=new Fraction(r,k);
        f.sum(f1.x, f1.y);
        f.difference(f1.x, f1.y);
        f.multiplication(f1.x, f1.y);
        f.division(f1.x, f1.y);
    }
}
