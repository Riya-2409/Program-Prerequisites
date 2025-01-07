import java.util.*;
public class Main{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double celsius = sc.nextDouble();
double farhr = (celsius * 9/5) + 32;
System.out.println("Temperature is =" +farhr);
}
}