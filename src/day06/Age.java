package day06;
public class Age {
    public String personAge(int age){
        return (age<13) ?("Kid")
                :(age > 19)?("Adult"):"Teen";
    }
}
