import java.util.*;
class VolumeOfCylinder{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double rad = sc.nextDouble();
double height = sc.nextDouble();
double volume = 3.14 * rad*rad * height;

System.out.println("Volume of Cylinder is = "+volume);
}
}