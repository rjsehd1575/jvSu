
void main() {
    Scanner keyboard = new Scanner(System.in);
    final double pi = 3.141592;
    int radius = 0;
    double area =0;

    System.out.print("원의 반지름 입력(정수형) : ");
    radius = keyboard.nextInt();

    area = pi *radius * radius;

    System.out.printf("원의 반지름 : %,d Cm, 면적 :%,.2f \u33a0 \n",radius, area);
}
