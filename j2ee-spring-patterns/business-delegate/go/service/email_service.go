package service

import "fmt"

type EmailService struct{}

func (s *EmailService) SendMessage() error {
	fmt.Println("sending an email.")
	return nil
}
