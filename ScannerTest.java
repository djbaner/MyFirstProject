import java.util.Scanner;                       //java --> package ; util --> subpackage ; Scanner --> class
class ScannerTest {                             //creating a class with name ScannerTest 
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);    //object Sc created for class Scanner ; System is the class(subclass/utility) with 'in' as the property to be utilised  
        System.out.println("Enter Roll No :");  
        int Rollno = Sc.nextInt();              //to read next int into the object 'Sc' in the variable 'Rollno'
        System.out.println("Enter Name :");
        String name = Sc.next();                //for string as default input
        System.out.println("Enter Fee :");
        Double fee = Sc.nextDouble();           //to read double
        Sc.close();                             //close the scanner object
    }
}  