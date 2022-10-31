public class Date {
    int d,m,y;
    Date(int d,int m,int y) throws MyException{
        if (d>31 || m>12 || y<0||d<0||m<0) throw new MyException("Incorrent date",d,m,y);
        this.d = d;
        this.m = m;
        this.y = y;
    }
    void printDate(){
        System.out.println("Day: "+d+" Month: "+m+" Year: "+y);
    }
    Date sum(int d)throws MyException{
        int d1=this.d+d;
        int m1=m;
        int y1=y;
        while(d1>31){
            d1-=31;
            m1+=1;
        }
        while(m1>12){
            m1-=12;
            y1+=1;
        }
        return new Date(d1,m1,y1);
    }
    void number(){
        System.out.println("Number of date: "+(m*31+d));
    }
}
