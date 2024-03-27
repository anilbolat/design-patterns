import BookView
from Book import Book
from BookController import BookController

if __name__ == '__main__':
    book = Book(ID=1, name='Dune', author='Frank')
    book_view = BookView
    controller = BookController(book=book, view=book_view)

    controller.update_view(book)

    controller.set_name(book_name="Dune2")
    controller.update_view(book)

