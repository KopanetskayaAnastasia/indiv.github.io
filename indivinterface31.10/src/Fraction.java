public class Fraction implements Pair{
    int x;
    int y;
    Fraction(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void difference(int x,int y) {
        if (this.y==y)
            System.out.println("Difference: Numerator: "+(this.x-x)+" Denominator: "+this.y);
        else{
            int y1=this.y*y;
            int a=this.x*y;
            int b=x*this.y;
            int x1=Math.abs(a-b);
            if (x1%y1==0)
                System.out.println("Difference: Numerator: "+x1/y1+" Denominator: 1");
            else System.out.println("Difference: Numerator: "+x1+" Denominator: "+y1);
        }
    }
    public void multiplication(int x,int y) {
        int x1=this.x*x;
        int y1=y*this.y;
        if (x1%y1==0)
            System.out.println("Multiplication: Numerator: "+x1/y1+" Denominator: 1");
        else System.out.println("Multiplication: Numerator: "+x1+" Denominator: "+y1);
    }
    public void sum(int x,int y) {
        if (this.y==y) {
            if ((this.x + x) % y == 0)
                System.out.println("Sum: Numerator: " + (this.x + x) % y + " Denominator: 1");
            else System.out.println("Sum: Numerator: " + (this.x + x) + " Denominator: " + this.y);
        }
        else{
            int y1=this.y*y;
            int a=this.x*y;
            int b=x*this.y;
            int x1=Math.abs(a+b);
            if (x1%y1==0)
                System.out.println("Sum: Numerator: "+x1/y1+" Denominator: 1");
            else System.out.println("Sum: Numerator: "+x1+" Denominator: "+y1);
        }
    }
    public void division(int x,int y) {
        System.out.println("Consider division as multiplication by inverting a fraction: ");
        this.multiplication(y,x);
    }
}
