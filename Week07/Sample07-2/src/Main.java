void main() {
    Scanner input = new Scanner(System.in);
    int num1;
    int num2;
    float result1;
    String message;

    System.out.print("분자 입력: ");
    num1= input.nextInt();
    System.out.print("분모 입력: ");
    num2= input.nextInt();

    result1 = (float) num1 / num2;
    if(num2==0){
        message = "계산할 수 없음!";
    }else{
        message = String.format("%d / %d = %.2f\n", num1, num2, result1);
    }

    System.out.println(message);

}