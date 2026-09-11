//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {

    Scanner key = new Scanner(System.in);
    String name = " ";
    int age = 0;
    float height = 0;
    double weight = 0.0;

    System.out.print("name : ");
    name = key.nextLine();

    System.out.printf("%s age : ", name);
    age = key.nextInt();

    System.out.printf("%s height : ", name);
    height = key.nextFloat();

    System.out.printf("%s weight : ", name);
    weight = key.nextDouble();

    System.out.printf("Name : %s\n Age : %d\n Height : %.1f cm\n Weight : %.2f kg",
            name, age, height, weight);

}
