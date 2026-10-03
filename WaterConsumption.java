/* 1c) Methods:

Write a Java program to calculate the total water consumption of a household using a method.

Create the following method:

calculateTotal(int morningUsage, int eveningUsage)
The method should return the total water consumption. Read the morning and evening water usage from the user, call the method, and display the total consumption*/

//Answer
import java.util.Scanner;
public class WaterConsumption {
static int calculateTotal(int morningUsage, int eveningUsage) {
 return morningUsage + eveningUsage;
 }
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
System.out.print("Enter morning water usage: ");
int morningUsage = sc.nextInt();
 System.out.print("Enter evening water usage: ");
 int eveningUsage = sc.nextInt();
 int total = calculateTotal(morningUsage, eveningUsage);
 System.out.println("Total water consumption: " + total + " litres");
    }
}