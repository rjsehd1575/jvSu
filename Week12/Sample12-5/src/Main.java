void main() {
    class Book {
        String title;
        String author;
        int pages;
        float price;
    }

    Book[] books = new Book[]{new Book(), new Book()};
    books[0].title = "어서와, 자바는 처음이지";
    books[0].author = "천인국";
    books[0].pages = 350;
    books[0].price = 28_000.0f;

    books[1].title = "쉽게 배우는 자료구조";
    books[1].author = "윤병로";
    books[1].pages = 520;
    books[1].price = 35_000.0f;

    for (int i = 0; i < books.length; i++) {
        System.out.printf("%s \t\n저자 : %s\t\n페이지 수: %d 쪽\t\n가격: %.0f 원\n\n",
                books[i].title, books[i].author, books[i].pages, books[i].price);
    }
}