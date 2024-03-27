package delegate

import (
	"business-delegate/model"
	"business-delegate/service"
)

type MessageDelegate struct {
	service       service.MessageService
	lookupService service.MessageLookupService
}

func (md MessageDelegate) SendMessage(messageType model.MessageType) {
	md.service = md.lookupService.GetMessageService(messageType)
	md.service.SendMessage()
}
