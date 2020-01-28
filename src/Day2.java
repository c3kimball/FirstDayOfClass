import java.util.Scanner;

public class Day2 {
    public static void main(String[] args){
        var reader = new Scanner(System.in);
        System.out.print("What's your name: ");
        var name = reader.nextLine();
        System.out.println("Hello " + name);
    }
}
