void main() throws IOException {
    Scanner input = new Scanner(System.in);
    int radius;
    double area;

    while(true) {
        System.out.print("원의 반지름 입력: ");
        radius = input.nextInt();
        if(radius <= 0){
            System.err.print("ERROR");
            System.in.read();
        }else break;
    }
    area = Math.PI * radius * radius;

    System.out.printf("원의 반지름 = %,d cm\n", radius);
    System.out.printf("원의 면적 = %,.2f\u33a0\n", area);
}