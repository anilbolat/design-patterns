package service

import "fmt"

type PostService struct {
}

func (s *PostService) SendMessage() error {
	fmt.Println("sending a post.")
	return nil
}
