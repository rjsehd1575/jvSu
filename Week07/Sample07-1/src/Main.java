void main() {
    Scanner input = new Scanner(System.in);
    int num;
    String result;
    char result1;
    String result2;
    String result3;
    String result4;
    char result5;
    String result2_1;

    System.out.print("양의 정수 입력: ");
    num = input.nextInt();

    if (num % 2 == 0) {
        result2 = String.format("%d는 짝수입니다.", num);
        result = "짝";
        result1 = '짝';
    } else {
        result2 = String.format("%d는 홀수입니다.", num);
        result = "홀";
        result1 = '홀';
    }

    switch (num % 2){
        case 0: result2_1 ="짝";
        break;
        case 1: result2_1 = "홀";
        break;
        default: result2_1 = "";
    }

    result3 = (num % 2 == 0) ? String.format("%d는 짝수입니다.\n", num) : String.format("%d는 홀수입니다.\n", num);
    result4 = (num % 2 == 0) ? "짝" : "홀";
    result5 = (num % 2 == 0) ? '짝' : '홀';

    System.out.printf("%d는 %s수입니다.\n", num, result);
    System.out.printf("%d는 %c수입니다.\n", num, result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result2_1);
}