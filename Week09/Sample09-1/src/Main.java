void main() {
    Scanner input = new Scanner(System.in);
    char answer;
    String result = "";
    final int SIZE = 30;

    for (int i = 1; i <= SIZE; i++) {

        System.out.printf("%d번 학생 출석 (Y/N) ? ", i);
        answer = input.nextLine().charAt(0);

        result = (answer == 'Y' || answer == 'y') ? "출석" : "결석";

        System.out.printf("%d번 학생 -> %s\n", i, result);
    }

    int j = 1;
    while (j <= SIZE) {

        System.out.printf("%d 번 학생 출석 (Y/N) ? ", j);
        answer = input.nextLine().charAt(0);

        result = (answer == 'Y' || answer == 'y') ? "출석" : "결석";

        System.out.printf("%d번 학생 -> %s\n", j++, result);
    }

    int k = 1;
    do {

        System.out.printf("%d번 학생 출석 (Y/N) ? ", k);
        answer = input.nextLine().charAt(0);

        result = (answer == 'Y' || answer == 'y') ? "출석" : "결석";

        System.out.printf("%d번 학생 -> %s\n", k++, result);
    } while(k <= SIZE);

}