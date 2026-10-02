void main() {
    int a;
    int b;
    Scanner input = new Scanner(System.in);

    System.out.print("분자 입력: ");
    a = input.nextInt();

    System.out.print("분모 입력: ");
    b = input.nextInt();

    System.out.printf("%d를 %d로나누면몫= %d, 나머지= %d이다.", a, b, a / b, a % b);
    System.out.printf("%d를 %d로나누면= %.1f이다.\n", a, b, (float) a / b);
}