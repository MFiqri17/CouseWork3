import java.util.*;
public class ProcessAName5026201105 {
public static void main(String[] args){
Scanner inputUser = new Scanner(System.in);
String firstName,lastName,name,initialName;

System.out.print("input your first Name : ");
firstName = inputUser.next();

System.out.print("input your last Name : ");
lastName = inputUser.next();

initialName = firstName.substring(0,1);

name = lastName + ", " + initialName + ".";
System.out.println("Type your name : " + firstName + " " + lastName);
System.out.println("Your name is : " + lastName + ", " + initialName + ".");

}
}