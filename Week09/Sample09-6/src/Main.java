void main() {
    final int START = 1;
    final int TARGET = 200000000;
    int total = 0;
    int today = 1;

    for (int i = START; ; i *= 2){
        total += i;

        System.out.printf("오늘의 저축 금액 = %9d원, %3d 일 = %11d원\n");
        if(total >= TARGET) break;
    }
}
