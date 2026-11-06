void main() throws IOException {
    Scanner input = new Scanner(System.in);

    final int START = 1;
    final int END = 100;
    int total = 0;
    int first, last;
    char answer;
    String result = "";

//*******************************
    for (int i = START; i <= END; i++) {
        total += i;
    }
    System.out.printf("%d + %d + ...... + %d + %d = %d", START, START + 1, END - 1, END, total);
    System.out.println();
//*******************************
    total = 0;
    while(true) {
        while (true) {
            System.out.print("어디부터 시작할까요? ");
            first = input.nextInt();

            System.out.print("어디까지 더할까요? ");
            last = input.nextInt();
            if (first <= last) break;
            else {
                System.err.printf("시작 값(%d)는 경로 값(%d)보다 작거나 같아야함.\n", first, last);
                System.in.read();
            }
        }

        for (int j = first; j <= last; j++) {
            total += j;
        }
        if (first == last) {
            System.out.printf("%d = %d\n", first, total);
        } else if (last - first <= 3) {
            if
            (last - first == 1) result = String.format("%d + %d = %d\n", first, last, total);
            else if
            (last - first == 2) result = String.format("%d + %d + %d = %d\n", first, first + 1, last, total);
            else
                result = String.format("%d + %d + %d + %d = %d", first, first + 1, last - 1, last, total);
        } else result = String.format("%d + %d + ...... + %d + %d = %d", first, first + 1, last - 1, last, total);
        System.out.println(result);
        System.out.print("계속 할까요 (Y/N) ? ");
        input.nextLine();
        answer = input.nextLine().charAt(0);
        if(answer == 'N'|| answer == 'n') break;

    }
}
