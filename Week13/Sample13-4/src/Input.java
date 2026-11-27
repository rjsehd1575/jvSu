import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    protected int[] readData(int length) throws IOException {
        Scanner input = new Scanner(System.in);
        int[] score = new int[length];

        int count = 0;
        while(count < length) {
            try {
                System.out.printf("%s 성적 입력: ", Subject.values()[count]);
                score[count] = input.nextInt();

                if (score[count] <= 0 || score[count] > 100) {
                    System.err.print("ERROR: 0 ~ 100 사이 입력");
                    System.in.read();
                }else break;
            }catch(InputMismatchException e) {
                input.nextLine();
                System.err.print("ERROR: 숫자 입력");
                System.in.read();
            }
        }
        return score;
    }
}
