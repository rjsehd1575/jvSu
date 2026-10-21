void main() {
    final int RADIUS = 6378;
    final float PI = 3.141592f;
    final int KOREA = 100505;

    double surface = 4 * PI * RADIUS * RADIUS;

    double ratio = KOREA / surface;

    System.out.printf("지구의 표면적 : %,.0f ㎢\n", surface);
    System.out.printf("대한민국 영토 : %,d ㎢는 지구의 %f %%임\n", KOREA, ratio);
}