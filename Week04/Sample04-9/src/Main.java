void main() {
    int base;
    int height;
    Scanner input = new Scanner(System.in);
    double area;

    System.out.print("삼각형의 밑변은? ");
    base = input.nextInt();
    System.out.print("삼각형의 높이는? ");
    height = input.nextInt();

    area = (base * height) / 2.0;

    System.out.println("\n \t**** 삼각형의 넓이 구하기****\n");
    System.out.printf("\t\t밑변: %d Cm\n",base);
    System.out.printf("\t\t높이: %d Cm\n", height);
    System.out.printf("\n\t\t넓이: %,.2f\u33a0\n", area);
}