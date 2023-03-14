import java.util.Scanner; //Scanner is in the java.util package

public class ComputeAreaWithConsoleInput_2_2 {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");    //print方法不会讲光标移到下一行，println方法会将光标移到下一行
        double radius = input.nextDouble();  //从控制台获取输入

        //Compute area
        double area = radius * radius * 3.14159;

        //Display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
