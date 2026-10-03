/* Question
1a) Data Types:

Write a Java program to store and display the following details of a household:

Number of family members – integer
Water consumed in litres – decimal value
House number – integer
Water usage status – character
Use appropriate Java data types for each value and display all the details.*/

//Answer
import java.util.Scanner;
public class HouseHold {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int familyMembers;
double waterConsumed;
int houseNumber;
char usageStatus;

System.out.print("Enter number of family members: ");
familyMembers = sc.nextInt();

 System.out.print("Enter water consumed in litres: ");
 waterConsumed = sc.nextDouble();

 System.out.print("Enter house number: ");
 houseNumber = sc.nextInt();

 System.out.print("Enter water usage status (H/L): ");
 usageStatus = sc.next().charAt(0);

 System.out.println("\n--- Household Details ---");
 System.out.println("Family Members: " + familyMembers);
 System.out.println("Water Consumed: " + waterConsumed + " litres");
 System.out.println("House Number: " + houseNumber);
 System.out.println("Water Usage Status: " + usageStatus);
    }
}