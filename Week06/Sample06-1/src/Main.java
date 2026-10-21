void main() {
    Scanner input = new Scanner(System.in);

    final int HEART = 65;   //1분당 심장 박동 수
    int age;

    System.out.print("몇 년동안 살았나요 : ");
    age = input.nextInt();

    long count = (long) (((age * 365L) * 24) * 60) * HEART;

    System.out.printf("사람은 평균 분당 %d회 심장이 박동한다\n", HEART);
    System.out.printf("심장은 %d년동안 %,d회 박동합니다.\n", age, count);
}