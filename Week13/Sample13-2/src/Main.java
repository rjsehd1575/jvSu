int readData() throws IOException {
    Scanner input = new Scanner(System.in);
    int radius;
    double area;

    while(true) {
        try {
            System.out.print("원의 반지름 입력: ");
            radius = input.nextInt();

            if (radius <= 0) {
                System.err.print("ERROR: 양수 입력");
                System.in.read();
            } else break;
        }catch(InputMismatchException e) {
            input.nextLine();
            System.err.print("ERROR: 숫자 입력");
            System.in.read();
        }
    }
    return radius;
}

double calcArea(int r){
    return Math.PI * r * r;
}

void display(String message, int value){
    System.out.printf("%s = %,d Cm\n", message, value);
}

void display(String message, double value){
    System.out.printf("%s = %,.2f \u33a0\n", message, value);
}

void main() throws IOException {
    int radius;
    double area;

    radius = readData();

    area = calcArea(radius);
    display("원의 반지름", radius);
    display("원의 면적", area);
}