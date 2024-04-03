package controller

import (
	"mvc/model"
	"mvc/view"
)

type BookController struct {
	Book model.Book
	View view.BookView
}

func (controller *BookController) SetTitle(name string) {
	controller.Book.Title = name
}

func (controller *BookController) SetAuthor(author string) {
	controller.Book.Author = author
}

func (controller *BookController) UpdateView() {
	controller.View.PrintBook(controller.Book)
}
