package getuserinfo;
import java.util.Scanner;
public class GetUserInfo
{
    public static void main(String[] args)
    {
        String name;
        int age;
        Scanner inputDevice = new Scanner(System.in);//Create Scanner Object
        System.out.print("Please enter you name >> ");// Ask for name 
        name =inputDevice.nextLine();//Keyboard input for name
        System.out.print("Please enter your age >> ");// Ask for age
        age = inputDevice.nextInt();// Keyboard input for age
        System.out.println("Your name is " + name +
                " and you are " + age + " years old.");// outputs Your name and age from Input
    }
}
