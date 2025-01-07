import java.util.*;
class CalculateSimpleInterest{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double principal = sc.nextDouble();
double rate = sc.nextDouble();
double time = sc.nextDouble();
double SimpleInterest = (principal * rate * time) / 100;
System.out.println("Simple Interest is = "+SimpleInterest);
}
}