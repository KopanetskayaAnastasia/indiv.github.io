public class Money implements Pair{
    int rub;
    int kop;
    Money(int x,int y){
        rub=x+y/100;
        kop=y%100;
    }
    public void difference(int r,int k) {
        int k1= rub*100+kop;
        int k2= r*100+k;
        System.out.println("Difference: rub="+Math.abs(k1-k2)/100+" kop="+Math.abs(k1-k2)%100);
    }
    public void multiplication(int r,int k) {
        double r1= rub+(double)kop/100;
        double r2= r+(double)k/100;
        System.out.println("At the rate you have: "+r1*r2+" some kind of currency");
    }
    public void sum(int r,int k) {
        int k1=k+r*100+kop+rub*100;
        System.out.println("Sum: rub="+k1/100+" kop="+k1%100);
    }
    public void division(int r,int k) {
        int k1= rub*100+kop;
        int k2= r*100+k;
        System.out.println("At the rate you have: "+(double) k1/k2+" some kind of currency");
    }
}
