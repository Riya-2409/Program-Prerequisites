import java.util.*;
class PowerCalculation{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double x = sc.nextDouble();
double n = sc.nextDoule();
double result = Math.pow(x, n);
System.out.printf("%.2f raised to the power of %.2f is: %.2f%n", x, n, result);
}
} 
