void main() {
    Scanner sc = new Scanner(System.in);
    int man1, man2;
    String res;
    String man1Re, man2Re;
    System.out.print("첫 번째 선수 입력(가위 = 1, 바위 = 2, 보 = 3) : ");
    man1 = sc.nextInt();
    System.out.print("두 번째 선수 입력(가위 = 1, 바위 = 2, 보 = 3) : ");
    man2 = sc.nextInt();

    if (man1 >= 1 && man1 <= 3) {
        if (man1 == 1)
            man1Re = "가위";
        else if (man1 == 2)
            man1Re = "바위";
        else
            man1Re = "보";
    } else man1Re = "";

    if (man2 >= 1 && man2 <= 3) {
        if (man2 == 1)
            man2Re = "가위";
        else if (man2 == 2)
            man2Re = "바위";
        else
            man2Re = "보";
    } else man2Re = "";

    if(!(man1Re.isEmpty() || man2Re.isEmpty())) {
        switch (man1 - 1) {
            case 0:
                res = String.format("man1(%s) 과 man2(%s)는 비겼습니다.", man1Re, man2Re);
                break;
            case -1:
            case 2:
                res = String.format("man1(%s) 과 man2(%s)는 man1이 승리.", man1Re, man2Re);
                break;
            case 1:
            case -2:
                res = String.format("man1(%s) 과 man2(%s)는 man2가 승리.", man1Re, man2Re);
                break;
            default:
                res = "ERROR2";
        }
    } else res = "ERROR1";
    System.out.println(res);
}