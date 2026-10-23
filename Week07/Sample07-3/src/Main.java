void main() {
    Scanner input = new Scanner(System.in);

    int score;
    String result;

    System.out.print("정수 입력(0~100) : ");
    score = input.nextInt();

//    if(score >= 90){
//        result = "A학점 취득 성공";
//    }else{
//        result = "A학점 취득 실패.";
//    }
//    result += "\n감사합니다.";
//    if(!(score >= 0 && score <= 100)){
//        result = "ERROR: 점수는 0~100 사이만 입력.";
//    }

    if(score >= 0 && score <= 100){
        switch(score/90){
            case 0: result = "A학점 취득 실패.";
                break;
            case 1: result = "A학점 취득 성공";
            break;
            default: result = "";
        }
        result += "\n감사합니다.";
    }else
        result = "ERROR: 점수는 0~100 사이만 입력.";

    System.out.print(result);
}