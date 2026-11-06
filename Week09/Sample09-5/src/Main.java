void main() throws IOException {
    Scanner input = new Scanner(System.in);
    int start;
    int end;
    int odd = 0;
    int even = 0;
    char answer;

    do {
        while (true) {
            System.out.print("어디부터 더할까요? ");
            start = input.nextInt();

            System.out.printf("어디까지 더할까요? (최소값 : %d) ? ", start + 5);
            end = input.nextInt();

            if (end >= start + 5) break;
            else {
                System.err.println("ERROR. 입력 오류. ");
                System.in.read();
            }
        }

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        System.out.printf("%d + %d 까지의 합 = %,d\n", start, end, even + odd);
        System.out.printf("\t 홀수의 합 = %,d\n", odd);
        System.out.printf("\t 짝수의 합 = %,d\n", even);
        System.out.print("계속 할까요? ");
        input.nextLine();
        answer  = input.nextLine().charAt(0);
        if(answer == 'N' || answer == 'n') break;
    } while (true);
}
