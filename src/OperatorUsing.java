import java.util.Scanner;

public class OperatorUsing {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner showScreen = new Scanner(System.in);

        System.out.print("Enter width : ");
        width = showScreen.nextFloat();

        System.out.print("Enter height : ");
        height = showScreen.nextFloat();

        float Area = width * height;
        System.out.print("Area is : " + Area);
    }
}
