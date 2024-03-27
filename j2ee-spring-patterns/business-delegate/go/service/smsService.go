package service

import "fmt"

type SMSService struct{}

func (s SMSService) SendMessage() error {
	fmt.Println("sending an SMS message.")
	return nil
}
