package main

import (
	"mvc/controller"
	"mvc/model"
	"mvc/view"
)

func main() {
	ctrl := controller.BookController{
		Book: model.Book{
			ID:     10,
			Title:  "Dune",
			Author: "Frank Herbert",
		},
		View: view.BookView{},
	}
	ctrl.UpdateView()

	ctrl.SetTitle("Dune 2")
	ctrl.UpdateView()

	ctrl.SetAuthor("Frank Herbert Jr.")
	ctrl.UpdateView()

}
