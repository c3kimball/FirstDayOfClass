import java.util.Scanner;

public class DemoClass {
    public static void main(String[] args){
        var reader = new Scanner(System.in);
        System.out.print("What's your name: ");
        var name = reader.nextLine();
        System.out.println("Hello " + name);
    }
}
