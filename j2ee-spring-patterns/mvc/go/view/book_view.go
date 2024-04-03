package view

import (
	"fmt"
	"mvc/model"
)

type BookView struct {
}

func (view BookView) PrintBook(book model.Book) {
	fmt.Println(book)
}
