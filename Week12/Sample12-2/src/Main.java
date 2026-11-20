void main() {
    String[] title = new String[]{"어서와, 자바는 처음이지", "쉽게 배우는 자료구조"};
    String[] author = new String[]{"천인국", "윤병로"};
    int[] pages = new int[]{350, 520};
    float[] price = new float[]{28_000.0f, 35_000.0f};

    for (int i = 0; i < title.length; i++) {
        System.out.printf("%s \t\n저자 : %s\t\n페이지 수: %d 쪽\t\n가격: %.0f 원\n\n",
                title[i], author[i], pages[i], price[i]);
    }

}