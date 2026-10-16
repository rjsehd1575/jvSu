static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int width;
    int height;
    int area;
    char type;

    System.out.print("사각형의 가로 길이 입력(예: 5): ");
    width = input.nextInt();
    System.out.print("사각형의 세로 길이 입력(예: 5): ");
    height = input.nextInt();

    type = (width == height) ? '정':'직';
    area = width*height;

    System.out.printf("*****%c사각형의 넓이*****\n",type);
    System.out.printf("\t\t가로 길이 : %,d Cm\n",width);
    System.out.printf("\t\t세로 길이 : %,d Cm\n",height);
    System.out.printf("\t\t넓   이 : %,d \u33a0 \n",area);
}