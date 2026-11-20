void main(){
    class Book {
        String title;
        String author;
        int pages;
        float price;

        public Book(String title, String author, int pages, float price) {
            this.title = title;
            this.author = author;
            this.pages = pages;
            this.price = price;
        }
    }

    Book[] books = new Book[]{new Book("어서와, 자바는 처음이지", "천인국", 350, 28_000.0f),
            new Book("쉽게 배우는 자료구조", "윤병로", 520, 35_000.0f)};

    for (int i = 0; i < books.length; i++) {
        System.out.printf("%s \t\n저자 : %s\t\n페이지 수: %d 쪽\t\n가격: %.0f 원\n\n",
                books[i].title, books[i].author, books[i].pages, books[i].price);
    }
}