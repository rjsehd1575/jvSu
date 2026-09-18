void main() {
    String kor = "대한민국";
    String capital = "서울특별시";
    int size = 99538;
    int pop = 10373234;

    System.out.printf("우리나라는 %s입니다.\n",kor);
    System.out.printf("%s의 수도 : %s\n",kor, capital);
    System.out.printf("%s의 면적 : %,d\u33a0\n",kor, size);
    System.out.printf("%s의 인구 : %,d명\n",capital,pop);
}