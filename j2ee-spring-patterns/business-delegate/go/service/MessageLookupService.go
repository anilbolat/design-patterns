package service

import (
	"business-delegate/model"
)

type MessageLookupService struct {
}

func (mls MessageLookupService) GetMessageService(messageType model.MessageType) MessageService {
	switch messageType {
	case model.SMS:
		return SMSService{}
	case model.EMAIL:
		return EmailService{}
	case model.POST:
		return PostService{}
	default:
		return nil
	}
}
