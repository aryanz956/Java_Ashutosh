import java.util.*;

class Triangle{
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println ("Enter side-1 , side-2, side-3 ");
double side1 = sc.nextDouble();
double side2 = sc.nextDouble();
double side3 = sc.nextDouble();
if(side1<0||side2<0||side3<0)
{    
System.out.println("Invalid side input given, please give all sides in +ve numbers");
}
else{
if(side1+side2>side3&&side2+side3>side1&&side1+side3>side2){
double s = (side1+side2+side3)/2;
double area = s*(s-side1)*(s-side2)*(s-side3);
System.out.println("Area of triangle is " + Math.sqrt(area)+" m^2 ");
 }
 else{
    System.out.println("invalid side input,these sides can't form a triangle ");
 }

}
}
}