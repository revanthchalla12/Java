package day06;
public class Fibonacii {
    public void fibseries(int n){
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}
