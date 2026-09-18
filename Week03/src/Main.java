void main() {
    Scanner keyboard = new Scanner(System.in);
    int base;
    int reactangel_area;
    double radius;
    double circle_area;
    final double PI = 3.141592;
    double area;

    System.out.print("정사각형 한변의 길이 입력 : ");
    base = keyboard.nextInt();

    reactangel_area = base * base;
    radius = base / 2.0;
    circle_area = PI * radius * radius;
    area = reactangel_area - circle_area;

    System.out.printf("한 변의 길이: %,dCm인 정사각형의 면적은 %,d\u33a0\n",
            base, reactangel_area);
    System.out.printf("이 정사각형 내부 원의 반지름 : %,.2fCm \n면적 : %,.2f\u33a0\n",radius,circle_area);
    System.out.printf("구하려는 면적 : %,.2f\u33a0\n",area);

}