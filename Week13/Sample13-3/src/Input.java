import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static int readData(String msg) throws IOException {
        Scanner input = new Scanner(System.in);
        int radius;
        double area;

        while(true) {
            try {
                System.out.printf("%s 입력: ",msg);
                radius = input.nextInt();

                if (radius <= 0) {
                    System.err.print("ERROR: 양수 입력");
                    System.in.read();
                } else break;
            }catch(InputMismatchException e) {
                input.nextLine();
                System.err.print("ERROR: 숫자 입력");
                System.in.read();
            }
        }
        return radius;
    }
}
