package thirdpartylib

import (
	"adapter/thirdpartylib/model"
	"fmt"
)

type CoolMessageSender interface {
	SendCoolMessage(message model.Message)
}

type CoolMessageSenderImpl struct{}

func (coolSender *CoolMessageSenderImpl) SendCoolMessage(message model.Message) {
	fmt.Printf("Sending cool message: %s\n", message)
}
