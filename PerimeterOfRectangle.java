import java.util.*;
class PerimeterOfRectangle{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double length = sc.nextDouble();
double width = sc.nextDouble();
double Perimeter = 2 * (length + width);
System.out.println("perimeter of Rectangle is = "+Perimeter);
}
}