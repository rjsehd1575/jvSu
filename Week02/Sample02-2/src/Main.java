void main() {
    Scanner keyboard = new Scanner(System.in);
    String name = "";
    int age = 0;

    // 입력
    System.out.print("INPUT UR NAME : ");
    name = keyboard.nextLine();

    System.out.print("INPUT UR AGE : ");
    age = keyboard.nextInt();

    // 처리
    name = "홍길동";

    // 출력
    System.out.printf("NAME %s , AGE %d \n", name, age);
}