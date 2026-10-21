void main() {
    Scanner input = new Scanner(System.in);
    final int LIFE = 7;
    int year;
    int cig;
    final int PRICE = 4500;

    System.out.print("당신은 몇년간 담배를 피웠나요? ");
    year = input.nextInt();

    System.out.print("하루에 몇 개피를 피우니요 ?");
    cig = input.nextInt();

    int day = year * 365;
    int count = day * cig;
    int minute = count * LIFE;
    int hour = minute / 60;
    minute -= hour * 60;
    int day1 = hour / 24;
    hour -= day1 * 24;
    int year1 = day1 / 365;
    day1 -= year1 * 365;

    int gap = count / 20 + (count % 20 != 0 ? 1 : 0);
    int money = gap * PRICE;

    System.out.printf("담배 1개피를 피우면 수명이 %d분 단축 된다고 합니다.\n", LIFE);
    System.out.printf("%d년 동안 하루에 %d개피의 담배를 피우면, %d년 %d일 %d시간 %d분 수명이 단축됩니다.\n",
            year, cig, year1, day1, hour, minute);
    System.out.printf("%d년 동안 하루에 %d개피의 담배를 피우면, 담배 금액은 %,d원 입니다.\n",
            year, cig, money);
}