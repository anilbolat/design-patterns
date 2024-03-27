class BookController:
    def __init__(self, book, view):
        self.book = book
        self.view = view

    def update_view(self, book):
        self.view.print_book(book)

    def set_name(self, book_name):
        self.book.name = book_name

    def set_author(self, book_author):
        self.book.author = book_author
