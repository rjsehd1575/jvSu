void main() {
    class Book {
        String title;
        String author;
        int pages;
        float price;
    }

    Book book1 = new Book();
    book1.title = "어서와, 자바는 처음이지";
    book1.author = "천인국";
    book1.pages = 350;
    book1.price = 28_000.0f;

    Book book2 = new Book();
    book2.title = "쉽게 배우는 자료구조";
    book2.author = "윤병로";
    book2.pages = 520;
    book2.price = 35_000.0f;

    System.out.printf("%s \t\n저자 : %s\t\n페이지 수: %d 쪽\t\n가격: %.0f 원\n\n",
            book1.title, book1.author, book1.pages, book1.price);

    System.out.printf("%s \t\n저자 : %s\t\n페이지 수: %d 쪽\t\n가격: %.0f 원\n\n",
            book2.title, book2.author, book2.pages, book2.price);
}