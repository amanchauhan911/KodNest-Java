
class Book {
    int bookId;

    Book(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return this.bookId == book.bookId;
    }
}

