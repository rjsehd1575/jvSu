void main() {
    final int TITLE = 0;
    final int AUTHOR = 1;
    String[][] books = new String[][]{{"어서와, 자바는 처음이지", "천인국"}, {"쉽게 배우는 자료구조", "문병로"}};
    int[] pages = new int[]{350, 520};
    float[] price = new float[]{28_000.0f, 35_000.0f};

    for (int i = 0; i < books.length; i++) {
        System.out.printf("%s \t\n저자 : %s\t\n페이지 수: %d 쪽\t\n가격: %.0f 원\n\n",
                books[i][TITLE], books[i][AUTHOR], pages[i], price[i]);
    }
}
