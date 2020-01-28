import java.util.Scanner;

public class DemoClass {
    public static void main(String[] args){
        var reader = new Scanner(System.in);
        System.out.print("How old are you: ");
        var age = reader.nextFloat();
        var dogyears = age * 7;
        System.out.println("Wow you are " + age + " that is " + dogyears + " in dogyears.");
    }
}
