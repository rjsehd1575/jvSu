void main() {
    float exchange;
    int money;
    double dollar;

    Scanner sc = new Scanner(System.in);

    System.out.print("달러에 대한 원화 환율을 입력:");
    exchange = sc.nextFloat();
    System.out.print("원화 금액을 입력:");
    money = sc.nextInt();

    dollar = money / exchange;

    System.out.printf("원화(\u20a9) %,d원은 %,.2f 달러(\u0024) 입니다.",money, dollar);

}